package Todopackage;

public class Date implements Comparable<Date> {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "(" + day + "/" + month + "/" + year + ')';
    }

    @Override
    public int compareTo(Date o) {
        if (this.year != o.year) {
            return this.year - o.year;
        } else if (this.month != o.month) {
            return this.month - o.month;
        } else if (this.day != o.day) {
            return this.day - o.day;
        }
        return 0;
    }

}
