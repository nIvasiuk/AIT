import java.util.ArrayList;
import java.util.Random;

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

    public int getNumber() {
        return number;
    }

    public Program getRandomProgram(){
        Random random = new Random();
        int index = random.nextInt(programs.size());
        return programs.get(index);
    }

    public void printProgramList(){
        for (Program program : programs) {
            program.printProgram();
        }
    }

    public void printChannels(){
        System.out.println("Channel " + number +" " + name);
    }
}
