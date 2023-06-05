package methord ;
import java.util.Scanner;
public class calculator{
     static int[] value_logic(int x , Scanner input){
        
        int z[] = new int[x];
        for(int i = 0; i<x ; i++){
            System.out.println("Enter the "+" "+i+" "+"value:");
            int value = input.nextInt();
            z[i] = value;

    
        }
        return z;
        
     }
     static void logic(int ...x){
        System.out.println(" 1 is use to addition");
        System.out.println(" 2 is use to subtrction");
        System.out.println(" 3 is use to multiplication");
        System.out.println(" 4 is use to division ");

        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the case which you want to execute:");
        int value = input.nextInt();
        switch(value){
            case 1:
                 int total = 0;
                 for(int i:x){
                    total += i;
                 }
                 System.out.println("The addition of value is:"+" "+total);
                 break;

            case 2:
                 int total_1 = 0 ;
                 for(int i:x){
                    total_1 -= i;
                 }
                 System.out.println("The substraction of value is:"+" "+total_1); 
                 break;

            case 3:
                 int total_2 = 0;
                 for(int i:x){
                    total_2 *= i;
                 } 
                 System.out.println("The multiplication of value is:"+" "+total_2);
                 break;
            case 4:
                int total_3 = 0;
                for(int i:x){
                    total_3 /= i;
                } 
                System.out.println("The division of value is:"+" "+total_3);
                break;

            default:
                System.out.println("So sorry I can't help it");
                System.out.println("I feel for you"); 
                
            input.close();    

        }
     }

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value you want to use:");
        int value = input.nextInt();
        
        int c[] = value_logic(value, input);
        
        logic(c);
        input.close();
        
        
     }
}