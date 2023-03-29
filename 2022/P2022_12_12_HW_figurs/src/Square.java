public class Square extends Figure {

    private double height;

    public Square(String name, double height){
        super(name);
        this.height = height;
    }

    public void calculateArea(){
        double area;
        area = height * height;
        System.out.printf("Area of %s is %.2f. ", name, area);
    }
}
