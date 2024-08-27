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

public class TestRectangle {
    public static void main(String[] args) {
                Rectangle rec= new Rectangle(5, 3);
                System.out.println(rec);  // In ra mô tả của hình chữ nhật
                System.out.println("Perimeter : " + rec.getPerimeter());  // Tính chu vi
                System.out.println("Area: " + rec.getArea());  // Tính diện tích
    }
}


