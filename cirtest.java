/**13.9 (ENABLE CIRCLE COMPARABLE) Rewrite the Circle class in Listing 13.2
to extend GeometricObject and implement the Comparable interface. Override 
the equals method in the Object class. Two Circle objects are equal if their 
radii are the same. Draw the UML diagram that involves Circle, GeometricObject, and Comparable.*/
class cirtest {
  public static void main(String[] args) {
    //creating four circle objects to test. two are the same radius and two are different
	  Circle cir1 = new Circle(2, "red", true);
		Circle cir2 = new Circle(6, "orange", false);
		Circle cir3 = new Circle(3, "green", true);
		Circle cir4 = new Circle(3, "green", true);
		
		// checking to see if the radius of the circles are the same or not, then prints
		if (cir1.equals(cir2)) {
			System.out.println("Circle1's radius is the same as circle2");
		}
		else {
			System.out.println("Circle1's radius different from circle2");
		}
		if (cir3.equals(cir4)) {
			System.out.println("Circle3's radius is the same as circle4");
		}
		else {
			System.out.println("Circle4's radius different from circle4");
		}
  }
}
//creating circle object that inherits GeometricObject and Comparable
 class Circle extends GeometricObject implements Comparable<Circle>{
    double radius; //initializing radius
//making default value
	 Circle() {
       radius = 1;
	}
//making circle with specific radius
	 Circle(double radius) {
		this.radius = radius;
	}
//making radius, color, and filled values for circle object
	 Circle(double radius, 
		String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	//Radius getter method
	double getRadius() {
		return radius;
	}

	//method to set new radius
	void setRadius(double radius) {
		this.radius = radius;
	}

	//Returns the area of the circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	//Returns diameter of circle
	double getDiameter() {
		return 2 * radius;
	}
    //printing circle and radius
    public void printCircle() {
      System.out.println("The circle is created " + getDateCreated() +
       " and the radius is " + radius);
    }
   
	//returns perimeter of circle
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	//check object equality method
	public boolean equals(Object obj) {
		Circle o = (Circle) obj;
		return this.compareTo(o) == 0;
	}

	public int compareTo(Circle cirobj) {
		if (this.radius == cirobj.radius)
			return 0;
		else if (this.radius > cirobj.radius)
			return 1;
		else
			return -1;
	}

 
 }
