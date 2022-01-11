package day32_Constructors;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        Car car2 = new Car("Infiniti","QX");

        Car car3 = new Car("Lexus","RX50");

        Car car4 = new Car("BMW","X6",2020,50000);

        Car car5 = new Car("Tesla","Model 3",2021,89000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }


}
/*
class name: Car
		 instance variables:
		 		make, model, year, price, color
 		1st constructor: initializes the make ONLY
 		2nd constructor: initializes make & model
 				(MUST use constructor call to set the make)
		3rd constructor: initializes make, model, year
				(MUST use constructor call to set the make, model)
		4th constructor: initializes make, model, year, price
				(MUST use constructor call to set the make, model, year)
		5th Constructor: intializes all the instances
				(MUST use constructor call to set the make, mode, year, price, color)
		instance methods: toString
 */
