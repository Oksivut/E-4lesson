package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Figure square = new Square("Square", 66);
        System.out.println(square.toString());
        System.out.println(square.perimeter());
        System.out.println(square.area());
        System.out.println();

        Figure rectangle = new Rectangle("Rectangle", 8, 9);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());
        System.out.println();

        Figure circle = new Circle("Circle", 5);
        Figure circle2 = new Circle("Circle", 1);
        System.out.println(circle.toString());
        System.out.println(circle.perimeter());
        System.out.println(circle.area());
        System.out.println();

        Figure sphere = new Sphere("Sphere", 9);
        System.out.println(sphere.toString());
        System.out.println(sphere.perimeter());
        System.out.println(sphere.area());
        System.out.println();


        Picture picture = new Picture();
        picture.addToList(square);
        picture.addToList(rectangle);
        picture.addToList(circle);
        picture.addToList(sphere);
        picture.addToList(circle2);
        System.out.println(picture.namesOfFigures());
        System.out.println(picture.sumOfPerimeters());
        System.out.println(picture.sumOfAreas());
        System.out.println(picture.countOfFigures());

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.add(12.00, 19.15));
        System.out.println(mathematics.add(5, 25));

        int[] array1 = {10, 20, 30};
        int[] array2 = {11, 12, 13};
        System.out.println(Arrays.toString(mathematics.add(array1, array2)));

        List list1 = new ArrayList();
        list1.add(5);
        list1.add(10);
        List list2 = new ArrayList();
        list2.add(20);
        System.out.println(mathematics.add(list1, list2));

        HashMap<Integer, String> rights = new HashMap<>();
        HashMap<Integer, String> obligations = new HashMap<>();
        rights.put(115454, "Application");
        rights.put(123543, "Claim");
        obligations.put(1111111, "Proof");
        obligations.put(8082771, "Answer");
        rights.putAll(obligations);
        System.out.println(rights);


    }
}








