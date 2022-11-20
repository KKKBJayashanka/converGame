/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.Bit_To_Byte;
import gui.Byte_To_Bit;
import gui.Celsius_To_Fahrenheit;
import gui.Fahrenheit_To_Celsius;
import gui.LaunchScreen;

/**
 *
 * @author pasin
 */
public class User {

    public static String name_1;
    public static String name_2;
    public static int user_id;
    public static int user_1_score = 0;
    public static int user_2_score = 0;

    public static boolean combobox_1;
    public static boolean combobox_2;
    public static int combobox_1_index;
    public static int combobox_2_index;
    public static String methodname;

    public static void main(String[] args) {

    }

    public static void chooseMethod() {

//        LaunchScreen.x
        if (combobox_1) {

            if (combobox_1_index == 0) {

                Celsius_To_Fahrenheit c_to_f = new Celsius_To_Fahrenheit();
                c_to_f.setVisible(true);
                methodname = "Celsius_To_Fahrenheit";

            } else if (combobox_1_index == 1) {

                Fahrenheit_To_Celsius f_to_c = new Fahrenheit_To_Celsius();
                f_to_c.setVisible(true);
                methodname = "Fahrenheit_To_Celsius";

            }

        } else if (combobox_2) {

            if (combobox_2_index == 0) {

                Bit_To_Byte bi_to_by = new Bit_To_Byte();
                bi_to_by.setVisible(true);
                methodname = "Bit_To_Byte";

            } else if (combobox_2_index == 1) {

                Byte_To_Bit by_to_bi = new Byte_To_Bit();
                by_to_bi.setVisible(true);
                methodname = "Byte_To_Bit";

            }

        }

    }

   

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
