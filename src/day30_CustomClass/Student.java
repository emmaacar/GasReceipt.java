package day30_CustomClass;

public class Student {



        public String name;
        public char gender;
        public String age;
        public String ID;
        public  char grade;

    public Student() {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public Student(String name, char gender, String age, String ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public  void setInfo(String name, char gender, String age, String ID, char grade){

            this.name=name;
            this.gender=gender;
            this.age =age;
            this.ID =ID;
            this.grade =grade;


        }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }
    public void code(){
        System.out.println(name +" is coding" );

    }
    public void sleep(){
        System.out.println(name+" is sleeping");

    }
}








