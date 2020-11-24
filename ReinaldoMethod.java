
package reinaldomethod;

import java.util.Scanner;


public class ReinaldoMethod {

    public static void main(String[] args) {
    reinaldoMethod();   
    }
    public static void reinaldoMethod(){
        /**
         *@author Reinaldo2020360
         */
            
        Scanner myKB = new Scanner (System.in);
            
        System.out.println("Type the first number: ");
    
    int n1 = myKB.nextInt();
    
        System.out.println("Type the second number: ");
   
    int n2 = myKB.nextInt();
    int n3 = (n1/n2);
    
        
        System.out.println("your result is :" +n3 );
        
      
       
        }
    }

