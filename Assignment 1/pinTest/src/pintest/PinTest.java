
package pintest;
/**
 *
 * @author serge
 */
import java.util.*;

public class PinTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String  inputCode = "00";
        pin myPin = new pin(inputCode);
        myPin.setInitialpin(inputCode);
        
        System.out.println("Test case for method <<inputValidation()>> : ");
        for(int i=-120; i<=120; i++){
            String str1 = Integer.toString(i);
            if((i<10) && (i>=0)){
                String str2 = "0" +str1;
                System.out.println("Arguments: <<"+str2+">> Result: <<"+myPin.inputValidation(str2)+">>");
            }
                System.out.println("Arguments: <<"+str1+">> Result: <<"+myPin.inputValidation(str1)+">>");
        }
        int j = 0;
        int length = 2;
        while(j<=5){
            System.out.println("Arguments: <<"+generateRandomPassword(length)+">> Result: <<"+myPin.inputValidation(generateRandomPassword(length))+">>");
            j++;
        }
        length = 0;
        while(j<=20 ||length<10){
            System.out.println("Arguments: <<"+generateRandomPassword(length)+">> Result: <<"+myPin.inputValidation(generateRandomPassword(length))+">>");
            j++; length++;
        }
        String empty = " ";
        System.out.println("Arguments: <<  >> Result: <<"+myPin.inputValidation(empty)+">>");
    }
    
       public static String generateRandomPassword(int len)
	{
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";

		String values = Capital_chars + Small_chars +numbers + symbols;

                Random randm = new Random();

		char[] password = new char[len];

		for (int i = 0; i < len; i++)
		{
		   password[i] =values.charAt(randm.nextInt(values.length()));

		}
                String text = String.valueOf(password);
		return text;
	}
    }

//exhaustive test, a loop of all value (in pinTest.java)
//divinding the input
//set and get pin has to be tested  (if set and get are good loop)
//no need of random generator
//the larger the sample the better
//private methods yes, should we test them yes.






























