import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//        float cashFlow = 9_123_123_123L;
//        byte age = 20;
//        Date newDate = new Date();
//        System.out.println(age);
//        System.out.println(newDate);

//        Point point1 = new Point(1, 2);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);
//
//        String newString = "              Hello World            ";
//        System.out.println(newString);
//        System.out.println(newString.toLowerCase());
//        System.out.println(newString);
//        System.out.println(newString.length());
//        System.out.println(newString.indexOf("e"));
//        System.out.println(newString.replace("World", "Ermies"));
//        newString = newString.replace("World", "        Ermias    ");
//        System.out.println(newString);
//        System.out.println("trimmed: " + newString.trim());

//        System.out.println("Hello \\Jeremiah/");

//Arrays
    //One Dimensional Arrays
        char[] numbers = {'d','g','e','t','y','u','a'};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    //Multi-Dimensional Array
        int[][] trial = {{1,10,2,4},{2,4,5,6},{6,2,4,5},{6,2,4,5}};
        System.out.println(Arrays.deepToString(trial));

//Constants
        final int value = 10;//unchangeable

//Mortgage Calculator
        final byte MonthsOfTheYear = 12;
        final byte Percent = 100;

        int PrincipalValue;
        double AnnualInterestRate;
        int Periods;

        Scanner valueFromTheUser = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = valueFromTheUser.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = valueFromTheUser.nextFloat();
        float monthlyInterest = annualInterest / Percent / MonthsOfTheYear;

        System.out.print("Period(Year): ");
        byte years = valueFromTheUser.nextByte();
        int numberOfPayments = years * MonthsOfTheYear;

        double mortgage = principal * (monthlyInterest * Math.pow(1+ monthlyInterest, numberOfPayments)
                          /(Math.pow(1+monthlyInterest, numberOfPayments)-1));

        String MortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage Formatted: " + MortgageFormatted);
    }
}