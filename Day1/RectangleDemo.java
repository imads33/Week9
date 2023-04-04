
/*
 * Write a Java class called Rectangle that has fields for the rectangle's width
 * and height. Write a custom Comparator implementation called AreaComparator
 * that sorts Rectangle objects in ascending order based on their area (i.e.,
 * width x height). Then, modify the Rectangle class to implement the Comparable
 * interface, so that Rectangle objects are sorted in ascending order based on
 * their perimeter (i.e., 2 x width + 2 x height). Test your implementation by
 * creating a list of Rectangle objects and sorting them using both the
 * AreaComparator and the Comparable implementation.
 */
import java.util.*;

class Rectangle implements Comparable<Rectangle> {
    int height, width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getLength() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    int getPerimeter() {
        return (2 * height) + (2 * width);
    }

    int getArea() {
        return (height * width);
    }

    public int compareTo(Rectangle rectangle) {
        if (rectangle.getPerimeter() > rectangle.getPerimeter()) {
            return -1;
        } else if (rectangle.getPerimeter() < rectangle.getPerimeter()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class AreaComparator implements Comparator<Rectangle> {
    public int compare(Rectangle rectangle1, Rectangle rectangle2) {
        if (rectangle1.getPerimeter() > rectangle2.getPerimeter()) {
            return 1;
        } else if (rectangle1.getPerimeter() < rectangle2.getPerimeter()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangle = new ArrayList<Rectangle>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            rectangle.add(new Rectangle(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(rectangle, new AreaComparator());
        for (Rectangle rect : rectangle) {
            System.out.println(rect.getLength() + " " + rect.getWidth());
        }

        Collections.sort(rectangle);
        for (Rectangle rect : rectangle) {
            System.out.println(rect.getLength() + " " + rect.getWidth());
        }
    }
}