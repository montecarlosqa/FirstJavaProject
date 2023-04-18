package OOPAssignment1;

public class Person {

    protected int id;
    protected String name;
    protected String address;

    public Person(){};

    public Person(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    };

    public String toString() {
        return "Name: " + name + ", Id: " + id +  ", Address: " + address;
    }
}
