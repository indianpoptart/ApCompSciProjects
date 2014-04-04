package com.apcompsci.Club;

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.io.*;
import java.nio.channels.*;
import javax.xml.bind.DatatypeConverter;
import java.nio.*;
import java.nio.charset.*;
/**
 * Converts binary text to readable text
 * 
 * @author Nikhil Paranjape 
 * @version April 5 - V3.1.1
 */
public class BinaryToText
{
    private static String out;
    public static void main(String args[]) throws IOException{
        try {
            Scanner scan  = new Scanner(System.in);
            System.out.println("Tell me your filename");
            String fileName = scan.nextLine();
            File f = new File(fileName + ".txt");
            FileInputStream is = new FileInputStream(f);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String text = new String(buffer);
            System.out.println(text);
            String output = "";
            String text2 = text.replaceAll(" ","");
            for(int i = 0; i <= text2.length() - 8; i+=8)
            {
                int k = Integer.parseInt(text2.substring(i, i+8), 2);
                output += (char) k;

            } 
            System.out.println(output);

        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
           System.out.println("Error, due to not finding the file: " + e);
        }
    }
}