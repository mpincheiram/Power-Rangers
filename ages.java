import java.util.Scanner;

public class ages {
    public static void main(String[] args) {

        reinaldoMethod();
        marioMethod();
     }

    static void reinaldoMethod() {

        /**
         * Reinaldo2020360
         */
        
        Scanner myKB = new Scanner (System.in);
            
        System.out.println("Type the first number: ");
    
    int n1 = myKB.nextInt();
    
        System.out.println("Type the second number: ");
   
    int n2 = myKB.nextInt();
    int n3 = (n1/n2);
    
        
        System.out.println("your result is :" +n3 );
        
      
        
        }
    

public static void marioMethod(){

    Scanner myKB = new Scanner(System.in);

    String name ;
    int age;

    System.out.println("Please enter your name .");

    name = myKB.nextLine();

    System.out.println("Please enter your age" );
    try{
        age = myKB.nextInt();
        if (age < 18) { 
    
            System.out.println(" Too young to buy alcohol here . ");
            
        } 
        else if(age > 18 && age < 105) { 
            
            System.out.println(" You are aceptted to buy here .");
        }
        else {
        
            System.out.println("  welcome to our store.");
        }
        }
        catch(Exception e){
            System.out.println(" please enter only numbers");
    }
    
}
    

}