package homeAc;

public class Student {
private String name;
private int[] marks=new int[5];
public Student(String n,int[] a)
{
name=n;
marks[0]=a[0];
marks[1]=a[1];
marks[2]=a[2];
marks[3]=a[3];
marks[4]=a[4];

}
public int avg()
{
	int i=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
	return i;
}
}
