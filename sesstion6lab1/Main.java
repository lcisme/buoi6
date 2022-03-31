package session6lab1;

import sesstion6lab1.StudentList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentList stl = new StudentList();
        Scanner sc = new Scanner(System.in);
        int x;
        for (; ; ) {
            System.out.println("\nChoose the function you want");
            System.out.println("0. Exit nối này");
            System.out.println("1. Add student");
            System.out.println("2. Edit student by ID");
            System.out.println("3. Delete student by ID");
            System.out.println("4. Sort students by GPA");
            System.out.println("5. Sort students by name");
            System.out.println("6. Show student list");
            do {
                x = sc.nextInt();
            } while (x<0 || x>6);
            switch (x) {
                case 1: {
                    stl.addStudent();
                    break;
                }
                case 2: {
                    stl.editStudent();
                    break;
                }
                case 3: {
                    stl.deleteStudent();
                    break;
                }
                case 4: {
                    stl.sortGPA();
                    break;
                }
                case 5: {
                    stl.sortName();
                    break;
                }
                case 6: {
                    stl.showList();
                    break;
                }
                case 0: {
                    System.out.println("Exit");
                    return;
                }
            }
        }
    }
}
