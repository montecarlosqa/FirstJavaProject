package UniversityProject;

public class School {

    private String name;
    private String address;

    public School(String name, String address){
            this.name = name;
            this.address = address;
    };

    public void setName(String name){
        this.name = name;
    };

    public void setAddress(String address){
        this.address = address;
    };

    public String getName(){
        return name;
    };

    public String getAddress(){
        return address;
    };

    public void isOpen(boolean isOpen){
        if(!isOpen){
            System.out.println("The school is closed");
        }else{
            System.out.println("The school is open");
        }
    };

    public String toString(){
        return "School: " + name + "\nAddress: " + address;
    };
}
