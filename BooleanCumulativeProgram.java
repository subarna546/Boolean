package cumulativeProgramming;

import java.util.Scanner;

public class BooleanCumulativeProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean hasMoney = false;
        boolean hasCreditCard = false;

        System.out.println("If you have money enter : (T/F) : ");
        hasMoney=sc.nextBoolean();

        System.out.println("If you have credit card :(T/F) :");
        hasCreditCard= sc.nextBoolean();

        if(hasMoney && hasCreditCard){
            System.out.println("Pay through card");
        } else if (!hasCreditCard && hasMoney) {
            System.out.println("Pay through cash");
        }
        else{
            System.out.println("sorry");
            System.out.println("you can't buy a things !!!");
        }

    }

}
