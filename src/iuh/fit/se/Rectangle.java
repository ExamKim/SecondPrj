/*
 * @ (#) .java       1.0 8/26/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;

/**
 * @description:
 * @author: Chiu Kim Thi
 * @version: 1.0
 * @created: 8/26/2024
 */

public class Rectangle {
    private double length,width;

    public Rectangle(double length, double width) {
        if (width > 0 && length > 0) {
            this.width = width;
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    public double getPerimeter() {
        return (length+width)*2;
    }

    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "Length = " + length +
                ", Width = " + width +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea();
    }
}


