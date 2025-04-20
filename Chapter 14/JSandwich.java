//CSC-251-James Christenbury-Chapter 14-Exercise #6
//Date: 9-9-2020
/*This program utilizes the java swing components to produce a GUI that 
  displays 3 bread choices and 3 meat choices that the user can select 
  by clicking on the items corresponding check box. The user is allowed to 
  select 1 bread type and 1 meat. The price of each individual selection 
  will be displayed when selected by themselves, and the total price of a sandwich will
  be displayed when one bread and 1 meat are selected.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JSandwich extends JFrame implements ItemListener
{

	FlowLayout flow = new FlowLayout();
	String menuName = new String("Sublime Sandwich Shop");
	Font bigFont = new Font("Time New Roman", Font.PLAIN, 28);
	final double whiteBread = 3.50, wheatBread = 4.50, ryeBread = 5.25;
	double totalPrice = 0;

	ButtonGroup breadGrp = new ButtonGroup();
	JCheckBox whiteBox = new JCheckBox("White Bread", false);
	JCheckBox wheatBox = new JCheckBox("Wheat Bread", false);
	JCheckBox ryeBox = new JCheckBox("Rye Bread", false);

	final double chickenPrice = 1.50, hamPrice = 2.00, beefPrice = 1.75;

	ButtonGroup meatGrp = new ButtonGroup();
	JCheckBox chickenBox = new JCheckBox("Chicken", false);
	JCheckBox hamBox = new JCheckBox("Ham", false);
	JCheckBox beefBox = new JCheckBox("Beef", false);
	JTextField wholePrice = new JTextField(15);
	String output;

	public JSandwich()
	{
	    super("Sublime Sandwich Shop");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(flow);
	    breadGrp.add(whiteBox);
	    whiteBox.addItemListener(this);
	    breadGrp.add(wheatBox);
	    wheatBox.addItemListener(this);
	    breadGrp.add(ryeBox);
	    ryeBox.addItemListener(this);
	    meatGrp.add(chickenBox);
	    chickenBox.addItemListener(this);
	    meatGrp.add(hamBox);
	    hamBox.addItemListener(this);
	    meatGrp.add(beefBox);
	    beefBox.addItemListener(this);
	    	add(whiteBox);
      		add(wheatBox);
      		add(ryeBox);
      		add(chickenBox);
      		add(hamBox);
      		add(beefBox);
      		wholePrice.setText("0");
      		add(wholePrice);
	}
	public static void main(String[] args)
	{
		JSandwich aFrame = new JSandwich();
		aFrame.setSize(350,275);
		aFrame.setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent check)
	{
	  Object source = check.getItem();
	if(source == whiteBox)
	{
	  int select = check.getStateChange();
       if(select == ItemEvent.SELECTED)
          totalPrice += whiteBread;
       else if(select == ItemEvent.DESELECTED)
          totalPrice -= whiteBread;
       output = "$" + totalPrice;
       wholePrice.setText(output);
      }
      else if(source == wheatBox)
      {
	int select = check.getStateChange();
	if(select == ItemEvent.SELECTED)
	      totalPrice += wheatBread;
	else if(select == ItemEvent.DESELECTED)
	      totalPrice -= wheatBread;
	output = "$" + totalPrice;
	wholePrice.setText(output);
      }
      else if(source == ryeBox)
      {
	 int select = check.getStateChange();
	 if(select == ItemEvent.SELECTED)
	    totalPrice += ryeBread;
	 else if(select == ItemEvent.DESELECTED)
   	    totalPrice -= ryeBread;
   	 output = "$" + totalPrice;
	 wholePrice.setText(output);
      }
      else if(source == chickenBox)
      {
	 int select = check.getStateChange();
	 if(select == ItemEvent.SELECTED)
	      totalPrice += chickenPrice;
	 else if(select == ItemEvent.DESELECTED)
   	      totalPrice -= chickenPrice;
   	 output = "$" + totalPrice;
	 wholePrice.setText(output);
      }
      else if(source == hamBox)
      {
	int select = check.getStateChange();
	if(select == ItemEvent.SELECTED)
	    totalPrice += hamPrice;
	else if(select == ItemEvent.DESELECTED)
   	      totalPrice -= hamPrice;
   	output = "$" + totalPrice;
	wholePrice.setText(output);
      }
      else if(source == beefBox)
      {
	int select = check.getStateChange();
	if(select == ItemEvent.SELECTED)
	    totalPrice += beefPrice;
	else if(select == ItemEvent.DESELECTED)
	    totalPrice -= beefPrice;
	output = "$" + totalPrice;
	wholePrice.setText(output);
      }
   }
}
			