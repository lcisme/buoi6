package sesstion6lab1;

import java.time.LocalDate;
import java.util.*;

public class StudentList {
    ArrayList<Student> stList = new ArrayList<>();

    public void addStudent(){
        Scanner abc = new Scanner(System.in);
        System.out.println("Edit id");
        String id = abc.nextLine();
        System.out.println("Edit name");
        String name = abc.nextLine();
        System.out.println("Edit date of birthday");
        LocalDate db = LocalDate.parse(abc.nextLine());
        System.out.println("Edit adrress");
        String adrress = abc.nextLine();
        System.out.println("Edit gpa");
        float gpa = abc.nextFloat();
        stList.add(new Student(id,name,db,adrress,gpa));
        System.out.println("Full thông tin sv: "+id+" "+name+" "+db+" "+adrress+" "+gpa);
        }

    public void editStudent(){
        Scanner abc = new Scanner(System.in);
        System.out.println("ID");
        String id = abc.nextLine();
        for (Student st:stList) {
            if (id.equals(st.getId())){
            System.out.println("Name ");
            st.setName(abc.nextLine());
            System.out.println("Birthday");
            st.setDateofbirth(LocalDate.parse(abc.nextLine()));
            System.out.println("Adrress");
            st.setAdrress(abc.nextLine());
            System.out.println("GPA");
            st.setGpa(abc.nextFloat());
            System.out.println("Student after Edit: "+st.id+" "+st.name+" "+st.db+" "+st.adrress+" "+st.gpa);
        }}

    }

    public void deleteStudent(){
        Scanner abc = new Scanner(System.in);
        String id = abc.nextLine();
        int idsv=0;
        boolean check=false;
        for (int i=0;i<=stList.size();i++){
                check=true;
                idsv=i;
                break;
        }
        if (check=true){
            stList.remove(idsv);
            System.out.println("Delete thành công ID "+id);
        }

    }

    public void sortGPA(){
        stList.sort(Comparator.comparing(Student::getGpa));
        for (Student st:stList) {
            System.out.println("Sắp xếp theo GPA "+st.id+" "+st.name+" "+st.db+" "+st.adrress+" "+st.gpa);
        }
    }

    public void sortName(){
        stList.sort(Comparator.comparing(Student::getName));
        for (Student st:stList) {
            System.out.println("Sắp xếp theo Name "+st.id+" "+st.name+" "+st.db+" "+st.adrress+" "+st.gpa);
        }
    }

    public void showList(){
        System.out.println("Student List");
            for (Student st:stList) {
        System.out.println(st.id+" "+st.name+" "+st.db+" "+st.adrress+" "+st.gpa);
    }
    }
    }


