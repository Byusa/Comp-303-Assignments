/*File Name: pinMain.java
Developers: <<Serge Jabo Byusa>>
Purpose: <<This program update the pin of the user>>
Inputs: <<Old pin>> <<The user inputs his old pin which is by default 00, 
                        create a new pin composed of two int digits>>
Outputs: <<new pin >> <<It output his new pin created>>
Modifications
==========
<<S.B.J>> <<17th Jan>> <<created a inputValidation() method*/
package pinmain;

import java.util.*;

public class pin {
    private String Initialpin;
    
    public pin(String Initialpin){
        this.Initialpin=Initialpin;
    }
    public String getInitialpin(){
        return Initialpin;
    }
    public void setInitialpin(String Initialpin){
        this.Initialpin=Initialpin;
    }
 //The method will call inputValidation() then update the new pin
 //It does not return it only calls inputValidation() and it is called in main function
    public static boolean inputValidation(String pin) {
         boolean result=true;
         if(pin.contains("-")){
            result=false;
         }
         if (!pin.matches("[0-9]+") || pin.length()!=2) {
             result=false;
         }
        return result;
    }
}
