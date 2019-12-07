package withApplet;
import javax.swing.JTextField;
public class MatchingLogic {
	
	Nos Copied[] ;
	
	void printArray(Nos[] a , JTextField txtArray)
	{
		Copied = a;
		//System.out.println("Indexes of 1st Array : ");
		String ArrayTxt = "";
		for (int i = 0; i < 10; i++) {
			if(a[i].status == false)
				ArrayTxt = ArrayTxt + " " + a[i].index;
			else
				ArrayTxt = ArrayTxt + " x";
		}
		
		txtArray.setText(ArrayTxt);
		
		/*System.out.println("\nIndees of 2nd Array : ");
		for (int i = 0; i < 10; i++) {
			if(b[i].status == false)
				System.out.print(" " + b[i].index);
			else
				System.out.print(" x");
		}
		System.out.println("\n");
		*/
	}
	
	boolean isMatched(int no1,int no2)
	{
		if(no1 == no2)
			return true;
		return false;
	}
	
	boolean isMatchedAll()
	{
		int count = 0;
		
		for(int i = 0;i<10;i++)
		{
			if(Copied[i].status == true)
			{
				count += 1 ;
			}
		}
		System.out.println(count);
		if(count == 10)
			return true;
		return false;
	}
	
}
