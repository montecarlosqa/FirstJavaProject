package university;

import enums.SubjectUnits;

public class Subject {

    private String title;
    private SubjectUnits subjectUnit;

    public Subject(String title, SubjectUnits subjectUnit){
        this.title = title;
        this.subjectUnit = subjectUnit;
    }

    public void setTitle(){
        this.title = title;
    }

    public void setSubjectUnit(){
        this.subjectUnit = subjectUnit;
    }

    public String getTitle(){
        return title;
    }

    public SubjectUnits getSubjectUnit(){
        return subjectUnit;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "title='" + title + '\'' +
                ", subjectUnit=" + subjectUnit +
                '}';
    }
}
