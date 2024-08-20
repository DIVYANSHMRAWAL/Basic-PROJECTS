//QUESTION-->
//Write a Java program to accept an integer and count the factors of the number.

//ANSWER-->
import java.util.*;

public class Count_the_factors_of_the_number_31 {

    public static void main(String[] args) {

        //Accepting userinput
        Scanner data = new Scanner(System.in);
        System.out.println("Enter your number = ");
        int userinput = data.nextInt();
        data.close();

        //Counting number of factors of given value
        int n=0;
        for(int count=1;count<=userinput;count++){
            if(userinput%count==0){
                n=n+1;
            }
        }

        //printing result
        System.out.println("total number of factors of given values = "+n);
    }
}