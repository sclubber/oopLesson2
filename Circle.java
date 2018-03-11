package com.icloud.sclubber;

public class Circle extends Shape {
	Point pointOne = new Point();
	Point pointTwo = new Point();

	public Circle(Point pointOne, Point pointTwo) {
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
	}

	public Circle() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pointOne == null) ? 0 : pointOne.hashCode());
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
		Circle other = (Circle) obj;
		if (pointOne == null) {
			if (other.pointOne != null)
				return false;
		} else if (!pointOne.equals(other.pointOne))
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
		double perimetr = 2 * Math.PI * Point.getLength(pointOne, pointTwo);
		return perimetr;
	}

	@Override
	public double getArea() {
		double area = 2 * Math.PI * Math.pow(Point.getLength(pointOne, pointTwo), 2);
		return area;
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

	@Override
	public String toString() {
		return "Circle{" + "pointOne=" + pointOne + ", pointTwo=" + pointTwo + '}';
	}
}
