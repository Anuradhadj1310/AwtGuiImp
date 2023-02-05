package packageAwt;

import java.awt.*;

public class MainWindow
{
	MainWindow()//constructor
	{
	    Frame fm=new Frame();    //Creating a frame
	    Label lb = new Label("welcome to java graphics");   //Creating a label
	    fm.add(lb);                  //adding label to the frame
	    fm.setSize(400, 300);   //setting frame size.
	    fm.setVisible(true);     //set frame visibilty true
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MainWindow obj=new MainWindow();
	}

}

