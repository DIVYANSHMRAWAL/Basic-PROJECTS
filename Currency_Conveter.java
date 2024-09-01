//IND for India
//US for USA
//CD for Canada

import java.util.*;

public class Currency_Conveter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Scanner Countryseclector = new Scanner(System.in);

        // Money Amount
        System.out.print("Enter your number : ");
        double userinput = scanner.nextDouble();

        // Conveter
        System.out.print("From Currency of : ");
        String CountrySelector_FromCurrencyof = Countryseclector.nextLine();

        System.out.print("To Currency of : ");
        String CountrySelector_To_Currency_of = Countryseclector.nextLine();

        if (CountrySelector_FromCurrencyof.equals( CountrySelector_To_Currency_of)) {}
        else{

            if (CountrySelector_FromCurrencyof.equals("IND")  && CountrySelector_To_Currency_of.equals("US") ) {
                System.out.print("Converted money : ");
                System.out.print(userinput * 84);
            }

            if (CountrySelector_FromCurrencyof.equals("US")  && CountrySelector_To_Currency_of.equals("IND") ) {
                System.out.print("Converted money : ");
                System.out.print(userinput / 84);
            }

            if (CountrySelector_FromCurrencyof.equals("CD")  && CountrySelector_To_Currency_of.equals("IND") ) {
                System.out.print("Converted money : ");
                System.out.print(userinput * 62);
            }

            if (CountrySelector_FromCurrencyof.equals("IND")  && CountrySelector_To_Currency_of.equals("CD") ) {
                System.out.print("Converted money : ");
                System.out.print(userinput / 62);
            }

            if (CountrySelector_FromCurrencyof.equals("US")  && CountrySelector_To_Currency_of.equals("CD")) {
                System.out.print("Converted money : ");
                System.out.print(userinput * 1.3493);
            }

            if (CountrySelector_FromCurrencyof.equals("CD")  && CountrySelector_To_Currency_of.equals("US") ) {
                System.out.print("Converted money : ");
                System.out.print(userinput / 1.3493);
            }

            
        }
    }
}