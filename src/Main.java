import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Checking all the circle methods work
        Circle circleOne = new Circle();
        Circle circleTwo = new Circle(10, 10, 4);
        Circle circleThree = new Circle(circleTwo);

        // Getting the areas for the circles
        System.out.println(circleOne.getArea());
        System.out.println(circleTwo.getArea());
        System.out.println(circleThree.getArea());

        // Setting the diff dimensions of the circle
        circleTwo.setX(2);
        circleTwo.setY(3);
        circleTwo.setR(5);

        // Ensuring everything works as intended
        System.out.println(circleTwo.getX());
        System.out.println(circleTwo.getY());
        System.out.println(circleTwo.getR());

        System.out.println(circleThree.findDist(circleOne));
        circleThree.isOverlapping(circleOne);
        System.out.println(circleTwo.getCircumference());

        circleOne.getEq();
        circleTwo.getEq();
        circleThree.getEq();
    }
}