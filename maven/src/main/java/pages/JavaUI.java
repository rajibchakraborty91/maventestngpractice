package pages;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import org.testng.TestNG;

import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.JButton;

public class JavaUI extends JPanel {    
    private static Icon leftButtonIcon;
    private boolean DEBUG = false;
     // added static infront becuase got non static referencing error
static List<String[]> rosterList = new ArrayList<String[]>();

    public JavaUI() {
        super(new BorderLayout(10,10));

       // JTable table = new JTable(new MyTableModel());
        //table.setPreferredScrollableViewportSize(new Dimension(500, 70));
     //   table.setFillsViewportHeight(true);

       JButton button=new JButton("RUN it");
       // Rarely has the intended effect.
       // also best not to presume we can guess the size
       // a component needs to be.
       //button.setSize(30,60);
       // cannot add a button to itself!
        //button.add(button);
        JPanel buttonCenter = new JPanel( new FlowLayout(FlowLayout.CENTER) );
        // allow the button to be centered in buttonCenter,
        // rather than stretch across the width of the SOUTH
        // of the TableDemo
        buttonCenter.add(button);
        add(buttonCenter, BorderLayout.SOUTH);
        
        
      //Add an action listener
        button.addActionListener(new Listener());
       
     
        //Create the scroll pane and add the table to it.
       //JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        //add(scrollPane, BorderLayout.CENTER);
         //create a button

        // add a nice border
        setBorder(new EmptyBorder(5,5,5,5));
    }

    class MyTableModel extends AbstractTableModel {
        // apologies about the column names
        private String[] columnNames = { "??d????", "??s?t?ta", "??µ?", "?e????af?", "???e???", "??tsa"};

        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            return rosterList.size();
        }

        @Override
        public String getColumnName(int col) {
            return columnNames[col];
        }

     public Object getValueAt(int row, int col)
        {
            return rosterList.get(row)[col];

        }
    }


    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TableDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JavaUI newContentPane = new JavaUI();
        // JPanels are opaque by default!
        //newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Should be done on the EDT.
        // Left as an exercise for the reader.
    	JavaUI.createAndShowGUI();
    }
    

}

class Listener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
    {  
		//What to do when button is pressed 
		
		TestNG runner=new TestNG();
		 
		// Create a list of String 
		List<String> suitefiles=new ArrayList<String>();
		 
		// Add xml file which you have to execute
		suitefiles.add("D:\\Java Documents\\text\\maven\\TestSuite\\testng.xml");
		 
		// now set xml file for execution
		runner.setTestSuites(suitefiles);
		 
		// finally execute the runner using run method
		runner.run();
		
	
    }
}
