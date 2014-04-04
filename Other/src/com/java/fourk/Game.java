package com.java.fourk;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.*;
 
@SuppressWarnings("serial")
public class Game extends JFrame {
 
	private JLabel gameLogoJLabel;
	private JLabel testDataJLabel;
	private JPanel letterOptionsJPanel;
	private JPanel puzzleJPanel;
 
 
	JButton[][] grid; //names the array of buttons
	JButton[][] puzzleGrid;
    private static final char[] TotalAlphabet = {'A','B','C','D','E','F','G'
		,'H','I','J','K','L','M','N'
		,'O','P','Q','R','S','T','U'
		,'V','W','X','Y','Z'};//Display in window for JButtons
    private  char[] puzzleChars = new char[60];
	// no-argument constructor
	public Game(){
		createUserInterface();
	}
 
	private void createUserInterface(){		
		// get content pane for attaching GUI components
 
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout( null );
		 //JScrollPane scrollBar=new JScrollPane(contentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
 
		testDataJLabel = new JLabel();
		testDataJLabel.setBounds(850,250,200,18);
		//testDataJLabel.setBackground(Color.WHITE);
		testDataJLabel.setForeground(Color.WHITE);
		 contentPane.add(testDataJLabel);
 
		letterOptionsJPanel = new JPanel();
		letterOptionsJPanel.setBounds(50,250,670,100);
		letterOptionsJPanel.setLayout(new GridLayout(2,13));
		grid=new JButton[2][13]; //allocate the size of grid 
        int count = 0;//for Alphabet assignment
        for(int r=0; r<2; r++){
                for(int c=0; c<13; c++){
                        grid[r][c]=new JButton(""+TotalAlphabet[count]+""); 
                        grid[r][c].setActionCommand("disable");
 
 
                        grid[r][c].addActionListener(new ActionListener(){
                        	public void actionPerformed(ActionEvent event){
                        		gridactionPerformed(event);
                        	}
                        });
                        letterOptionsJPanel.add(grid[r][c]); //adds button to grid
                        count++;
                }
        }
		contentPane.add(letterOptionsJPanel); 
 
		puzzleJPanel = new JPanel();
		puzzleJPanel.setBounds(50,360,900,200);
		puzzleJPanel.setLayout(new GridLayout(3,20));
		String puzzleString = "Can you guess what it is";
		int puzzleLength = puzzleString.length();
 
 
		int spacesBegin = puzzleLength;
			for(int letters = 0;letters < 60; letters++)
			{
				if (letters >= spacesBegin)
				{
					puzzleChars[letters]=' ';
				}
				else
				{
					puzzleChars[letters]=puzzleString.charAt(letters);
				}
			}
 
		testDataJLabel.setText(puzzleString);
		puzzleGrid=new JButton[3][20]; //allocate the size of grid 
 
 
        int puzzlecount = 0;//for Alphabet assignment
 
        for(int r=0; r<3; r++){
                for(int c=0; c<20; c++){
                        puzzleGrid[r][c]=new JButton(""+puzzleChars[puzzlecount]+""); 
                        puzzleGrid[r][c].setActionCommand("disable");
 
 
                        puzzleJPanel.add(puzzleGrid[r][c]); //adds button to grid
                        puzzlecount++;
                }
        }
 
 
 
       contentPane.add(puzzleJPanel); 
 
 
	    gameLogoJLabel = new JLabel();
	    gameLogoJLabel.setIcon(new ImageIcon("C:/Users/jamesb/Downloads/Wheel_of_Fortune/board.png"));
	    gameLogoJLabel.setBounds(50,15,800,232);
	    gameLogoJLabel.setHorizontalAlignment(JLabel.CENTER);
	    contentPane.add(gameLogoJLabel);
 
 
	    // set properties of application's window
		setTitle( "Wheel of Fortune" ); // set title bar string
		setSize( 1105, 800 );      // set window size
		setVisible( true );       // display window
 
 
	} // end createUserInterface
 
	 public void gridactionPerformed(ActionEvent e) { 
     	JButton passedButton =(JButton) e.getSource();
     	String letter = passedButton.getText();
     	if (letter.equals("A") )
     		grid[0][0].setEnabled(false);
     	else if (letter.equals("B"))
     		grid[0][1].setEnabled(false);
     	else if (letter.equals("C"))
     		grid[0][2].setEnabled(false);
     	else if (letter.equals("D"))
     		grid[0][3].setEnabled(false);
     	else if (letter.equals("E"))
     		grid[0][4].setEnabled(false);
     	else if (letter.equals("F"))
     		grid[0][5].setEnabled(false);
     	else if (letter.equals("G"))
     		grid[0][6].setEnabled(false);
     	else if (letter.equals("H"))
     		grid[0][7].setEnabled(false);
     	else if (letter.equals("I"))
     		grid[0][8].setEnabled(false);
     	else if (letter.equals("J"))
     		grid[0][9].setEnabled(false);
     	else if (letter.equals("K"))
     		grid[0][10].setEnabled(false);
     	else if (letter.equals("L"))
     		grid[0][11].setEnabled(false);
     	else if (letter.equals("M"))
     		grid[0][12].setEnabled(false);
     	else if (letter.equals("N"))
     		grid[1][0].setEnabled(false);
     	else if (letter.equals("O"))
     		grid[1][1].setEnabled(false);
     	else if (letter.equals("P"))
     		grid[1][2].setEnabled(false);
     	else if (letter.equals("Q"))
     		grid[1][3].setEnabled(false);
     	else if (letter.equals("R"))
     		grid[1][4].setEnabled(false);
     	else if (letter.equals("S"))
     		grid[1][5].setEnabled(false);
     	else if (letter.equals("T"))
     		grid[1][6].setEnabled(false);
     	else if (letter.equals("U"))
     		grid[1][7].setEnabled(false);
     	else if (letter.equals("V"))
     		grid[1][8].setEnabled(false);
     	else if (letter.equals("W"))
     		grid[1][9].setEnabled(false);
     	else if (letter.equals("X"))
     		grid[1][10].setEnabled(false);
     	else if (letter.equals("Y"))
     		grid[1][11].setEnabled(false);
     	else if (letter.equals("Z"))
     		grid[1][12].setEnabled(false);
 
 
        } 
 
	// main method
	public static void main( String args[] ){
		Game application = new Game();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 
	} // end method main
 
} // end Game class