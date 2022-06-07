/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author dream
 */
public final class InputScanner {

    public static String stringInput() {

        Scanner sc = new Scanner(System.in);
        String input = " ";
        boolean flag = false;

        while (!flag) {

            input = sc.nextLine();

            if (Pattern.matches("[A-Za-z]+", input)) {
                flag = true;
            } else {
                System.out.println("Only letters please!");
            }
        }

        return input;
    }

    public static String LineInput() {

        Scanner sc = new Scanner(System.in);
        String input = " ";
        boolean flag = false;

        while (!flag) {

            input = sc.nextLine();

            if (Pattern.matches("[.a-zA-Z0-9,!? ]+", input)) {
                flag = true;
            } else {
                System.out.println("Please check what you wrote!");
            }
        }

        return input;
    }

    public static int intInput() {

        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean flag = false;

        while (!flag) {

            if (!sc.hasNextInt()) {
                System.out.println("Only integers please!");
                sc.next();
            } else {
                input = sc.nextInt();
                flag = true;
            }

        }

        return input;
    }

    public static double doubleInput() {

        Scanner sc = new Scanner(System.in);
        double input = 0.0;
        boolean flag = false;

        while (!flag) {

            if (!sc.hasNextDouble()) {
                System.out.println("Only double please!");
                sc.next();
            } else {
                input = sc.nextDouble();
                flag = true;
            }

        }

        return input;
    }

    public static Date dateInput() {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date input = null;
        boolean flag = true;

        while (flag) {

            if (!sc.hasNextLine()) {
                System.out.println("Please insert a valid date(yyyy-MM-dd)!");
            } else {
                try {
                    String date = sc.nextLine();
                    input =format.parse(date);
                    flag = false;
                } catch (ParseException ex) {
                    System.out.println("Please insert a valid date(yyyy-MM-dd)!");
                }
            }
            
        }

        return input;
    }

    public static Date dateTimeInput() {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date input = null;
        boolean flag = true;

        while (flag) {

            if (!sc.hasNextLine()) {
                System.out.println("Please insert a valid date and time(yyyy-MM-dd HH:mm:ss)!");
            } else {
                try {
                    String date = sc.nextLine();
                    input = format.parse(date);
                    flag = false;
                } catch (ParseException ex) {
                    System.out.println("Please insert a valid date and time(yyyy-MM-dd HH:mm:ss)!");
                }
            }
            
        }

        return input;
    }
    
    
}
