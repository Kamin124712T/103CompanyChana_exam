package Pointpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSortPoint {

    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5,1));
        list.add(new Point(2,4));
        list.add(new Point(3,3));
        list.add(new Point(4,2));
        list.add(new Point(1,5));
        System.out.println("Before sorting:");
        System.out.println(list);
        System.out.println("After sorting by X coordinate:");
        Collections.sort(list, new CompareX());
        System.out.println(list);
        System.out.println("After sorting by Y coordinate:");
        Collections.sort(list, new CompareY());
        System.out.println(list);
    }
}

