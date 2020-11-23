import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * project
 */
public class project {

    public static void main(String[] args) {
        
        BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));

        int nun1, num2,num3,num4;
        String names = " Mario ";
        int ages  ;
        try{
            System.out.println(" Please enter your username ");
            names = myKB.readLine();

            System.out.println(" Please enter your age. ");
            ages= Integer.parseInt(myKB.readLine());
        }

        
        catch(Exception e){
            System.out.println("Please the user have to be legal age to buy alcohol in a store ..");

        }



    }
}