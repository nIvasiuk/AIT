public class Rectangle extends Figure {
    private double height;
    private double weight;

    public Rectangle(String name, double height, double weight){
        super(name);
        this.height = height;
        this.weight = weight;
    }

    public void calculateArea(){
        double area;
        area = height * weight;
        System.out.printf("Area of %s is %.2f. ", name, area);
    }
}
