import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ArrayofButtons extends Applet implements ActionListener {

	//applet member data
    Button[] buttonArray;
    int nRows = 3;
    int nColumns = 4;
    int nTotalButtons = nRows * nColumns;

    public void init() 
    {
    	//declare a grid layout with no space between buttons
        setLayout(new GridLayout(nRows, nColumns, 0, 0));
        
        //declare a new array of buttons
        buttonArray = new Button[nTotalButtons];
        
        //initialize each of the buttons in the array
        //with an empty label
        for (int nNum = 0; nNum < nTotalButtons; nNum++) 
        {
            buttonArray[nNum] = new Button("");
            add(buttonArray[nNum]);
            buttonArray[nNum].addActionListener(this);
            buttonArray[nNum].setBackground(Color.yellow);
        }
    }

    public void actionPerformed(ActionEvent e) 
    {
        //find out which button is the source
        int nButtonNumber = 0;
        for(int i = 0; i < buttonArray.length; i++)
           if(e.getSource() == buttonArray[i])
             nButtonNumber = i;
        
        //display button Number at bottom of screen
         showStatus("Button number " + nButtonNumber);
         
        //change background of buttons
        if(buttonArray[nButtonNumber].getBackground() != Color.red)
         	buttonArray[nButtonNumber].setBackground(Color.red);
	  else
	     	buttonArray[nButtonNumber].setBackground(Color.blue);    
    }
}

