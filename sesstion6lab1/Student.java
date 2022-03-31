package sesstion6lab1;

import java.time.LocalDate;

public class Student {
    String id,name,adrress;
    LocalDate db;
    float gpa;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdrress() {
        return adrress;
    }
    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }
    public LocalDate getDateofbirth() {
        return db;
    }
    public void setDateofbirth(LocalDate db) {
        this.db = db;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Student(String id, String name,LocalDate db,String adrress,Float gpa){
        setId(id);
        setName(name);
        setDateofbirth(db);
        setAdrress(adrress);
        setGpa(gpa);
    }
}
