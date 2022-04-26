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
        int a=55;
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
        int year;
        Scanner p=new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        System.out.println("Enter year");
        month=p.nextInt();
        year=p.nextInt();
        if(month == 1)
        {
            System.out.println("JANUARY 31 days");
        }
        else if(month == 2)
        {

            if ((year%400==0) || ((year%4==0) && (year%100!=0))) {
                System.out.println("feb 28 days");

                 }else{
                    System.out.println("FEBRUARY 28 or 29 days");
                }



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

class quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of c");
        double c= sc.nextDouble();

        System.out.println("enter the value of a");
        double a= sc.nextDouble();


        System.out.println("enter the value of b");
        double b= sc.nextDouble();

        double determinant=(b*b)-(4*a*c);
        double sqrt=Math.sqrt(determinant);
        System.out.println(determinant);

    }
}


 //* Write a JAVA program to input electricity unit charges and calculate total electricity bill
//according to the given condition:

class ElectricityCharge{
    public static void main(String[] args) {
        int Units;
        double Amount, Sur_Charge, Total_Amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter electricity units");
        int unit=sc.nextInt();
        if (unit<=50){
            Amount = unit*0.5;
            Sur_Charge = 0.2 * Amount;
        }
        else if(unit<=150){
            Amount = 25 + ((unit - 50 )* 75);
            Sur_Charge = 0.2 * Amount;
        }
        else if(unit<=250){
            Amount = 25 + 75+ ((unit - 150 )* 1.20);
            Sur_Charge = 0.2 * Amount;

        }
    }
}

class Switch{
    public static void main(String[] args) {
        Scanner ew=new Scanner(System.in);
        int num=ew.nextInt();
        switch (num%2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;


        }

    }
}

class Ram{
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        int a=ok.nextInt();
        int b=ok.nextInt();
        switch ((a<b)?0:(b>a)?1:2){
            case 0:
                System.out.println("a");
                break;
            case 1:
                System.out.println("b");
                break;


        }

    }
}

class subjects{
    public static void main(String[] args) {
        Scanner sub=new Scanner(System.in);
        float percentage;
        System.out.println("enter physics score");
        int physics= sub.nextInt();
        System.out.println("enter math score");
        int math= sub.nextInt();
        System.out.println("enter bio score");
        int bio=sub.nextInt();
        System.out.println("enter chem score");
        int chem= sub.nextInt();
        System.out.println("enter computer score");
        int computer= sub.nextInt();
        int sum=(physics+math+bio+chem+computer);
        System.out.println("per" +sum);
        percentage=sum/500 *100;
        System.out.println("per" +percentage);


    }
}

//JAVA Program to find the maximum between two numbers. Using the switch statement.

class maxmin{
    public static void main(String[] args) {
        Scanner max=new Scanner(System.in);
        int min;
        System.out.println("enter the first num");
        int a=max.nextInt();
        System.out.println("enter a second num");
        int b= max.nextInt();
        switch ((a>b) ? 0:1){
            case 0:
                System.out.println("a");
            break;
        case 1:
        System.out.println("b");
        break;





    }
}}

class three{
    public static void main(String[] args) {
        Scanner three=new Scanner(System.in);
        System.out.println("enter the first num");
        int a=three.nextInt();
        System.out.println("enter a second num");
        int b= three.nextInt();
        System.out.println("enter the third num");
        int c=three.nextInt();
        switch ((a>b) ? (a>c ? 0:2):(b>c?1:2)){
            case 0:
                System.out.println("a");
                break;
            case 1:
                System.out.println("b");
                break;
            case 2:
                System.out.println("c");
                break;


        }


    }
}

//JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
//statement

class divide{
    public static void main(String[] args) {
        Scanner div=new Scanner(System.in);
        boolean divisible;
        System.out.println("enter the first num");
        int a=div.nextInt();
        switch (a%5<=0 && a%11<=0?1:2){
            case 1:
                System.out.println("divisible");
                break;
            case 2:
                System.out.println(" not divisible");
                break;


        }


        }


    }

    //. JAVA Program to check whether a year is a leap year or not. Using switch statement

class leap{
    public static void main(String[] args) {
        Scanner year=new Scanner(System.in);
        boolean leapyear;
        System.out.println("enter a year");
        int a= year.nextInt();

        switch (a%4==0 && a%100==0?0:1){
            case 0:
                System.out.println("leapyear");
                break;

            case 1:
                System.out.println("not leapyear");

        }

    }
}

//JAVA Program to check whether a character is an alphabet or not. Using the switch statement.

class word{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word: ");
        char word=sc.next().charAt(0);
        switch ((word>='a'&& word<='z')?0:1){
            case 0:
                System.out.println(word+ " is character.");
                break;
            case 1:
                System.out.println(word+ " is not a character.");
                break;

        }
    }
}
//7. JAVA Program to take the value from the user as input any alphabet and check whether it is
//vowel or consonant. Using the switch statement.
class lphabet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word :");
        char a=sc.next().charAt(0);
        switch(a){
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.println(a+" is vowel.");
                break;
            default:
                System.out.println(a+ " is consonant.");
                break;
        }

    }
}

//8. JAVA Program to take the value from the user as input any character and check whether it is
//the alphabet, digit or special character. Using the switch statement.
class checkk{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Character: ");
        char a=sc.next().charAt(0);
        switch((a>='a'&&a<='z')?0:1){
            case 0:
                System.out.println(a+ " is alphabet.");
                break;
            case 1:
                switch((a>='0'&&a<='9')?0:1){
                    case 0:
                        System.out.println(a+ " is Number.");
                        break;
                    default:
                        System.out.println(a+" is special number.");
                        break;

                }
        }
    }
}

//9. JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the
//switch statement.
class upperlower{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Word: ");
        char a=sc.next().charAt(0);
        switch((a>='a'&&a<='z')?0:1){
            case 0:
                System.out.println(a+ " is lowercase.");
                break;
            case 1:
                switch ((a>='A'&&a<='Z')?0:1){
                    case 0:
                        System.out.println(a+ " is uppercase.");
                        break;
                    case 1:
                        System.out.println(a+ " is not alphabet.");
                        break;
                }
        }
    }
}
//10. JAVA Program to take the value from the user as an input week number and print weekday by
//using the switch statement.
class weekk{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Week Number(1-7): ");
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Error number");
                break;

        }
    }
}

//11. JAVA Program to take the value from the user as input the month number and print number of
// days in that month. Using switch statement.
class mobnth{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Month number(1-12): ");
        int a=sc.nextInt();
        switch (a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days.");
                break;
            case 2:
                System.out.println("Year:");
                int year=sc.nextInt();
                boolean leap=false;
                switch (year%4){
                    case 0:
                        switch(year%100){
                            case 0:
                                switch(year%400){
                                    case 0:
                                        leap=true;
                                        break;
                                    case 1:
                                        leap=false;
                                        break;
                                }break;
                            case 1:
                                leap=true;
                                break;
                        }break;
                    case 1:
                        leap=false;
                        break;
                }
                if (leap) {
                    System.out.println("28 Days");
                }else{
                    System.out.println("29 Days");
                }
        }
    }
}

//13. JAVA Program to take the value from the user as input all sides of a triangle and check whether
        //the triangle is valid or not. Using switch statement

class QuestionThirteenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();

        switch ((a+b>c)||(a+c>b)||(b+c>a)?1:2){
            case 1:
                System.out.print("The triangle is valid.");
            case 2:
                System.out.print("The triangle is not valid.");
        }

    }
}

/*
14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
Using switch statement
 */
class QuestionFourteenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();

        switch ((a==b&&b==c)?1:(a==b||b==c||c==a)?2:3){
            case 1:
                System.out.print("The triangle is a equilateral triangle. ");
            case 2:
                System.out.print("The triangle is a isosceles triangle. ");
            case 3:
                System.out.print("The triangle is a scalene triangle. ");
        }
    }
}

//17. Using switch statement JAVA Program to take the value from the user as input marks of five subjects Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage and grade according to the following: Percentage >= 90% : Grade A, Percentage >= 80% : Grade B, Percentage >= 70% : Grade C,Percentage >= 60% : Grade D, Percentage >= 40% : Grade E, Percentage < 40% : Grade F, Using switch statement.
class Subjec{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Physic: ");
        double p=scan.nextDouble();

        System.out.println("Chemistry : ");
        double c=scan.nextDouble();

        System.out.println("Biology : ");
        double b=scan.nextDouble();

        System.out.println("math : ");
        double m=scan.nextDouble();

        System.out.println("computer : ");
        double co=scan.nextDouble();

        double per=(p+c+b+m+co)/5;
        double total=(p+c+b+m+co);

        System.out.println("Total percentage is "+per);
        System.out.println("Total  is "+total);

        switch ((per>=90)?0:(per>=80 && per<90)?1:(per>=70 && per<=80)?2:(per>=60 && per<70)?3:(per>=40 && per<60)?4:5){


            case 0:
                System.out.println("grade A");
                break;
            case 1:
                System.out.println("grade B");
                break;
            case 2:
                System.out.println("grade C");
                break;
            case 3:
                System.out.println("grade D");
                break;
            case 4:
                System.out.println("grade E");
                break;
            case 5:
                System.out.println("grade F");
                break;
        }

    }

}
//18. JAVA Program to take the value from the user as input the basic salary of an employee and calculate its Gross salary according to the following:Basic Salary <= 10000: HRA = 20%, DA = 80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA = 90%………………………………Basic Salary > 20000 : HRA = 30%, DA = 95%.
class Salaryy{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your basic salary: ");
        double salary=scan.nextDouble();

        double HRA,DA;

        switch ( (salary<=10000)?1:(salary<=20000 && salary>10000)?2:(salary>20000)?3:0 ){

            case 1:
                System.out.println("Gross salary is "+ (salary+(0.2*salary)+(0.8*salary)));
                break;

            case 2:
                System.out.println("Gross salary is "+ (salary+(0.25*salary)+(0.9*salary)));
                break;

            case 3:
                System.out.println("Gross salary is "+ (salary+(0.3*salary)+(0.95*salary)));
                break;

            case 0:
                System.out.println("no thing");
                break;

            default:
                System.out.println("invalid");

        }

    }
}


//19. JAVA Program to take the value from the user as input electricity unit charges and calculate total electricity bill according to the given condition: For the first 50 units Rs. 0.50/unit………….For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit ……………For unit above 250 units  Rs. 1.50/unit………An additional surcharge of 20% is added to the bill…….Using the switch statement.
class Elect{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double amount,sur,bill;

        System.out.println("Enter the electricity unit charges:");
        double unit= scan.nextDouble();

        switch ( (unit<=50)?1:(unit<=150)?2:(unit<=250)?3:0){


            case 1:
                amount=unit*0.5;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("The total bill is "+ bill);
                break;

            case 2:
                amount=25+(unit-50)*0.75;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("the total bill is"+bill);
                break;

            case 3:
                amount=25+75+(unit-150)*1.20;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;

            case 4:
                amount=25+75+150+(unit-250)*1.50;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;

            default:
                System.out.println("invalid");






        }





    }
}
/*
20. Write a program that determines a student’s grade. The program will read three types of scores
(quiz, mid-term, and final scores) and determine the grade based on the following rules:if the
average score =90% =>grade=A…………………..-if the average score >= 70% and <90% =>
grade=B……………………-if the average score>=50% and <70%`
=>grade=C……………………..-if the average score<50% =>grade=F
*/

class Gradee {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double quiz, mid, final_term,p;
        System.out.println("Enter the quiz_term marks: ");
        quiz=scanner.nextDouble();
        System.out.println("Enter the mid_term marks: ");
        mid=scanner.nextDouble();
        System.out.println("Enter the final_term marks: ");
        final_term=scanner.nextDouble();

        p=(quiz+mid+final_term)/3;
        System.out.println("the total percent is "+p);

        switch ((p>=90)? 0:(p>=70&& p<90)? 1:(p>=50&& p<70)?2:3){
            case 0:
                System.out.println("Grade A");
                break;
            case 1:
                System.out.println("Grade B");
                break;
            case 2:
                System.out.println("Grade C");
                break;
            case 3:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("not valid");
        }

    }
}

/*
21. Program to take the hours and minutes as input by the user and the show that whether it is AM
or PM by using the switch statement.
*/
class Minu{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double hours, minutes;
        System.out.println("enter the total hours: ");
        hours=scan.nextDouble();
        System.out.println("enter the total minutes: ");
        minutes=scan.nextDouble();

        double min_in_hr=minutes/60;
        double t_hours=min_in_hr+hours;

        switch((t_hours>0 &&t_hours<=11)? 1:(t_hours>=12 &&t_hours<24?2:3)){
            case 1:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is AM.");
                break;
            case 2:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is PM.");
                break;
            case 3:
                System.out.println("invalid input");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

/*
22. Program to convert a positive number into negative number and negative number into a positive
number using switch statement
*/
class Pos{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the number: ");
        double num=scanner.nextDouble();

        switch((num<0)?1:(num>0)?2:3){
            case 1:
                System.out.println("you enter the negative no ");
                System.out.println("so it positive no is "+(num*-1));
                break;
            case 2:
                System.out.println("you enter the positive no ");
                System.out.println("so its negative no is "+(num*-1));
                break;
            case 3:
                System.out.println("you enter the invalid no or zero ");
                break;
            default:
                System.out.println("invalid input");
        }

    }
}

/*
23. Write a program to swap the values of two numbers if the values of both variables are not the
same using a switch statement.
*/
class Vari{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        System.out.println("Enter the first no:");
        double a=scanner.nextDouble();
        System.out.println("Enter the second no:");
        double b=scanner.nextDouble();
        temp=a;
        a=b;
        b=temp;
        switch((a!=b)?1:(a==b)?2:3){
            case 1:
                System.out.println("a="+a);
                System.out.println("b="+b);
                break;
            case 2:
                System.out.println("Don't take two same no");
                break;
            case 3:
                System.out.println("invalid");
                break;
        }


    }
}
/*
24. Program to Convert even number into its upper nearest odd number Switch Statement*/
class Uppe{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=scanner.nextInt();

        switch(num%2){
            case 0:
                System.out.println(num+" is an even number");
                System.out.println("And it's upper nearest odd number is "+ (num+1));
                break;
            case 1:
                System.out.println("Don't enter the odd number");
                break;
            default:
                System.out.println("invalid");
        }
    }
}