import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        /*
        * 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        * two numbers , takes two numbers as input
        * */
        try {

            System.out.print("Enter first number: ");
            double number1 = scn.nextDouble();
            System.out.print("Enter second number: ");
            double number2 = scn.nextDouble();
            System.out.println("addition of " + number1 + "+" + number2 + "=" + (number1 + number2));
            System.out.println("subtraction of " + number1 + "-" + number2 + "=" + (number1 - number2));
            System.out.println("multiply of " + number1 + "x" + number2 + "=" + (number1 * number2));
            System.out.println("divide of " + number1 + "/" + number2 + "=" + (number1 / number2));
            System.out.println("mod of " + number1 + "%" + number2 + "=" + (number1 % number2));
        }catch (ArithmeticException e){
            scn.nextLine();
            System.err.println("You cannot devide over zero: "+ e.getMessage());
        }catch (Exception e){
            scn.nextLine();
            System.err.println("You must enter integers only: "+e.getMessage());
        }

        /*
        * 2. Write a Java program that takes a number as input and prints its multiplication table up to
        * 10.
        * */
        System.out.println();
        try {

            System.out.print("Enter number: ");
            int number = scn.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + "x" + i + "=" + (number * i));
            }
        }catch (Exception e){
            throw new RuntimeException("you must enter integers only: program will stop");
        }

        /*
        3. Write a Java program to print the area and perimeter of a circle.
         */
        try {
            System.out.print("Enter the radius: ");
            double radius = scn.nextDouble();
            double BAI = 3.14;
            double perimeter = 2 * radius * BAI;
            double area = Math.pow(radius, 2) * BAI;
            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
        }catch (Exception e){
            scn.nextLine();
            System.err.println("You must enter number");
        }
        /*
        4. Java program to find out the average of a set of integers
         */
        System.out.println();
        try {
            System.out.print("Enter count of numbers: ");
            int count = scn.nextInt();
            int x;
            double total = 0;
            for (int i = 0; i < count; i++) {
                System.out.print("Enter number: ");
                x = scn.nextInt();
                total += x;
            }
            double average = total / count;
            System.out.println("The average is: " + average);
        }catch (InputMismatchException e){
            scn.nextLine();
            System.err.println("you must enter number");
            System.out.println();
        }catch (Exception e){
            System.err.println("Error: "+e.getMessage());
        }


        /*
        5. Write a Java program that accepts three integers as input, adds the first two integers
        together, and then determines whether the sum is equal to the third integer.
         */
        try {
            System.out.print("Enter first number: ");
            int first_number = scn.nextInt();
            System.out.print("Enter second number: ");
            int second_number = scn.nextInt();
            System.out.print("Enter third number: ");
            int third_number = scn.nextInt();

            int sum = first_number + second_number;
            if (sum == third_number) {
                System.out.println("The result is: true");
            } else {
                System.out.println("The result is: false");
            }
        }catch (InputMismatchException e){
            System.err.println("You must enter integer only");
        }catch (Exception e){
            System.err.println("Error: "+ e.getMessage());
        }finally {
            System.out.println("thank you for using finally");
        }
        /*
         * 6. Write a Java program to reverse a word.
         */

        System.out.print("Enter word: ");
        String word = scn.next();
        StringBuilder reversed_word = new StringBuilder(word);
        System.out.printf("The reversed word of %s is %s\n", word, reversed_word.reverse().toString());

        /*
         * 7 - Java program to check whether the given number is even or odd
         */
        try {
            System.out.print("Enter number: ");
            int user_number = scn.nextInt();
            if (user_number % 2 == 0) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is Odd");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        /*
         * 8 - Java program to convert the temperature in Centigrade to Fahrenheit
         */
        try {
            System.out.print("Enter temperature in Centigrade: ");
            double centigrade = scn.nextDouble();
            double fahrenheit = (centigrade * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        }catch (Exception e){
            throw new Exception(e);
        }

        /*
         * 9.Write a Java program that takes a string and a number from the user,then prints the
        character in the given index.
         */

        try {
            System.out.print("Enter sentence: ");
            scn.nextLine();
            String sentence = scn.nextLine();
            System.out.print("Enter number: ");
            int user_input = scn.nextInt();
            System.out.println(sentence.charAt(user_input));
        } catch (Exception e) {
            throw new Exception("Error in question 9: " + e.getMessage());
        } finally {
            System.out.println("Question 9 finished.");
        }


        /*
         * 10. Write a Java program to print the area and perimeter of a rectangle.
         */

        try {
            double width, height;
            System.out.print("Enter width: ");
            width = scn.nextDouble();
            System.out.print("Enter height: ");
            height = scn.nextDouble();
            double rectangle_area = width * height;
            double rectangle_perimeter = 2 * (width + height);

            System.out.printf("Area is %f * %f = %f\n", width, height, rectangle_area);
            System.out.printf("Area is 2x(%f + %f) = %f\n", width, height, rectangle_perimeter);
        } catch (Exception e) {
            throw new Exception("Error in question 10: " + e.getMessage());
        }

        /*
         * 11. Write a Java program to compare two numbers.
         */

        try {
            System.out.print("Enter first integer: ");
            int first_number_compare = scn.nextInt();
            System.out.print("Enter second integer: ");
            int second_number_compare = scn.nextInt();

            if (first_number_compare == second_number_compare) {
                System.out.println(first_number_compare + "==" + second_number_compare);
            }
            if (first_number_compare <= second_number_compare) {
                System.out.println(first_number_compare + "<=" + second_number_compare);
            }
            if (first_number_compare >= second_number_compare) {
                System.out.println(first_number_compare + ">=" + second_number_compare);
            }
            if (first_number_compare != second_number_compare) {
                System.out.println(first_number_compare + "!=" + second_number_compare);
            }
            if (first_number_compare > second_number_compare) {
                System.out.println(first_number_compare + ">" + second_number_compare);
            }
            if (first_number_compare < second_number_compare) {
                System.out.println(first_number_compare + "<" + second_number_compare);
            }
            System.out.println("Thank you for compare");
        } catch (Exception e) {
            throw new Exception("Error in question 11: " + e.getMessage());
        }


        /*
         * 12. Write a Java program to convert seconds to hours, minutes and seconds.
         */

        try {
            System.out.println("Time converter");
            System.out.print("Enter the seconds: ");
            int totalSeconds = scn.nextInt();
            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;

            System.out.printf("%d:%d:%d", hours, minutes, seconds);
            System.out.println();
        } catch (Exception e) {
            throw new Exception("Error in question 12: " + e.getMessage());
        }

        /*
         * 13. Write a Java program that accepts four integers from the user and prints equal if all
        four are equal, and not equal otherwise.
         */

        try {
            System.out.print("Enter first number: ");
            int user_integer1 = scn.nextInt();
            System.out.print("Enter second number: ");
            int user_integer2 = scn.nextInt();
            System.out.print("Enter third number: ");
            int user_integer3 = scn.nextInt();
            System.out.print("Enter fourth number: ");
            int user_integer4 = scn.nextInt();

            if (user_integer1 == user_integer2 && user_integer1 == user_integer3 && user_integer1 == user_integer4) {
                System.out.println("Numbers are equal!");
            } else {
                System.out.println("Numbers are not equal!");
            }
        } catch (Exception e) {
            throw new Exception("Error in question 13: " + e.getMessage());
        }

        /*
         * 14. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
         */

        try {
            System.out.print("Enter number: ");
            int number_check = scn.nextInt();

            if (number_check > 0) {
                System.out.println("Number is positive");
            } else if (number_check < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }
        } catch (Exception e) {
            throw new Exception("Error in question 14: " + e.getMessage());
        }

        /*
         * 15.Write a program to enter the numbers till the user wants and at the end it
            should display the count of positive, negative and zeros entered (End loop use -1 ,
            Don’t count -1).
         */

        try {
            int total_positve = 0;
            int total_negative = 0;
            int total_zero = 0;
            int user_number_check;
            do {
                System.out.println("if you want to stop enter -1");
                System.out.print("Enter number: ");
                user_number_check = scn.nextInt();

                if (user_number_check > 0) {
                    total_positve++;
                } else if (user_number_check < 0 && user_number_check != -1) {
                    total_negative++;
                } else if (user_number_check == 0) {
                    total_zero++;
                } else {
                    break;
                }
            } while (user_number_check != -1);

            System.out.println(total_positve + " positve");
            System.out.println(total_negative + " negative");
            System.out.println(total_zero + " zero");
        } catch (Exception e) {
            throw new Exception("Error in question 15: " + e.getMessage());
        }

        /*
         * 16- Write a program that prompts the user to input an integer and then outputs the
        number with the digits reversed.
         */

        try {
            System.out.print("Enter number: ");
            int user_input_integer = scn.nextInt();
            StringBuilder reversed_integer = new StringBuilder(String.valueOf(user_input_integer));
            System.out.println(reversed_integer.reverse());
        } catch (Exception e) {
            throw new Exception("Error in question 16: " + e.getMessage());
        }


        /*
         * 17- Write a program to enter the numbers till the user wants and at the end the 
         * program should display the largest and smallest numbers entered.
         */

        try {
            int user_max, max, small;
            small = max = 0;
            String stop;
            do {
                System.out.print("Enter number: ");
                user_max = scn.nextInt();
                max = Math.max(user_max, max);
                small = Math.min(small, user_max);
                System.out.println("do you want to stop? Y/N");
                stop = scn.next();
            } while (stop.equalsIgnoreCase("y"));
            System.out.println("the large number: " + max);
            System.out.println("the small number: " + small);
        } catch (Exception e) {
            throw new Exception("Error in question 17: " + e.getMessage());
        }

        /*
         * 18- Determine and print the number of times the character ‘a’ appears in the input
        entered by the user.
         */

        try {
            System.out.println("Enter sentence: ");
            scn.nextLine();
            String user_sentense = scn.nextLine();
            char comparable_char = 'a';
            int counter = 0;

            for (int i = 0; i < user_sentense.length(); i++) {
                if (comparable_char == user_sentense.charAt(i)) {
                    counter++;
                }
            }

            System.out.println("Number of a's: " + counter);
        } catch (Exception e) {
            throw new Exception("Error in question 18: " + e.getMessage());
        }finally {
            scn.close();
            System.out.println("Scanner is closed");
        }
    }   

}