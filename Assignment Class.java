package oop;

public class HotDogStand {
	private int idno;
	private int itemssold;
public HotDogStand(int a,int b)
{
	idno=a;
	itemssold=b;
	
}
public void justsold()
{
	itemssold++;
}
public int get()
{
	return itemssold;
}

}
