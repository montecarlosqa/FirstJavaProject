package enums;

public enum Sports {
    BASKETBALL("Court"),
    VOLLEYBALL("Court"),
    BASEBALL("Field"),
    FOOTBALL("Field"),
    SWIMMING("Water"),
    TENNIS("Court"),
    TRACK_AND_FIELD("Field");

    private String classification;
    Sports(String classification){
        this.classification = classification;
    }

    public String getClassification(){
        return classification;
    }
}
