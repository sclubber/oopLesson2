package com.icloud.sclubber;

import java.util.Arrays;
import java.util.Objects;

public class Board {
	private Shape[] shapesArray = new Shape[4];
	private int count = 0;
	public double totalArea;

	public Board() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + Arrays.hashCode(shapesArray);
		long temp;
		temp = Double.doubleToLongBits(totalArea);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Board other = (Board) obj;
		if (count != other.count)
			return false;
		if (!Arrays.equals(shapesArray, other.shapesArray))
			return false;
		if (Double.doubleToLongBits(totalArea) != Double.doubleToLongBits(other.totalArea))
			return false;
		return true;
	}

	public void addShape(Shape shape) {
		for (int i = 0; i < shapesArray.length; i++) {
			if (shapesArray[i] == null) {
				shapesArray[i] = shape;
				count++;
				break;
			} else if (count == 4) {
				System.out.println("You've made this board full!");
				break;
			}
		}
	}

	public void delShape(Shape shape) {
		for (int i = 0; i < shapesArray.length; i++) {
			if (shapesArray[i] != null && shapesArray[i].equals(shape)) {
				count--;
				shapesArray[i] = null;

			}
		}

	}

	public void delAll() {
		for (int i = 0; i < shapesArray.length; i++) {
			shapesArray[i] = null;
		}
		totalArea = 0;
		count = 0;
	}

	public void getInfo() {
		totalArea = 0;
		for (int i = 0; i < shapesArray.length; i++) {
			if (shapesArray[i] != null) {
				totalArea += shapesArray[i].getArea();
			}
			System.out.println(shapesArray[i]);
		}
		System.out.println("Total area of this shapes is: " + totalArea);
	}

	public Shape[] getShapesArray() {
		return shapesArray;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Board{" + "shapesArray=" + Arrays.toString(shapesArray) + ", count=" + count + ", totalArea="
				+ totalArea + '}';
	}
}
