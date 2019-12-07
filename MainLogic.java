package withApplet;

import javax.swing.JTextField;

public class MainLogic {

	
	
	public void playIt(JTextField txtFirstArrayIndexes,JTextField txtSecondArrayIndexes,
			JTextField txtaIndex,JTextField txtbIndex,
			JTextField txtaElement,JTextField txtbElement ,JTextField txtStatus,
			Nos a[],Nos b[]) {
		/*
		 * GenerateArray ga = new GenerateArray(); MatchingLogic ml = new
		 * MatchingLogic(); Nos[] a = ga.generate(); Nos[] b = ga.generate();
		 */
		MatchingLogic ml = new MatchingLogic();
		int aIndex = 0,bIndex = 0;
		//boolean flag = false;
		//do
		//{
			/*
			 * ml.printArray(a,txtFirstArrayIndexes); ml.printArray(b,
			 * txtSecondArrayIndexes);
			 */
			//Entering Index of array 
			
			try {
				//System.out.println("Enter index of 1st Array ");
				aIndex = Integer.parseInt(txtaIndex.getText());
				//System.out.println("Element is : "+a[aIndex].value);
				txtaElement.setText(a[aIndex].value + "");
				//System.out.println("Enter index of 2st Array ");
				bIndex = Integer.parseInt(txtbIndex.getText());
				//System.out.println("Element is : "+b[bIndex].value);
				txtbElement.setText(b[bIndex].value + "");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//Checking for matching
			
			if(ml.isMatched(a[aIndex].value, b[bIndex].value))
			{
				//System.out.println("Matched index");
				txtStatus.setText("Matched index");
				a[aIndex].setStatus(true);
				b[bIndex].setStatus(true);
			}
			
			else {
				txtStatus.setText("Unmatched index");
			}
			
			
			
			
		//}while(flag != true);
	}
	
	
	
	
}