package day32_Constructors;

public class Carpet {

    public double width,length,unitePrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitePrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitePrice = unitePrice;
        this.isPersian = isPersian;
    }

    public  double calcCost(){
        double totalPrice =(width*length)*unitePrice;
        if (isPersian){
            totalPrice+=200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitePrice=$ " + unitePrice +
                ", isPersian=" + isPersian +
                ", totalPrice=$ " + calcCost() +
                '}';
    }
}
