//Let Password is 12345
import java.util.*;
public class Password_Checker {

    public static void main(String[] args){
        int Password=12345;
        
        System.out.println("Enter your Password : ");
        Scanner data=new Scanner(System.in);
int input=data.nextInt();
        if(input==Password){
            System.out.print("Correct Password");
        }
        else{
            System.out.println("Wrong passwords");
        }
    }
}