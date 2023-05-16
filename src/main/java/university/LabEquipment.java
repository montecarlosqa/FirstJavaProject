package university;

import exceptions.LabCostsException;

import java.util.Objects;

public class LabEquipment implements Obtainable{

    private int labEquipmentId;
    private String equipmentName;
    private double costs;

    public LabEquipment(int labEquipmentId, String equipmentName, double costs) throws LabCostsException{
        this.labEquipmentId = labEquipmentId;
        this.equipmentName = equipmentName;
        if(costs < 0){
            throw new LabCostsException("Lab costs must be greater than 0.");
        }else{
            this.costs = costs;
        }
    }

    public void setLabEquipmentId(int equipmentId){
        this.labEquipmentId = labEquipmentId;
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

    public int getLabEquipmentId(){
        return labEquipmentId;
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
                "labEquipmentId=" + labEquipmentId +
                ", equipmentName='" + equipmentName + '\'' +
                ", costs=" + costs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LabEquipment)) return false;
        LabEquipment that = (LabEquipment) o;
        return getLabEquipmentId() == that.getLabEquipmentId() && Double.compare(that.getCosts(), getCosts()) == 0 && Objects.equals(getEquipmentName(), that.getEquipmentName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLabEquipmentId(), getEquipmentName(), getCosts());
    }
}
