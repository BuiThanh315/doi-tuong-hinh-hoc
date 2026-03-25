//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//Test class Shape
    Shape shape = new Shape();
    System.out.println(shape);

    shape = new Shape("blue", false);
    System.out.println(shape);
    System.out.println("---------------------------------");

//Test class Circle
    Circle circle = new Circle();
    System.out.println(circle);

    circle = new Circle(3.5);
    System.out.println(circle);

    circle = new Circle(3.5, "indigo", false);
    System.out.println(circle);
    System.out.println("---------------------------------");

//Test class Rectangle
    Rectangle rectangle = new Rectangle();
    System.out.println(rectangle);

    rectangle = new Rectangle(2.3, 5.8);
    System.out.println(rectangle);

    rectangle = new Rectangle(2.5, 3.8, "orange", true);
    System.out.println(rectangle);    System.out.println("---------------------------------");


//Test class Square
    Square square = new Square();
    System.out.println(square);

    square = new Square(2.3);
    System.out.println(square);

    square = new Square(5.8, "yellow", true);
    System.out.println(square);
}
