// метод расчитывает площаль квадтата, прямоуольника, круга.
// с наследованием. все в мессиве


public class Main {
    public static void main(String[] args) {

        Square square1 = new Square("Square1", 10);
        Rectangle rectangle1 = new Rectangle("Rectangle1", 2, 5);
        Circle circle1 = new Circle("Circle1", 4);
        Figure[] figures = {square1, rectangle1, circle1};

        System.out.println(square1);

        for (int i = 0; i < figures.length; i++){
            figures[i].calculateArea();
        }

    }
}