package polymorphism;

public class poly {

	public static void main(String abc[]) {
		
		Line l = new Line();
		letsDraw(l);
		Circle c = new Circle();
		letsDraw(c);
	}
	
	public static void letsDraw(Drawing ref) {
		ref.drawSomething();
	}
	
	
}

abstract class Drawing{
	
	abstract public void drawSomething();
}


class Line extends Drawing{
	
	public void drawSomething() {
		System.out.println("drawing line");
	}
}

class Circle extends Drawing {
	
	public void drawSomething() {
	System.out.println("draw circle");
	}
	
}


