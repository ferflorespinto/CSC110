import java.awt.*;

public class ReferenceMystery3 {
	public static void main(String[] args) {
		int a = 7;
		int b = 9;
		Point p1 = new Point(2, 2);
		Point p2 = new Point(2, 2);
		//addToXTwice(a, p1);
		a = a + a;
		p1.x = a;
		System.out.println(a + " " + p1.x);
		System.out.println(a + " " + b + " " + p1.x + " " + p2.x);
		addToXTwice(b, p2);
		System.out.println(a + " " + b + " " + p1.x + " " + p2.x);

		Point p1 = new Point(8, 2);
		Point p2 = new Point(4, 3);

		System.out.println("p1 is" + p1);
		System.out.println("p2 is" + p2);

		System.out.println("p1's distance from origin is " + p1.distanceFromOrigin());

		p1.translate(1, 2);
		p2.translate(-1, 10);

		System.out.println("p1 is now " + p1);
		System.out.println("p2 is now " + p2);


	}
	public static void addToXTwice(int a, Point p1) {
		a = a + a;
		p1.x = a;
		System.out.println(a + " " + p1.x);

	}
}

public class Name {
	private String name;
	private String lastName;
	private String middleInitial;

	public String getNormalOrder() {
		return name + " " + middleInitial + ". " + lastName;

	}
	public String getReverseOrder() {
		return lastName + ", " + name + " " + middleInitial + ".";
	}
	public Name(String name, String middleInitial, String lastName) {
		this.name = name;
		this.middleInitial = middleInitial;
		this.lastName = lastName;

	}
	public void setName(String name) {
		this.name = name;

	}
	public String getName() {
		return name;

	}
	public void setLastName(String lastName) {
		this.lastName = lastName;

	}
	public String getLastName() {
		return lastName;

	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;

	}
	public String getMiddleInitial() {
		return middleInitial;

	}
}
public class Point {
	public double distance(Point other) {
		double distanceX = (other.x - x) * (other.x - x);
		double distanceY = (other.y - y) * (other.y - y);
		return Math.sqrt(distanceX + distanceY);

	}
	public Point(Point other) {
		this.x = other.x;
		this.y = other.y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

}