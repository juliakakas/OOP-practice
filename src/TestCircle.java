public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("My circle has a radius of "+ c1.getRadius() + "and an area of "+ c1.getArea());

        Circle c2 = new Circle(2.5);
        System.out.println("This circle ha a radius of " + c2.getRadius() + "and an area of " + c2.getArea());

        Circle c3 = new Circle(3.0,"white");
        System.out.println("Radius: "+ c3.getRadius() + " Area: "+ c3.getArea()+ " Color: "+ c3.getColor());

        /*
        System.out.println(c1.radius);
        c1.radius= 5.0;
        Private (radius and color) and not public!
        */

        Circle c4 = new Circle();
        c4.setRadius(5.5);
        c4.setColor("Green");
        System.out.println("Radius: " + c4.getRadius()+ " Area: "+ c4.getArea()+ " Color: "+ c4.getColor());
        c4.setColor("Yellow");
        System.out.println("New color for this circle: "+ c4.getColor());

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());

        Circle c6 = new Circle(6.6);
        System.out.println(c6.toString());
        System.out.println(c6);
        System.out.println("Operator '+' invokes toString() too: " + c6);
    }
}
