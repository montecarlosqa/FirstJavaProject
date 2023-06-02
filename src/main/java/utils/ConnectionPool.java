package utils;

import java.sql.Connection;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ConnectionPool {

    private final ConcurrentLinkedDeque<Connection> pool;
    private int maxSize;

    //Lazy initialization of the pool
    private static volatile ConnectionPool instance;

    private ConnectionPool(int maxSize){
        this.maxSize = maxSize;
        pool = new ConcurrentLinkedDeque<>();
    }

    public static ConnectionPool getInstance(int maxSize){
        if(instance == null){
            synchronized (ConnectionPool.class){
                if(instance == null){
                    instance = new ConnectionPool(maxSize);
                }
            }
        }
        return instance;
    }

    public Connection getConnection(){
        return pool.poll();
    }

    public void releaseConnection(Connection connection){
        pool.add(connection);
    }
}
