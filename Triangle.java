package com.icloud.sclubber;

public class Triangle extends Shape {
	private Point pointOne = new Point();
	private Point pointTwo = new Point();
	private Point pointThree = new Point();

	public Triangle(Point pointOne, Point pointTwo, Point pointThree) {
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.pointThree = pointThree;
	}

	public Triangle() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pointOne == null) ? 0 : pointOne.hashCode());
		result = prime * result + ((pointThree == null) ? 0 : pointThree.hashCode());
		result = prime * result + ((pointTwo == null) ? 0 : pointTwo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (pointOne == null) {
			if (other.pointOne != null)
				return false;
		} else if (!pointOne.equals(other.pointOne))
			return false;
		if (pointThree == null) {
			if (other.pointThree != null)
				return false;
		} else if (!pointThree.equals(other.pointThree))
			return false;
		if (pointTwo == null) {
			if (other.pointTwo != null)
				return false;
		} else if (!pointTwo.equals(other.pointTwo))
			return false;
		return true;
	}

	@Override
	public double getPerimetr() {
		double a = Point.getLength(pointOne, pointTwo);
		double b = Point.getLength(pointOne, pointThree);
		double c = Point.getLength(pointTwo, pointThree);
		double perimetr = a + b + c;
		return perimetr;
	}

	@Override
	public double getArea() {
		double a = Point.getLength(pointOne, pointTwo);
		double b = Point.getLength(pointOne, pointThree);
		double c = Point.getLength(pointTwo, pointThree);
		double area;
		if (a + b > c && a + c > b && b + c > a) {
			double p = (a + b + c) / 2;
			area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			return area;
		} else {
			System.out.println("Triangle with sides " + a + "; " + b + "; " + c + " DOES NOT exists");
			return 0;
		}
	}

	public Point getPointOne() {
		return pointOne;
	}

	public void setPointOne(Point pointOne) {
		this.pointOne = pointOne;
	}

	public Point getPointTwo() {
		return pointTwo;
	}

	public void setPointTwo(Point pointTwo) {
		this.pointTwo = pointTwo;
	}

	public Point getPointThree() {
		return pointThree;
	}

	public void setPointThree(Point pointThree) {
		this.pointThree = pointThree;
	}

	@Override
	public String toString() {
		return "Triangle{" + "pointOne=" + pointOne + ", pointTwo=" + pointTwo + ", pointThree=" + pointThree + '}';
	}
}
