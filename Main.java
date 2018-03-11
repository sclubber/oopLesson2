package com.icloud.sclubber;

public class Main {

	public static void main(String[] args) {
		Point pointA = new Point(1.0, 1.0);
		Point pointB = new Point(4.0, 6.0);
		Point pointC = new Point(8.0, 1.0);
		Point pointD = new Point(-4.0, -6.0);
		Circle circleA = new Circle(pointA, pointB);
		Shape shapeCircle = circleA;
		Triangle triangleA = new Triangle(pointA, pointB, pointC);
		Shape shapeTriangle = triangleA;
		Square squareA = new Square(pointA, pointB, pointC, pointD);
		Shape shapeSquare = squareA;
		Board board = new Board();
		board.addShape(shapeCircle);
		board.addShape(shapeSquare);
		board.addShape(shapeTriangle);
		board.getInfo();
		board.delShape(shapeSquare);
		board.getInfo();
		board.addShape(shapeCircle);
		board.getInfo();
		board.addShape(shapeSquare);
		board.getInfo();
		board.delAll();
		board.getInfo();

	}

}
