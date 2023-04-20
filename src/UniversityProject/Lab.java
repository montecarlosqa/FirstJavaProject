package UniversityProject;

public class Lab {

    private int labId;
    private int inChargedId;
    private String labName;
    private int equipmentId;

    private boolean isOccupied;

    public Lab(int labId, int inChargedId, String labName, int equipmentId) {
        this.labId = labId;
        this.inChargedId = inChargedId;
        this.labName = labName;
        this.equipmentId = equipmentId;
    }

    ;

    public void setLabId(int labId) {
        this.labId = labId;
    }

    ;

    public void setInChargedIdId(int inChargedId) {
        this.inChargedId = inChargedId;
    }

    ;

    public void setLabName(String labName) {
        this.labName = labName;
    }

    ;

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    ;

    public int getLabId() {
        return labId;
    }

    ;

    public int getInChargedIdId() {
        return inChargedId;
    }

    ;

    public String getLabName() {
        return labName;
    }

    ;

    public int getEquipmentId() {
        return equipmentId;
    }

    ;

    public void isOccupied(boolean isOccupied) {
        if (!isOccupied) {
            System.out.println("The lab is unoccupied");
        } else {
            System.out.println("The lab is occupied");
        }
    };

    @Override
    public String toString() {
        return "Lab{" +
                "labId=" + labId +
                ", inChargedId=" + inChargedId +
                ", labName='" + labName + '\'' +
                ", equipmentId=" + equipmentId +
                '}';
    }
}
