package UniversityProject;

public class LabEquipments extends Lab{

    private double costs;
    public LabEquipments(int labId, int inChargedId, String labName, int equipmentId, double costs){
        super(labId, inChargedId, labName, equipmentId);
        this.costs = costs;
    };

    public void setCosts(double costs){
        this.costs = costs;
    };
    public double getCosts(){
        return costs;
    };
    public String toString(){
        return "Costs: " + costs;
    };
}
