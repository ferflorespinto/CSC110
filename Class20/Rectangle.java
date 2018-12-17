public class Rectangle {
	private int x;
	private int y;
	private int height;
	private int width;

	public Rectangle(int x, int y, int width, int height) {
		if(width < 0 || height < 0) {
			throw new IllegalArgumentException();

		}
		if(x < 0 || y < 0) {
			throw new IllegalArgumentException();
			
		}

		this.height = height;
		this.width = width;
		this.x = x;
		this.y = y;

	}
	public int getHeight() {
		return height;
		// or this.height = height;
		//either one is fine
	}
	public int getX() {
		return x;
		// or this.x = x;
		//either one is fine

	}
	public int getY() {
		return y;
		// or this.x = x;
		//either one is fine
		
	}	
	public int getWidth() {
		return width;
		// or this.height = height;
		//either one is fine
	}	
}