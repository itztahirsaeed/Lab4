package homeAc;

public class Studentsmain {

	public static void main(String[] args) {
		int[] t;
		t =new int[5];
		t[0]=66;
		t[1]=86;
		t[2]=56;
		t[3]=26;
		t[4]=56;
		
		Student s=new Student("Tahir",t);
		System.out.println("Average is: "+s.avg());
		

	}

}
