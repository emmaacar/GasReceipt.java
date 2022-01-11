package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {
        
        Offer offer1 = new Offer();

        offer1.setInfo("TX","Amazon","SDET",110000,true,true,true,true);
        
        Offer offer2 = new Offer();

        offer2.setInfo("VA","Facebook","QA",120000,true,true,true,true);

        Offer offer3 = new Offer();

        offer3.setInfo("Florida","Apple","QA",120000,true,true,true,true);

        Offer offer4 = new Offer();

        offer4.setInfo("WA","Bank of America","Developer",13000,true,true,false,true);


        Offer offer5 = new Offer();

        offer5.setInfo("TX","Capitol one","SM",15000,true,true,true,true);

        System.out.println("offer1 = " + offer1);
        System.out.println("offer2 = " + offer2);
        System.out.println("offer3 = " + offer3);
        System.out.println("offer4 = " + offer4);
        System.out.println("offer5 = " + offer5);

        System.out.println("---------------------------------------------------------------");

        Offer[]myOffers ={offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer>fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p ->!p.isFullTime);  //remove if the offer is NOT fullTime

        System.out.println( fullTimeOffers.size());

        ArrayList<Offer>localOffers =new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("VA")); // Remove the offer if the offer is not from local area
        localOffers.removeIf( p -> !( p.location.equals("VA") || p.location.equals("CA") ) ); // removes the offer if the offer is not from local are

        System.out.println("localOffers = " + localOffers);
        System.out.println(localOffers.size());


        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " : " +localOffer.salary);
        }

    }
    /*
2. Create a class named MyOffers:
				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */
}
