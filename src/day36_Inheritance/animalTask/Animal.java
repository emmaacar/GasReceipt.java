package day36_Inheritance.animalTask;

public class Animal {

    public String name,breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name+"name is eating ");
    }

    public void drink(){
        System.out.println(name+"name is drinking ");
    }

    public void moving(){
        System.out.println(name+"is moving ");
    }

    public void sleeping(){
        System.out.println(name+"is sleeping ");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }




    /*
Animal:
		name, breed, gender, size, age, color
		setInfo(), eat(), drink(), move(), sleep(), toString()

     */
}
