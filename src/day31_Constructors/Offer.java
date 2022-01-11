package day31_Constructors;

public class Offer {

    public String location,companyName,jobTitle;
    public double salary;
    public boolean hasBenefit,hasPTO,isWFH,isFullTime;

    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;


    }
    // setInfo genereted object has a different coppy. offer i silip void yaziyorsun ve setInfo yaziyorsun.saga tikla generatit sec
    // constrocto sec comment a ya bastiginda hepsini secer
    // toString icin saga tikla to string sec sonrada box i clikle


    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $ " + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
