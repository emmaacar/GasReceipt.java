package day31_Constructors;

public class Student {

    public String name;
    public  int age;
    public char gender;
    public char grade;
    public int ID;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", ID=" + ID +
                '}';
    }
            // tekrar saga tikla generate toString tikla ve unbox it
    public Student(String name, int age, char gender, char grade, int ID) { // right click generate and constroctor hepsini sec (COMMENT A basarak)
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.ID = ID;


    }
}
