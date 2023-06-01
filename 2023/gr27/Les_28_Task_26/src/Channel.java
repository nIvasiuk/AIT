import java.util.ArrayList;

public class Channel {
    private int number;
    private String name;

    private ArrayList <Program> programs;

    public Channel(int number, String name){
        this.number = number;
        this.name = name;
        programs = new ArrayList<Program>();   // при создании канала создается новый список программ
    }

    public void addProgram(Program program){
        programs.add(program);
    }


}
