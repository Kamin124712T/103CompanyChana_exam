package Pointpackage;

import java.util.Comparator;

public class CompareY implements Comparator<Point>{

    @Override
    public int compare(Point o1, Point o2) {
        return ((Double) o1.getY()).compareTo(o2.getY());
    }
    
}
