public class Square extends Rectangle{
    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);

    }

    @Override
    public double getArea(){
        return getLength()*getLength();
    }

    @Override
    public double getPerimeter(){
        return getLength()*4;
    }

    @Override
    public String toString() {
        return " by size of" + " side = "
                + getLength();
    }
}
