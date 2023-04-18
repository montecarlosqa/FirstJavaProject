package OOPAssignment1;

public class Security extends Employee{

    private String rank;
    public Security(){
        super();
    };

    public Security(int id, String name, String address, double salary, String rank){
        super(id, name, address, salary);
        this.rank = rank;
    };

    @Override
    public String toString(){
        return "Security{"+ super.toString() + ", Rank: " + rank + "'}'";
    };

    public void setRank(String rank){
        this.rank = rank;
    };

    public String getRank(){
        return rank;
    };
}
