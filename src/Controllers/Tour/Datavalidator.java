/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.Tour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author CanhDev
 */
public class Datavalidator {

    public static boolean isValidString(String chuoi) {
        String stringRegex = "^[^0-9]*$";
        Pattern pattern = Pattern.compile(stringRegex);
        Matcher matcher = pattern.matcher(chuoi);
        return matcher.matches();
    }
    public static boolean isValidNumber(String number) {
        String realNumberRegex = "^[-+]?[0-9]*\\.?[0-9]+$";
        Pattern pattern = Pattern.compile(realNumberRegex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
    
}
