/*
 * Name: Jorge Fernando Flores Pinto
 * ID: V00880059
 * This program creates the bouncing ball and its frame
 *
 */

import java.awt.Color;
import java.awt.Point;

class Ball {
	private Color color;
	private Point point;
	private int radius;

	public Ball(int x, int y, int radius, Color color) {
		this.radius = radius;
		this.color = color;
		Point p1 = new Point(x, y);
		this.point = p1;

	}
	public void setColor(Color colour) {
		this.color = colour;

	}
	public Color getColour() {
		return this.color;

	}
	public void setRadius(int radius) {
		this.radius = radius;

	}
	public int getRadius() {
		return this.radius;

	}
	public Point getPoint() {
		return this.point;

	}
	public void move (int dx, int dy) {
		this.point.translate(dx, dy);

	}
}