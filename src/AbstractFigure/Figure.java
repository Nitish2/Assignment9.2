package AbstractFigure;

public abstract class Figure {
	public abstract void findArea();

	public abstract void findPerimeter();
}

class Circle extends Figure {
	double pi = 3.14;
	double dim1 = 4;

	@Override
	public void findArea() {
		System.out.println("Area of circle:" + pi * dim1 * dim1);

	}

	@Override
	public void findPerimeter() {
		System.out.println("Perimeter of circle:" + 2 * pi * dim1);
	}
}

class Rectangle extends Figure {
	double dim1 = 5;
	double dim2 = 7;

	@Override
	public void findArea() {
		System.out.println("Area of rectangle:" + dim1 * dim2);
	}

	@Override
	public void findPerimeter() {
		System.out.println("Perimeter of rectangle:" + 2 * (dim1 + dim2));
	}

}


class Triangle extends Figure{
	double dim1=2;
	double dim2=3;
	double dim3=4;

	@Override
	public void findArea() {
		double s = (dim1+dim2+dim3) / 2;
		System.out.println("Area of triangle:" + Math.sqrt(s * (s - dim1) * (s - dim2) * (s - dim3)));
		
	}

	@Override
	public void findPerimeter() {
		System.out.println("Perimeter of triangle:" + (dim1+dim2+dim3));
		
	}
	
}
