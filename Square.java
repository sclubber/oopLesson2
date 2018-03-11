package com.icloud.sclubber;

public class Square extends Shape {
	private Point pointOne = new Point();
	private Point pointTwo = new Point();
	private Point pointThree = new Point();
	private Point pointFour = new Point();

	public Square(Point pointOne, Point pointTwo, Point pointThree, Point pointFour) {
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.pointThree = pointThree;
		this.pointFour = pointFour;
	}

	public Square() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pointFour == null) ? 0 : pointFour.hashCode());
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
		Square other = (Square) obj;
		if (pointFour == null) {
			if (other.pointFour != null)
				return false;
		} else if (!pointFour.equals(other.pointFour))
			return false;
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
		double b = Point.getLength(pointOne, pointFour);
		double c = Point.getLength(pointTwo, pointThree);
		double d = Point.getLength(pointFour, pointThree);
		return a + b + c + d;
	}

	@Override
	public double getArea() {
		double a = Point.getLength(pointOne, pointTwo);
		double b = Point.getLength(pointOne, pointFour);
		double c = Point.getLength(pointTwo, pointThree);
		double d = Point.getLength(pointFour, pointThree);
		double p = (a + b + c + d) / 2;
		double area = Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
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

	public Point getPointThree() {
		return pointThree;
	}

	public void setPointThree(Point pointThree) {
		this.pointThree = pointThree;
	}

	public Point getPointFour() {
		return pointFour;
	}

	public void setPointFour(Point pointFour) {
		this.pointFour = pointFour;
	}

	@Override
	public String toString() {
		return "Square{" + "pointOne=" + pointOne + ", pointTwo=" + pointTwo + ", pointThree=" + pointThree
				+ ", pointFour=" + pointFour + '}';
	}
}
