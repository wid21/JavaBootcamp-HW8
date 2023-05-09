public class Circle extends Shape{

    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea (){
        return 3.14 * radius * radius;
    }

   @Override
   public double getPerimeter(){
        return 2 * 3.14 * radius ;
    }

    @Override
    public String toString() {
        return " by size of" +
                " radius = " + radius;

    }
}
