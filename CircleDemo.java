
public class CircleDemo
{
    public static void main(String[] args)
    {
        System.out.println("The number of Circles is: " + Circle.getNumberOfCircles());
        
        Circle circle1 = new Circle(8.5);
        System.out.println("The number of circles is: " + circle1.getNumberOfCircles());
        
        Circle circle2 = new Circle(5.0);
        System.out.println("The number of circles is: " + circle2.getNumberOfCircles());
        
        System.out.println("The Area of the first circle is: " + circle1.area());
        System.out.println("The Perimeter of the first circle is: " + circle1.circumference() + " cm");
        
        System.out.println("The Area of the second circle is: " + circle2.area());
        System.out.println("The Perimeter of the second circle is: " + circle2.circumference() + " cm");
    }
}
