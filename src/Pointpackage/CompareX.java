package Pointpackage;

import java.util.Comparator;

public class CompareX implements Comparator<Point>{

    @Override
    public int compare(Point o1, Point o2) {
        return  Double.compare(o1.getX(), o2.getX());
    }

}
