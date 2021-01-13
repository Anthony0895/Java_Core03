package lgs;

public class Rectangle {
	
	private int length;
	private int width;
	
	Rectangle () {
		this.length = 2;
		this.width = 3;
	}
	
	Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	
	public int area (int length, int width) {
		 int area = length * width;
		 return area;
	}
	
	public int perimeter (int length, int width) {
		int perimeter = 2 * (length + width);
		return perimeter;
	}
	
	

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	
	
	

}
