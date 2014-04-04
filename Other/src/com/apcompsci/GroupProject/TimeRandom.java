package com.apcompsci.GroupProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class TimeRandom {
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	SimpleDateFormat sdf = new SimpleDateFormat("ss");
    	Random rand = new Random();
    	int foo = Integer.parseInt(sdf.format(cal.getTime()));
    	int j = 0;
    	if(foo > 10){
    		j = 100;
    		int saveName = rand.nextInt(j) + 1;
    		System.out.println(saveName);
    	}
    	else if(foo > 20){
    		j = 200;
    		int saveName = rand.nextInt(j) + 1;
    		System.out.println(saveName);
    	}
    	else if(foo > 30){
    		j = 200;
    		int saveName = rand.nextInt(j) + 1;
    		System.out.println(saveName);
    	}
    	else if(foo > 40){
    		j = 200;
    		int saveName = rand.nextInt(j) + 1;
    		System.out.println(saveName);
    	}
    	else if(foo > 50){
    		j = 200;
    		int saveName = rand.nextInt(j) + 1;
    		System.out.println(saveName);
    	}
    	else if(foo > 60){
    		j = 200;
    		int saveName = rand.nextInt(j) + 1;
    		System.out.println(saveName);
    	}
    	
    	
    	
	}
}
