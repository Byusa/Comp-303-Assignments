/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinmain;

import java.util.*;

public class PinMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String  inputCode = "00";
        pin pin1 = new pin(inputCode);
        pin1.setInitialpin(inputCode);
        //pin pin1 = new pin(inputCode);
        Updatepin();
    }
    
    public static void Updatepin() {
        String oldpin="", Newpin="";
        Scanner sc = new Scanner(System.in);
        String  inputCode = "00";//
        pin pin1 = new pin(inputCode);//
        pin1.setInitialpin(inputCode);//

        System.out.println("Please input your old pin:");
        String input = sc.nextLine();
        String Initialpin = pin1.getInitialpin();
        while(!(Initialpin.equals(input))){
            System.out.println("That is not your old pin.");
            System.out.println("Please input your old pin:");
            input = sc.nextLine();
            oldpin = input;
        }
        
        System.out.println("Please input your New pin:");
        input = sc.nextLine();
        
        while ((!pin1.inputValidation(input))|| (Newpin.equals(oldpin))){
            System.out.println("Invalid pin.");
            System.out.println("Please input your new pin:");
            input = sc.nextLine();   
            Newpin = input;
        }
        
        System.out.println("New pin confirmed.");
        System.out.println("Your pin has been updated to " + input);

    }
    
}
