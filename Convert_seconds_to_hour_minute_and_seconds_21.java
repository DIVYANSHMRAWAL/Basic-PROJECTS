//QUESTION-->
//Write a Java program to convert seconds to hours, minutes and seconds
//ANSWER-->
import java.util.Scanner;
public class Convert_seconds_to_hour_minute_and_seconds_21{
    public static void main(String[] args){

        //Accepting time from user
    Scanner data=new Scanner(System.in);
    System.out.println("Enter time in the form of secounds = ");
    int sec=data.nextInt();
    data.close();

    //Converting secounds to given format
    int hrs=sec/3600;
    int rmd1=sec%3600;

    int mnt=rmd1/60;
    int rmd2=rmd1%60;

    int secound=rmd2;

    System.out.println("Time = "+hrs+":"+mnt+":"+secound);
    }
}