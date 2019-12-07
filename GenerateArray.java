package withApplet;

import java.util.Random;

public class GenerateArray {
	public Nos[] generate()
	{
		Random rnum = new Random();
		Nos[] a = new Nos[10];
		for(int i=0;i<10;i++)
			a[i] = new Nos();
		int i = 0;
		while(i!=10) {
			int generatedRnum=rnum.ints(1, (11)).findFirst().getAsInt();
			if(isAvailable(a, generatedRnum) == false)
			{
				a[i].setAllValues(generatedRnum, i);
				i++;
			}
			//System.out.println(isAvailable(a));
		}
		return a;
	}
	
	boolean isAvailable(Nos a[],int key)
	{
		//System.out.println("Key : "+key);
		//for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
		//}
		for(int i=0; i<a.length;i++)
		{
			if(a[i].value == key)
			{
				return true;
			}
		}
		return false;	
	}
	
}
