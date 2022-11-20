/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author pasin
 */
public class ConvertGame {

    public static int random_no_1;
    public static int random_no_2;
    public static String random_no_1_string;
    public static String random_no_2_string;
    public static double correct_answer_1;
    public static double correct_answer_2;
    public static double user_answer_1;
    public static double user_answer_2;
    public static String won_user;

    public static void lordnumbers_1() {

        int min = 99;
        int max = 999;

        random_no_1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        random_no_1_string = Integer.toString(random_no_1);

        if (User.methodname == "Celsius_To_Fahrenheit") {

            double c_a = ConvertGame.random_no_1 * 1.8 + 32;

            DecimalFormat decfor = new DecimalFormat("#.##");
            String roundOff = decfor.format(c_a);
            correct_answer_1 = Double.parseDouble(roundOff);

//            System.out.println(roundOff);

        } else if (User.methodname == "Fahrenheit_To_Celsius") {

            double c_a = (ConvertGame.random_no_1 - 32) * 5.0 / 9.0;

            DecimalFormat decfor = new DecimalFormat("#.##");
            String roundOff = decfor.format(c_a);
            correct_answer_1 = Double.parseDouble(roundOff);
//            System.out.println(c_a);
//            System.out.println(roundOff);

        } else if (User.methodname == "Bit_To_Byte") {

            System.out.println(random_no_1);
            double c_a = (ConvertGame.random_no_1 / 8.0);

            DecimalFormat decfor = new DecimalFormat("#.##");
            String roundOff = decfor.format(c_a);
            correct_answer_1 = Double.parseDouble(roundOff);

//            System.out.println(c_a);
//            System.out.println(roundOff);

        } else if (User.methodname == "Byte_To_Bit") {

            double c_a = ConvertGame.random_no_1 * 8.0;

            DecimalFormat decfor = new DecimalFormat("#.##");
            String roundOff = decfor.format(c_a);
            correct_answer_1 = Double.parseDouble(roundOff);
//            System.out.println(c_a);
//            System.out.println(roundOff);

        }

    }

    public static void lordnumbers_2() {

        int min = 99;
        int max = 999;

        random_no_2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        random_no_2_string = Integer.toString(random_no_2);

        if (User.methodname == "Celsius_To_Fahrenheit") {

            double c_a = random_no_2 * 1.8 + 32;

            DecimalFormat decfor = new DecimalFormat("#.##");
            String roundOff = decfor.format(c_a);
            correct_answer_2 = Double.parseDouble(roundOff);

//            System.out.println(roundOff);

        } else if (User.methodname == "Fahrenheit_To_Celsius") {

            double c_a = (random_no_2 - 32) * 5.0 / 9.0;

            DecimalFormat decfor = new DecimalFormat("#.##");
            String roundOff = decfor.format(c_a);
            correct_answer_2 = Double.parseDouble(roundOff);

//            String s = String.valueOf(c_a);
//            System.out.println(s);
//            System.out.println(roundOff);

        } else if (User.methodname == "Bit_To_Byte") {

            double c_a = random_no_2 / 8.0;

            DecimalFormat decfor = new DecimalFormat("#.##");
            String roundOff = decfor.format(c_a);
            correct_answer_2 = Double.parseDouble(roundOff);

//            String s = String.valueOf(c_a);
//            System.out.println(s);
//            System.out.println(roundOff);

        } else if (User.methodname == "Byte_To_Bit") {

            double c_a = random_no_2 * 8.0;

            DecimalFormat decfor = new DecimalFormat("#.##");
            String roundOff = decfor.format(c_a);
            correct_answer_2 = Double.parseDouble(roundOff);

//            String s = String.valueOf(c_a);
//            System.out.println(s);
//            System.out.println(roundOff);

        }

    }

    public static void calculation_user_1() {
        
          if (correct_answer_1 == user_answer_1) {
                User.user_1_score = User.user_1_score + 1;
            } else {
                User.user_1_score = User.user_1_score;
            }

//        if (User.methodname == "Celsius_To_Fahrenheit") {
//
//            if (correct_answer_1 == user_answer_1) {
//                User.user_1_score = User.user_1_score + 1;
//            } else {
//                User.user_1_score = User.user_1_score;
//            }
//
//        } else if (User.methodname == "Fahrenheit_To_Celsius") {
//
//            if (correct_answer_1 == user_answer_1) {
//                User.user_1_score = User.user_1_score + 1;
//            } else {
//                User.user_1_score = User.user_1_score;
//            }
//
//        } else if (User.methodname == "Bit_To_Byte") {
//
//            if (correct_answer_1 == user_answer_1) {
//                User.user_1_score = User.user_1_score + 1;
//            } else {
//                User.user_1_score = User.user_1_score;
//            }
//
//        } else if (User.methodname == "Byte_To_Bit") {
//
//            if (correct_answer_1 == user_answer_1) {
//                User.user_1_score = User.user_1_score + 1;
//            } else {
//                User.user_1_score = User.user_1_score;
//            }
//
//        }

    }

    public static void calculation_user_2() {
        
         if (correct_answer_2 == user_answer_2) {
                User.user_2_score = User.user_2_score + 1;

            } else {
                User.user_2_score = User.user_2_score;

            }

//        if (User.methodname == "Celsius_To_Fahrenheit") {
//
//            if (correct_answer_2 == user_answer_2) {
//                User.user_2_score = User.user_2_score + 1;
//
//            } else {
//                User.user_2_score = User.user_2_score;
//
//            }
//
//        } else if (User.methodname == "Fahrenheit_To_Celsius") {
//
//            if (correct_answer_2 == user_answer_2) {
//                User.user_2_score = User.user_2_score + 1;
//
//            } else {
//                User.user_2_score = User.user_2_score;
//
//            }
//
//        } else if (User.methodname == "Bit_To_Byte") {
//
//            if (correct_answer_2 == user_answer_2) {
//                User.user_2_score = User.user_2_score + 1;
//
//            } else {
//                User.user_2_score = User.user_2_score;
//
//            }
//
//        } else if (User.methodname == "Byte_To_Bit") {
//
//            if (correct_answer_2 == user_answer_2) {
//                User.user_2_score = User.user_2_score + 1;
//
//            } else {
//                User.user_2_score = User.user_2_score;
//
//            }
//
//        }

    }

}
