import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        * 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        * two numbers , takes two numbers as input
        * */
        
        System.out.print("Enter first number: ");
        double number1 = scn.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scn.nextDouble();
        System.out.println("addition of "+ number1+ "+" +number2 + "=" + (number1+number2));
        System.out.println("subtraction of "+ number1+ "-" +number2 + "=" + (number1-number2));
        System.out.println("multiply of "+ number1+ "x" +number2 + "=" + (number1*number2));
        System.out.println("divide of "+ number1+ "/" +number2 + "=" + (number1/number2));
        System.out.println("mod of "+ number1+ "%" +number2 + "=" + (number1%number2));

        /*
        * 2. Write a Java program that takes a number as input and prints its multiplication table up to
        * 10.
        * */

        System.out.print("Enter number: ");
        int number = scn.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" +i+ "="+ (number*i));
        }

        /*
        3. Write a Java program to print the area and perimeter of a circle.
         */

        System.out.print("Enter the radius: ");
        double radius = scn.nextDouble();
        double BAI = 3.14;
        double perimeter = 2*radius*BAI;
        double area = Math.pow(radius, 2)*BAI;
        System.out.println("Perimeter is = "+ perimeter);
        System.out.println("Area is = "+ area);

        /*
        4. Java program to find out the average of a set of integers
         */

        System.out.print("Enter count of numbers: ");
        int count = scn.nextInt();
        int x;
        double total = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number: ");
            x = scn.nextInt();
            total += x;
        }
        double average = total/count;
        System.out.println("The average is: " + average);


        /*
        5. Write a Java program that accepts three integers as input, adds the first two integers
        together, and then determines whether the sum is equal to the third integer.
         */

        System.out.print("Enter first number: ");
        int first_number = scn.nextInt();
        System.out.print("Enter second number: ");
        int second_number = scn.nextInt();
        System.out.print("Enter third number: ");
        int third_number = scn.nextInt();

        int sum = first_number + second_number;
        if (sum == third_number){
            System.out.println("The result is: true");
        }else{
            System.out.println("The result is: false");
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

        System.out.print("Enter number: ");
        int user_number = scn.nextInt();
        if (user_number % 2 == 0){
           System.out.println("The number is Even");
        }else{
           System.out.println("The number is Odd");
        }


        /*
         * 8 - Java program to convert the temperature in Centigrade to Fahrenheit
         */

        System.out.print("Enter temperature in Centigrade: ");
        double centigrade = scn.nextDouble();
        double fahrenheit = (centigrade*9/5)+32;
        System.out.println("Temperature in Fahrenheit is: "+fahrenheit);


        /*
         * 9.Write a Java program that takes a string and a number from the user,then prints the
        character in the given index.
         */

        System.out.print("Enter sentence: ");
        scn.nextLine();
        String sentence = scn.nextLine();
        System.out.print("Enter number: ");
        int user_input = scn.nextInt();
        System.out.println(sentence.charAt(user_input));


        /*
         * 10. Write a Java program to print the area and perimeter of a rectangle.
         */

        double width, height;
        System.out.print("Enter width: ");
        width = scn.nextDouble();
        System.out.print("Enter height: ");
        height = scn.nextDouble();
        double rectangle_area = width * height;
        double rectangle_perimeter = 2*(width+height);

        System.out.printf("Area is %f * %f = %f\n", width , height, rectangle_area);
        System.out.printf("Area is 2x(%f + %f) = %f\n", width , height, rectangle_perimeter);

        /*
         * 11. Write a Java program to compare two numbers.
         */

        System.out.print("Enter first integer: ");
        int first_number_compare = scn.nextInt();
        System.out.print("Enter second integer: ");
        int second_number_compare = scn.nextInt();

        if (first_number_compare == second_number_compare){
            System.out.println(first_number_compare + "==" + second_number_compare);
        }
        if (first_number_compare <= second_number_compare){
            System.out.println(first_number_compare + "<=" + second_number_compare);
        }
        if (first_number_compare >= second_number_compare){
            System.out.println(first_number_compare + ">=" + second_number_compare);
        }
        if (first_number_compare != second_number_compare){
            System.out.println(first_number_compare + "!=" + second_number_compare);
        }
        if (first_number_compare > second_number_compare){
            System.out.println(first_number_compare + ">" + second_number_compare);
        }
        if (first_number_compare < second_number_compare){
            System.out.println(first_number_compare + "<" + second_number_compare);
        }
            System.out.println("Thank you for compare");



        /*
         * 12. Write a Java program to convert seconds to hours, minutes and seconds.
         */

        System.out.println("What do you want to do: ");
        System.out.println("1- converte seconds to minutes\n2- converte second to hours");
        System.out.print("chose number: ");
        int user_chose = scn.nextInt();
        System.out.print("Enter the seconds: ");
        int second_time = scn.nextInt();
        switch (user_chose) {
            case 1:
                System.out.println(second_time+ " in minutes is: "+ second_time/60);
                break;
            case 2:
                System.out.println(second_time+ " in hours is: "+ second_time/60/60);
            default:
                System.out.println("you chose wrong number");
                break;
        }

        /*
         * 13. Write a Java program that accepts four integers from the user and prints equal if all
        four are equal, and not equal otherwise.
         */

        System.out.print("Enter first number: ");
        int user_integer1 = scn.nextInt();
        System.out.print("Enter second number: ");
        int user_integer2 = scn.nextInt();
        System.out.print("Enter third number: ");
        int user_integer3 = scn.nextInt();
        System.out.print("Enter fourth number: ");
        int user_integer4 = scn.nextInt();

        if (user_integer1 == user_integer2 && user_integer1 == user_integer3 && user_integer1 == user_integer4){
            System.out.println("Numbers are equal!");
        }else{
            System.out.println("Numbers are not equal!");
        }





        /*
         * 14. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
         */

        System.out.print("Enter number: ");
        int number_check = scn.nextInt();

        if (number_check > 0){
            System.out.println("Number is positive");
        }else if (number_check < 0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }

        /*
         * 15.Write a program to enter the numbers till the user wants and at the end it
            should display the count of positive, negative and zeros entered (End loop use -1 ,
            Don’t count -1).
         */

        int total_positve = 0;
        int total_negative = 0;
        int total_zero = 0;
        int user_number_check;
        do {
            System.out.println("if you want to stop enter -1");
            System.out.print("Enter number: ");
            user_number_check = scn.nextInt();
            
            if (user_number_check > 0){
                total_positve++;
            }else if (user_number_check < 0 && user_number_check != -1){
                total_negative++;
            }else if (user_number_check == 0){
                total_zero++;
            }else{
                break;
            }
        }while (user_number_check != -1);

        System.out.println(total_positve+" positve");
        System.out.println(total_negative+" negative");
        System.out.println(total_zero+" zero");


        /*
         * 16- Write a program that prompts the user to input an integer and then outputs the
        number with the digits reversed.
         */

        System.out.print("Enter number: ");
        int user_input_integer = scn.nextInt();
        StringBuilder reversed_integer = new StringBuilder(String.valueOf(user_input_integer));
        System.out.println(reversed_integer.reverse());


        /*
         * 17- Write a program to enter the numbers till the user wants and at the end the 
         * program should display the largest and smallest numbers entered.
         */

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
        }while (stop.equalsIgnoreCase("y"));
        System.out.println("the large number: "+ max);
        System.out.println("the small number: "+ small);




        /*
         * 18- Determine and print the number of times the character ‘a’ appears in the input
        entered by the user.
         */

        System.out.println("Enter sentence: ");
        scn.nextLine();
        String user_sentense = scn.nextLine();
        char comparable_char = 'a';
        int counter = 0;

        for (int i = 0; i < user_sentense.length(); i++) {
            if (comparable_char == user_sentense.charAt(i)){
                counter++;
            }
        }

        System.out.println("Number of a's: "+ counter);

        scn.close();
    }   

}