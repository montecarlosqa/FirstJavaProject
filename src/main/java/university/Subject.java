package university;

public class Subject {

    private String title;
    private int units;
    private float hoursPerWeek;

    public Subject(String title, int units, float hoursPerWeek){
        this.title = title;
        this.units = units;
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setTitle(){
        this.title = title;
    }

    public void setUnits(){
        this.units = units;
    }

    public void setHoursPerWeek(){
        this.hoursPerWeek = hoursPerWeek;
    }

    public String getTitle(){
        return title;
    }

    public int getUnits(){
        return units;
    }

    public float getHoursPerWeek(){
        return hoursPerWeek;
    }

    @Override
    public String toString() {
        return "Class{" +
                "title='" + title + '\'' +
                ", units=" + units +
                ", hoursPerWeek=" + hoursPerWeek +
                '}';
    }
}
