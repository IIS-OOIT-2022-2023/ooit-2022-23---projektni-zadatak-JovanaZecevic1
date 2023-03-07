package geometry;

public class Point {
	private int x;
	private int y;
	private boolean selected;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("this iz konstruktora: "+this);
		
	}
	
	public void setX(int xCoord) {
		if (xCoord<0) {
			System.out.println("Value must be positive");
		} else {
		x = xCoord;
		}
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setY(int yCoord) {
		if (yCoord<0) {
			System.out.println("Value must be positive");
		} else {
		y = yCoord;
		}
		
		
	}
	
	public int getY() {
		return this.y;
	}


	public void setSelected(boolean s) {
		this.selected = s;
	}
	
	public boolean isSelected() {
		return selected;
		
	}
	
	public double distance (Point point) {
		int dx = this.x - point.x;
		int dy = this.y - point.y;
		
	
		return 0;
	}
	
	

}

