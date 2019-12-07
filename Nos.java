package withApplet;

public class Nos {
	public int index;
	int value;
	public boolean status;
	
	public void setStatus(boolean status) {
		this.status = status;
	}

	void setAllValues(int value,int index) {
		this.index = index;
		this.value = value;
		status = false;
	}
	
}
