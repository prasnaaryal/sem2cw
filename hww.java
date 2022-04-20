package JOptionPane;

import java.util.Scanner;

public class hww {
    public static void main(String[] args) {
        int a=5,b=3;
        if (a>b) {
            System.out.println("A is greater");
        }else {
            System.out.println("B is greater");
        }


    }

}

//Write a JAVA program to find maximum between three numbers

class Three{
    public static void main(String[] args) {
        int a=2,b=4,c=7;
        if (a>b && a>c){
            System.out.println("a is greater");
        }else {
            if (b > a && b > c) {
                System.out.println("b is greater");
            }
            else
                System.out.println("c is greater");
        }

    }
}

//. Write a JAVA program to check whether a number is negative, positive or zero

class Zero{
    public static void main(String[] args) {
        int a=2;
        if (a==0){
            System.out.println("number is zero");
        }else{
            if (a>0){
                System.out.println("number is positive");
            }
            else
                System.out.println("number is odd");

        }
    }
}

//Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

class Divide{
    public static void main(String[] args) {
        int a=5;
        if ((a%5==0)&& (a%11==0)){
            System.out.println("it is divisible by both");

        }else {
            System.out.println("its not divisible by both");
        }
    }
}

//Write a JAVA program to check whether a number is even or odd.

class odd{
    public static void main(String[] args) {
        int a=7;
        if (a%2==0){
            System.out.println("it is even");
        }else{
            System.out.println("it is odd");
        }
    }
}

//Write a JAVA program to check whether a year is leap year or not.

class year{
    public static void main(String[] args) {
        int year=1996; //year to be checked
        boolean leap=false;
        if (year%4==0){
            //if the year is century
            if (year%100==0){
                //if year is divisible by 400 then leap
                if (year%400==0)
                    leap=true;
                else
                    leap=false;

            }else
                leap =true;
        }else
            leap=false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

    }
}

//Write a JAVA program to check whether a character is alphabet or not.

class Alphabet {

    public static void main(String[] args) {

        char c = 'b';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}

//Write a JAVA program to input any alphabet and check whether it is vowel or consonant

class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}

//Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.


class AlphabetDigitSpecial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A ALPHABET.");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A DIGIT.");

        } else {

            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }

    }
}

// Write a JAVA program to check whether a character is uppercase or lowercase alphabet.


class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");

        char ch = sc.next().charAt(0);

        if((ch >= 'A') && (ch<='Z'))
        {
            System.out.println("It is an Uppercase character");
        }
        else if((ch >= 'a') && (ch<='z'))
        {
            System.out.println("It is an lowercase character");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}

//11. Write a JAVA program to input week number and print weekday


class DayName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weekday day number (1-7) : ");
        int weekday = scanner.nextInt();

        if(weekday == 1) {

            System.out.println("Monday");

        } else if(weekday == 2) {

            System.out.println("Tuesday");

        } else if(weekday == 3) {

            System.out.println("Wednesday");

        } else if(weekday == 4) {

            System.out.println("Thursday");

        } else if(weekday == 5) {

            System.out.println("Friday");

        } else if(weekday == 6) {

            System.out.println("Saturday");

        } else if(weekday == 7) {

            System.out.println("Sunday");

        } else {

            System.out.println("Please enter weekday number between 1-7.");
        }

    }
}

//2. Write a JAVA program to input month number and print number of days in that month

class Monthdaysdisplay
{
    public static void main(String[] args)
    {
        int month;
        Scanner p=new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        month=p.nextInt();
        if(month == 1)
        {
            System.out.println("JANUARY 31 days");
        }
        else if(month == 2)
        {
            System.out.println("FEBRUARY 28 or 29 days");
        }
        else if(month == 3)
        {
            System.out.println("MARCH 31 days");
        }
        else if(month == 4)
        {
            System.out.println("APRIL 30 days");
        }
        else if(month == 5)
        {
            System.out.println("MAY 31 days");
        }
        else if(month == 6)
        {
            System.out.println("JUNE 30 days");
        }
        else if(month == 7)
        {
            System.out.println("JULY 31 days");
        }
        else if(month == 8)
        {
            System.out.println("AUGUST 31 days");
        }
        else if(month == 9)
        {
            System.out.println("SEPTEMBER 30 days");
        }
        else if(month == 10)
        {
            System.out.println("OCTOBER 31 days");
        }
        else if(month == 11)
        {
            System.out.println("NOVEMBER 30 days");
        }
        else if(month == 12)
        {
            System.out.println("DECEMBER 31 days");
        }
        else
        {
            System.out.println("Invalid input! Please enter month number between (1-12).");
        }

    }
}

// Write a JAVA program to count total number of notes in given amount.

//

//4. Write a JAVA program to input angles of a triangle and check whether triangle is valid or not

class Tri{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side A: ");
        int SideA = sc.nextInt();
        System.out.println("Enter Side B: ");
        int SideB = sc.nextInt();
        System.out.println("Enter Side C: ");
        int SideC = sc.nextInt();

        if (SideA + SideB + SideC == 180 && SideA != 0 && SideB != 0 && SideC != 0)
        {
            System.out.println("It is an valid triangle");
        }
        else {
            System.out.println("It is not an valid triangle");
        }

    }

}


//Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
class TriangleType {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  first side of Triangle: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter second side of Triangle: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter third side of Triangle: ");
        double side3 = sc.nextDouble();

        if(side1 == side2 && side2 == side3)
        {
            System.out.println("It is an Equilateral Triangle");
        }
        else if(side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("It is an Isosceles Triangle");
        }
        else
        {
            System.out.println("It is a Scalene Triangle");
        }
    }
}

//Write a JAVA program to check whether a character is uppercase or lowercase alphabet

class Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");

        char ch = sc.next().charAt(0);

        if((ch >= 'A') && (ch<='Z'))
        {
            System.out.println("It is an Uppercase character");
        }
        else if((ch >= 'a') && (ch<='z'))
        {
            System.out.println("It is an lowercase character");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}


