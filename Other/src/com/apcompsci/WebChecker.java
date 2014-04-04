package com.apcompsci;

/**
 * Testing the values of red
 * @author Nikhil Paranjape 
 * @version March 2013
 */

import javax.swing.JOptionPane;

import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.*;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class WebChecker extends Object
{
	public static void main(String args[]){
		try{
			final ImageIcon icon = new ImageIcon("painticon.png");
			//sets default window color
			UIManager.put("OptionPane.background",new ColorUIResource(29,56,137));
			UIManager.put("OptionPane.messageForeground",new ColorUIResource(255,255,255));
			UIManager.put("Panel.background",new ColorUIResource(29,56,137));
			JOptionPane.showMessageDialog(null, "Checking for RPS Updates", "Ridgefield Public Schools", JOptionPane.INFORMATION_MESSAGE, icon);
			URL url = new URL("http://www.ridgefield.org/ajax/dist/emergency-announcements");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			DateFormat month = new SimpleDateFormat("MM");
			DateFormat day = new SimpleDateFormat("dd");
			Date date = new Date();
			String dayt = day.format(date);
			String end = null;
			String mont = month.format(date);
			int foo = Integer.parseInt(dayt);
			if(mont.equals("1")){
				mont = "January";
			}
			else if(mont.equals("2")){
				mont = "February";
			}
			else if(mont.equals("3")){
				mont = "March";
			}
			else if(mont.equals("4")){
				mont = "April";
			}
			else if(mont.equals("5")){
				mont = "May";
			}
			else if(mont.equals("6")){
				mont = "June";
			}
			else if(mont.equals("7")){
				mont = "July";
			}
			else if(mont.equals("8")){
				mont = "August";
			}
			else if(mont.equals("9")){
				mont = "September";
			}
			else if(mont.equals("10")){
				mont = "October";
			}
			else if(mont.equals("11")){
				mont = "November";
			}
			else if(mont.equals("12")){
				mont = "December";
			}
			if(dayt.equals("1")){
				end = "st";
			}
			else if(dayt.equals("2")){
				end = "nd";
			}
			else if(dayt.equals("3")){
				end = "rd";
			}
			else if(dayt.equals("21")){
				end = "st";
			}
			else if(dayt.equals("22")){
				end = "nd";
			}
			else if(dayt.equals("23")){
				end = "rd";
			}
			else if(dayt.equals("31")){
				end = "st";
			}
			else if(foo >= 4 && foo < 32){
				end = "th";
			}
			
			try {
				while (true) {
					connection.connect();
					Document doc = Jsoup.parse(url, 3*1000);
					String text = doc.text();
					String res = doc.body().text();
					System.out.println(res);
					String regex = "Emergency Announcement Displaying0 of 0 Back to 1st ";
					res = res.replaceAll(regex, "");
					System.out.println(res);
					if(res.contains("Schools are closed today")){
						JOptionPane.showMessageDialog(null, "Schools are closed on " + mont + " " + dayt + end, "Ridgefield Public Schools", JOptionPane.INFORMATION_MESSAGE, icon);
					}
					else if(res.contains("delay")){
						JOptionPane.showMessageDialog(null, "Schools have a delay on " + mont + " " + dayt + end, "Ridgefield Public Schools", JOptionPane.INFORMATION_MESSAGE, icon);
					}
					else if(res.contains("") || text.contains("<!-- subsite emergency announcement empty -->")){
						JOptionPane.showMessageDialog(null, "Currently there are no alerts for RPS for " + mont + " " + dayt + end, "Ridgefield Public Schools", JOptionPane.INFORMATION_MESSAGE, icon);
					}
					else{
						System.out.println(res);
						JOptionPane.showMessageDialog(null, res, "Ridgefield Public Schools", JOptionPane.INFORMATION_MESSAGE, icon);
					}
					Thread.sleep(600 * 1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}



		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "An error has occured!", "ERROR!", JOptionPane.ERROR_MESSAGE);
		}
	}
}