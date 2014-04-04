package com.apcompsci.Club;

import java.applet.Applet;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.JApplet;
/**
 * Write a description of class Snowman here.
 * 
 * @author Nikhil Paranjape 
 * @version 2/11/13 v3.0
 */
public class Snowman extends Applet
{
    private final int APPLET_WIDTH = 320;
    private final int APPLET_HEIGHT = 320;
    private final int MIN = 20; //smallest pic size
    private Image snowflake;
        
    //Loads Picture
    public void init()
    {
        snowflake = getImage (getDocumentBase(), "/Users/nikhilparanjape/git/apcompsciprograms/APCompSci/src/com/apcompsci/Club/snowflakeback.gif");
            
        setSize (APPLET_WIDTH, APPLET_HEIGHT);
    }
    public void drawPictures (int size, Graphics page){
        page.drawImage (snowflake, 0, 0, this.getWidth(),this.getHeight(), this);
    }


    public void paint (Graphics page){
        drawPictures (APPLET_WIDTH, page);
        
        //Snowman initialization
        
        final int MID = 160;
        final int TOP = 60;
        
        final int MIDa = 300;
        final int TOPa = 50;
        
        final int MIDt = 450;
        final int TOPt = 50;
        Color sky = new Color(135,206,250);
        
        
        Color floor = new Color(34,139,34);
        page.setColor(floor);
        page.fillRect(0,175, 3000, 5000); //floor
        
        Color zombieColor = new Color(0,139,69);
        Color zombieBody = new Color(138,51,36);
        Color zombieLeg = new Color(113,198,113);
        Color CarrotNose = new Color(237,145,33);
        
        page.setColor(Color.white);
        page.drawString ("THEY WANT BRAINZZZ", 140, 80);
        
        //zombie 1
        page.setColor(zombieColor);
        page.fillOval(MID -25, TOP, 40, 40); //skull
        page.setColor(zombieBody);
        page.fillOval(MID -35, TOP +35, 70, 50); //middle
        page.setColor(zombieLeg);
        page.fillOval(MID -50, TOP +80, 100, 60); //legs?
        
        page.drawArc(MID-10, TOP+20, 20, 10, -190, -160); //SMILE
        
        page.setColor(Color.black);
        page.fillOval (MID-4, TOP+50, 8, 8); // top button
        page.fillOval (MID-4, TOP+80, 8, 8); // middle button
        page.fillOval (MID-4, TOP+110, 8, 8); // bottom button
        
        page.setColor(CarrotNose);
        page.fillOval(MID-2, TOP+14, 4 ,4); //nose part 1
        page.fillOval(MID-2, TOP+16, 3 ,3); //nose part 2
        page.fillOval(MID-2, TOP+18, 2 ,2); //nose part 3
        
        page.setColor(Color.red);
        page.fillOval(MID -10, TOP +10, 5, 5); //left eye
        page.setColor(Color.orange);
        page.fillOval(MID +5, TOP +10, 5, 5); //right eye
        
        page.drawLine(MID -25, TOP +60, MID -40, TOP +35); // left arm
        page.drawLine(MID +25, TOP+60, MID +60, TOP +65); // right arm
        
            //zombie 2 
            page.setColor(zombieColor);
            page.fillOval(MIDa -20, TOPa, 40, 40); //skull
            page.setColor(zombieBody);
            page.fillOval(MIDa -35, TOPa +35, 70, 50); //middle
            page.setColor(zombieLeg);
            page.fillOval(MIDa -50, TOPa +80, 100, 60); //legs?
        
            page.drawArc(MIDa-10, TOPa+20, 20, 10, -190, -160); //SMILE
        
            page.setColor(Color.red);
            page.fillOval(MIDa -10, TOPa +10, 5, 5); //left eye
            page.setColor(Color.orange);
            page.fillOval(MIDa +5, TOPa +10, 5, 5); //right eye
        
            page.drawLine(MIDa -15, TOPa +60, MIDa -40, TOPa +35); // left arm
            page.drawLine(MIDa +25, TOPa +70, MIDa +60, TOPa +65); // right arm
        
            page.setColor(CarrotNose);
            page.fillOval(MIDa-2, TOPa+14, 4 ,4); //nose part 1
            page.fillOval(MIDa-2, TOPa+16, 3 ,3); //nose part 2
            page.fillOval(MIDa-2, TOPa+18, 2 ,2); //nose part 3
           
            page.setColor(Color.black);
            page.fillOval (MIDa-4, TOPa+50, 8, 8); // top button
            page.fillOval (MIDa-4, TOPa+80, 8, 8); // middle button
            page.fillOval (MIDa-4, TOPa+110, 8, 8); // bottom button
        
        
                //normal snowman
        
                page.setColor (Color.white);
                page.fillOval (MIDt-20, TOPt, 40, 40); // head
                page.fillOval (MIDt-35, TOPt+35, 70, 50); // upper torso
                page.fillOval (MIDt-50, TOPt+80, 100, 60); // lower torso


                page.setColor (Color.black);
                page.fillOval (MIDt-10, TOPt+10, 5, 5); // left eye
                page.fillOval (MIDt+5, TOPt+10, 5, 5); // right eye
                page.drawArc (MIDt-13, TOPt+8, 10, 10, -190, -160); //left eye brow
                page.drawArc (MIDt+2, TOPt+8, 10, 10, -190, -160); // right eye brow
                
                page.drawArc (MIDt-10, TOPt+20, 20, 10, 190, 160); // smile
                
                page.drawLine (MIDt-25, TOPt+60, MIDt-50, TOPt+40); // left arm
                page.drawLine (MIDt+25, TOPt+60, MIDt+55, TOPt+60); // right arm
                
                page.drawLine (MIDt-20, TOPt+5, MIDt+20, TOPt+5); // brim of hat
                page.fillRect (MIDt-15, TOPt-20, 30, 25); // top of hat
                page.fillOval (MIDt-4, TOPt+50, 8, 8); // top button
                page.fillOval (MIDt-4, TOPt+80, 8, 8); // middle button
                page.fillOval (MIDt-4, TOPt+110, 8, 8); // bottom button
                
                page.setColor (Color.orange);
                page.fillOval(MIDt-2, TOPt+14, 4 ,4); //nose part 1
                page.fillOval(MIDt-2, TOPt+16, 3 ,3); //nose part 2
                page.fillOval(MIDt-2, TOPt+18, 2 ,2); //nose part 3
        
        
    }
}
