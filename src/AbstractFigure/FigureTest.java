package AbstractFigure;

public class FigureTest {

	public static void main(String[] args) {
		Circle c= new Circle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		
		c.findArea();
		c.findPerimeter();
		
		r.findArea();
		r.findPerimeter();
		
		t.findArea();
		t.findPerimeter();
	}

}
