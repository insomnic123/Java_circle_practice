public class Circle {

    private double x; // x-coordinate of centre
    private double y; // y-coordinate of centre
    private double r; // radius


    public Circle() {
        x = 0;
        y = 0;
        r = 1;
    }

    public Circle(double xCord, double yCord, double radius) {
        x = xCord;
        y = yCord;
        r = radius;
    }

    public Circle(Circle c){
        this.x = c.x;
        this.y = c.y;
        this.r = c.r;
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public double getArea(){
        return 3.14*r*r;
    }

    public double getCircumference(){
        return 2*3.14*r;
    }

    public String toString() {
        return ("");
    }

    public void setX(int value) {
        this.x = value;
    }
    public void setY(int value) {
        this.y = value;
    }
    public void setR(int value) {
        this.r = value;
    }

    public double findDist(Circle f) {

        double distX = (f.x - this.x)*(f.x - this.x);
        double distY = (f.y - this.y)*(f.y - this.y);

        return Math.sqrt(distX+distY);
    }

    public void isOverlapping(Circle f) {
        double distX = (f.x - this.x) * (f.x - this.x);
        double distY = (f.y - this.y) * (f.y - this.y);
        double centerDist = Math.sqrt(distX + distY);

        double sumOfRadii = this.r + f.r;

        if (centerDist > sumOfRadii) {
            System.out.println("The circles are separate.");
        } else if (centerDist < Math.abs(this.r - f.r)) {
            System.out.println("One circle is inside the other.");
        } else {
            System.out.println("The circles are overlapping.");
        }
    }

    public void getEq() {
        System.out.printf("(x-%f)^2 + (y-%f)^2 = %f%n", this.x, this.y, this.r*this.r);
    }
}


