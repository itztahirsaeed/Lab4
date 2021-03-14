package lab4;

public class CircleMain {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(7);
		System.out.println("circumference of Circle 1 is: "  );
		c.calCir();
		int r = c.getRadius();
		Circle c2 = new Circle(r);
		c2.setRadius(5);
		System.out.println("circumference of Circle 2 is: " );
		c2.calCir();
		Circle c3 = new Circle(4);
		c3.display();

	}

}
