public class Figure {
    private final static String COLOURS = "Red Green Yellow Black Blue";
    private  final  static String DEFAULT_COLOUR = "Black";

    private int x;
    private int y;
    private String colour;

    public Figure(int x, int y){
        this.x = x;
        this.y = y;
        this.colour = DEFAULT_COLOUR;
    }
    public void setColour(String colour){
        if (COLOURS.contains(colour)){
            this.colour = colour;
        } else {
            this.colour = DEFAULT_COLOUR;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColour() {
        return colour;
    }
}
