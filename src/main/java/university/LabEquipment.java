package university;

import exceptions.LabCostsException;

public class LabEquipment extends Lab implements Obtainable{

    private String equipmentName;
    private double costs;

    public LabEquipment(int labId, int inChargedId, String labName, int equipmentId, String equipmentName, double costs) throws LabCostsException{
        super(labId, inChargedId, labName, equipmentId);
        this.equipmentName = equipmentName;
        if(costs < 0){
            throw new LabCostsException("Lab costs must be greater than 0.");
        }else{
            this.costs = costs;
        }
    }

    public void setEquipmentName(String equipmentName){
        this.equipmentName = equipmentName;
    }

    public void setCosts(double costs) throws LabCostsException{
        if(costs < 0){
            throw new LabCostsException("Lab equipment costs must be greater than 0.");
        }else{
            this.costs = costs;
        }
    }

    public String getEquipmentName(){
        return equipmentName;
    }

    public double getCosts() {
        return costs;
    }

    @Override
    public void obtain(){
        System.out.println(getEquipmentName() + " was obtained");
    }

    @Override
    public String toString() {
        return "LabEquipment{" +
                "equipmentName='" + equipmentName + '\'' +
                ", costs=" + costs +
                '}';
    }
}
