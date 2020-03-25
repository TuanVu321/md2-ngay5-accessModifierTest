public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setColor("blue");
        circle1.setRadius(10.56);
        System.out.println(circle1.getColor()+" "+circle1.getRadius());
        Circle circle2 = new Circle(2.5);
        System.out.println(circle2.getColor()+" "+circle2.getRadius());
    }
}
