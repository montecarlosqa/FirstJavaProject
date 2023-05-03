package university;

import java.util.List;

public class Lab implements Accessible {
    private int labId;
    private int inChargedId;
    private String labName;
    private List<LabEquipment> labEquipment;

    public Lab(int labId, int inChargedId, String labName, List<LabEquipment> labEquipment) {
        this.labId = labId;
        this.inChargedId = inChargedId;
        this.labName = labName;
        this.labEquipment = labEquipment;
    };

    public void setLabId(int labId) {
        this.labId = labId;
    }

    public void setInChargedIdId(int inChargedId) {
        this.inChargedId = inChargedId;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public  void setLabEquipment(List<LabEquipment> labEquipment){
        this. labEquipment = labEquipment;
    }

    public int getLabId() {
        return labId;
    }

    public int getInChargedIdId() {
        return inChargedId;
    }

    public String getLabName() {
        return labName;
    }

    public List<LabEquipment> getLabEquipment(){
        return labEquipment;
    }


//    public void isOccupied(boolean isOccupied) {
//        if (!isOccupied) {
//            System.out.println("The lab is unoccupied");
//        } else {
//            System.out.println("The lab is occupied");
//        }
//    };

    @Override
    public void access(){
        System.out.println(labName + " is accessible");
    }

    @Override
    public String toString() {
        return "Lab{" +
                "labId=" + labId +
                ", inChargedId=" + inChargedId +
                ", labName='" + labName + '\'' +
                '}';
    }
}
