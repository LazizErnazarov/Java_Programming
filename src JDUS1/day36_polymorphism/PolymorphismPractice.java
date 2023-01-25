package day36_polymorphism;

import day30_inheritanceContinue.Nokia;
import day30_inheritanceContinue.Phone;
import day30_inheritanceContinue.Samsung;
import day30_inheritanceContinue.iPhone;

public class PolymorphismPractice {

    public static void main(String[] args) {

        //   iPhone phone = new Phone("iPhone 11 Pro", "Large", "Black", 900);

        //Phone phone =  new Samsung("Galaxy S19", "Medium", "Pink", 700);


        Phone[] phones = {
                new iPhone("iPhone 11 Pro", "Large", "Black", 900),
                new iPhone("iPhone 12 Pro Max", "Large", "Black", 1200),
                new iPhone("iPhone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new iPhone("iPhone 12 Pro", "Large", "Black", 1200),
                new iPhone("iPhone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new iPhone("iPhone 6", "Smalle", "Gold", 400),
                new iPhone("iPhone 7", "Smalle", "White", 500)
        };


        // model - color - price
        for(Phone eachPhone : phones){
            System.out.println(eachPhone.getModel() +" - "+eachPhone.getColor() +" - "+ eachPhone.getPrice());
        }

        System.out.println("---------------------------------------------------------");

        int countiPhone = 0;
        int countSamsung = 0;

        for (Phone each : phones) {

            if(each instanceof iPhone){ // if the phone is iPhone
                countiPhone++;
            }

            if(each instanceof Samsung){ // if the phone is samsung
                countSamsung++;
            }

        }

        System.out.println(countiPhone);
        System.out.println(countSamsung);


        System.out.println("---------------------------------------------------------");

        for (Phone each : phones) {
            if( each instanceof iPhone || each instanceof Samsung){ // if the phone is iPhone or samsung
                if(each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }


        // ==,  .equals()

    }
}
/*
Print the model, color and price of each phone object in the following format
    				model - color - price
	2. How many iPhones in the array of phones?
	3. How many Samsungs in the array of phones?
	4. Display the models of iPhones and samsung that has the price of 700 or greater
 */