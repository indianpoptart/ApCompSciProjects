package com.apcompsci.Club;

/**gn 
 * Created On: 2011-05-17
 * Last Modified on 2012-01-27
 *
 * RGBHexInterConverter.java
 * Utility to convert:
 * - Hex to RGB or
 * - RGB to HEX
 *
 * Uses regular expressions to match the valid pattern of the input string.
 */
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;
public class RGBHexInterConverter {
    static String commaSeparatedRGBPattern = "^(\\d{3}),(\\d{3}),(\\d{3})$";
    static final int HEXLENGTH = 8;
    static final String hexaDecimalPattern = "^0x([\\da-fA-F]{1,8})$";
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Tell me a hex color code");
        String hexInput = scan.next();
        
        if(hexInput.equals("")){
        	JOptionPane.showMessageDialog(null, "Nothing was entered, try again", "ERROR!", JOptionPane.ERROR_MESSAGE);
        	hexInput = JOptionPane.showInputDialog("Tell me a hex number color and I will make a color");
        }
        else if(hexInput.contains("#")){
        	hexInput = hexInput.substring(1);
        	System.out.println(hexInput);
        	
        }
        
        /** Some sample RGB and HEX Values for Conversion */
        String RGBForHexConversion = "128,128,255";
        String hexForRGBConversion = hexInput;
 
        /** Convert from RGB to HEX */
        covertRGBToHex(RGBForHexConversion);
         
        /** Convert from HEX to RGB */
        convertHexToRGB(hexInput);
         
        /**Pass some invalid RGB value for Hex Conversion*/
        covertRGBToHex("3002,4001,5301");
         
        /**Pass some invalid HEX value for RGB Conversion*/
        convertHexToRGB("5xY077c8d2"); 
         
    }
 
    /**
     * @param hexForRGBConversion
     *            - hex value string for conveting to RGB format. Valid format
     *            is: 0xXXXXXXXX e.g. 0x0077c8d2
     * @return comma separated rgb values in the format rrr,ggg, bbb e.g.
     *         "119,200,210"
     */
    private static String convertHexToRGB(String hexInput) {
        System.out.println("...converting Hex to RGB");
        String rgbValue = "";
        Pattern hexPattern = Pattern.compile(hexaDecimalPattern);
        Matcher hexMatcher = hexPattern.matcher(hexInput);
 
        if (hexMatcher.find()) {
            int hexInt = Integer.valueOf(hexInput.substring(2), 16)
                    .intValue();
 
            int r = (hexInt & 0xFF0000) >> 16;
            int g = (hexInt & 0xFF00) >> 8;
            int b = (hexInt & 0xFF);
 
            rgbValue = r + "," + g + "," + b;
            System.out.println("Hex Value: " + hexInput
                    + "\nEquivalent RGB Value: " + rgbValue);
        } else {
            System.out.println("Not a valid Hex String: " + hexInput
                    + "\n>>>Please check your input string.");
        }
        System.out.println();
        return rgbValue;
 
    }
 
    /**
     * @param rgbForHexConversion
     *           - comma separated rgb values in the format rrr,ggg, bbb e.g.
     *            "119,200,210"
     * @return equivalent hex in the format 0xXXXXXXXX e.g. 0x0077c8d2
     *
     *        If the converted hex value is not 8 characters long, pads the
     *         zeros in the front.
     */
    private static String covertRGBToHex(String rgbForHexConversion) {
        System.out.println("...converting RGB to Hex");
        String hexValue = "";
        Pattern rgbPattern = Pattern.compile(commaSeparatedRGBPattern);
        Matcher rgbMatcher = rgbPattern.matcher(rgbForHexConversion);
 
        int red;
        int green;
        int blue;
        if (rgbMatcher.find()) {
            red = Integer.parseInt(rgbMatcher.group(1));
            green = Integer.parseInt(rgbMatcher.group(2));
            blue = Integer.parseInt(rgbMatcher.group(3));
            Color color = new Color(red, green, blue);
            hexValue = Integer.toHexString(color.getRGB() & 0x00ffffff);
            int numberOfZeroesNeededForPadding = HEXLENGTH - hexValue.length();
            String zeroPads = "";
            for (int i = 0; i < numberOfZeroesNeededForPadding; i++) {
                zeroPads += "0";
            }
            hexValue = "0x" + zeroPads + hexValue;
            System.out.println("RGB value: " + rgbForHexConversion
                    + "\nEquivalent Hex Value: " + hexValue);
        } else {
            System.out.println("Not a valid RGB String: "+rgbForHexConversion
                    + "\n>>>Please check your inut string.");
        }
 
         
        System.out.println();
        return hexValue;
    }
}