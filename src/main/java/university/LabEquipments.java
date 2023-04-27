package university;

import exceptions.LabCostsException;

public class LabEquipments extends Lab {
    private double costs;

    public LabEquipments(int labId, int inChargedId, String labName, int equipmentId, double costs) throws LabCostsException{
        super(labId, inChargedId, labName, equipmentId);
        if(costs < 0){
            throw new LabCostsException("Lab costs must be greater than 0.");
        }else{
            this.costs = costs;
        }
    }

    public void setCosts(double costs) throws LabCostsException{
        if(costs < 0){
            throw new LabCostsException("Lab costs must be greater than 0.");
        }else{
            this.costs = costs;
        }
    }

    public double getCosts() {
        return costs;
    }

    @Override
    public String toString() {
        return "LabEquipments{" +
                "costs=" + costs +
                '}';
    }
}
