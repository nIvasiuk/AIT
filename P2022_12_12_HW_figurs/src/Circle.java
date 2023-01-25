public class Circle extends Figure {

    private double radius;


public Circle(String name, double radius){
    super(name);
    this.radius = radius;
    }

    public void calculateArea(){
    double area;
    area = radius * radius * Math.PI;
        System.out.printf("Area of %s is %.2f. ", name, area);
    }
}
