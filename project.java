import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * project
 */
public class project {
     
    static void reinaldo2020360(int calculator) {
            
        Scanner myKB = new Scanner (System.in);
            
        System.out.println("Type the first number: ");
    
    int n1 = myKB.nextInt();
    
        System.out.println("Type the second number: ");
   
    int n2 = myKB.nextInt();
    int n3 = (n1/n2);
    
        
        System.out.println("your result is :" +n3 );
      
        
        }
       
    
    public static void main(String[] args) {
        reinaldo2020360();
        
        BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
        Scanner myScreen = new Scanner (System.in);

        String names = "";
        
        int ages;

        try{
            System.out.println(" Please enter your username ");
            names = myKB.readLine();
            
           
        }
        catch(Exception e){
        }
            
        try {
            System.out.println(" Please enter your age. ");
            ages= Integer.parseInt(myKB.readLine());
            ages = myScreen.nextInt();
    
            if (ages < 18) { 
    
                System.out.println(" Too young to buy alcohol here . ");
                
            } 
            else if(ages > 18 && ages < 105) { 
                
                System.out.println(" You are aceptted to buy here .");
            }
            else {
            
                System.out.println("  welcome to our store.");
            }
        }
        
        catch (Exception e) {
                System.out.println(" Your Age is accepted to buy in this store");
        }

        
    }

   
   
    
        
    
   }  
    
   
    
    

        


