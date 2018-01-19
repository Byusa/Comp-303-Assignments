/*File Name: pinMain.java
Developers: <<Serge Jabo Byusa>>
Purpose: <<This program update the pin of the user>>
Inputs: <<None>> <<or, describe each one, files, user, ...>>
Outputs: <<None>> <<ditto>>
Modifications
==========
<<initial>> <<date>> <<one line descr*/
package comp303miniass1;

import java.util.Scanner;
/**
 * @author serge
 */
public class Comp303MiniAss1 {
    //This method will check if the inputed pin  is a valid pin
    //It takes input as string and returns a boolean true/false if its a valid pin or not respectively
    public static boolean inputValidation(String pin) {
        return false;
    }
    //The method will call inputValidation() then update the new pin
    //It does not return it only calls inputValidation() and it is called in main function
    public static void Updatepin() {
        int Initialpin = 00, oldpin, Newpin, inputSize;
        String input = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your old pin:");
        input = sc.nextLine();
        //oldpin = sc.nextInt();
        oldpin = Integer.parseInt(input);

        while ((Initialpin != oldpin)) {
            System.out.println("That is not your old pin.");
            System.out.println("Please input your old pin:");
            oldpin = sc.nextInt();
        }

        System.out.println("Old pin confirmed.");
        System.out.println("Please input your new pin:");
        input = sc.nextLine();
        inputSize = input.length();
        Newpin = Integer.parseInt(input);

        while ((Newpin == oldpin) && (inputSize == 2)) {//the size of input should less than 2 or a number less than 100
            System.out.println("Invalid pin.");
            System.out.println("Please input your new pin:");
            Newpin = sc.nextInt();
        }

        System.out.println("New pin confirmed.");
        System.out.println("Your pin has been updated to " + Newpin);

    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to pin update!");
        Updatepin();
    }

}