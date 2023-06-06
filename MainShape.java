package ineuron;


		public class MainShape
		{

			public static void main(String[] args) {
				// Rectangle area and parameter
				double length = 2.0;
				double breadth = 3.0;
				Rectangle r = new Rectangle(length, breadth);

				System.out.println("Rectangle - Area: " + r.area());
				System.out.println("Rectangle - perimeter: " + r.perimeter());

				// Circle area and parameter
				double radius = 2.0;
				Circle c = new Circle(radius);
				System.out.println("Circle - Area: " + c.area());
				System.out.println("Circle - perimeter: " + c.perimeter());

			}

	}


