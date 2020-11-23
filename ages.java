import java.util.Scanner;

public class ages {


    

public static void main(String[] args) {
    
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