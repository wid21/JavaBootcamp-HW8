// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle("Red", true,3,5);
        System.out.println("The Perimeter for Rectangle is : " + r1.getPerimeter()  +
                " The Area of Rectangle is : " + r1.getArea() +  " The color of Rectangle is : " + r1.getColor()+
                " The Rectangle filled is: " + r1.isFilled() + r1.toString());

        Circle c1 = new Circle("Yellow", false,2);
        System.out.println( "The Perimeter for Circle is : " + c1.getPerimeter()+
                " The Area of Circle is : " + c1.getArea() + " The color of Circle is : "
                +c1.getColor() + " The Circle filled is: " +  c1.isFilled() + c1.toString());

        Square s1 = new Square("Blue", true , 0,4);
        System.out.println( "The Perimeter for Square is : " + s1.getPerimeter()+
                " The Area of Square is : " + s1.getArea() + " The color of Square is : "
                + s1.getColor() + " The Square filled is " +  s1.isFilled() + s1.toString());


    }
}