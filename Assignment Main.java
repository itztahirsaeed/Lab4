package oop;

public class HotDogStandMain {

	public static void main(String[] args) {
		//below constructor will initilize hotdog with id 3001 and items sold 0
		HotDogStand x=new HotDogStand(3001,0);
		x.justsold();
		x.justsold();
		System.out.println("No of Items sold by HotDog 1 are: "+x.get());
		
		HotDogStand x1=new HotDogStand(3002,0);
		x1.justsold();
		x1.justsold();
		x1.justsold();	
		x1.justsold();
		System.out.println("No of Items sold by HotDog 2 are: "+x1.get());
		
		HotDogStand x2=new HotDogStand(3001,0);
		x2.justsold();
		System.out.println("No of Items sold by HotDog 3 are: "+x2.get());
		

	}

}
