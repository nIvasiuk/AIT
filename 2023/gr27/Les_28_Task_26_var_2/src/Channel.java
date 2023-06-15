import java.util.Random;

public class Channel {
    private Program [] programs;
    private int countOFPrograms;

    public Channel(){
        this.programs = new Program[10];
        countOFPrograms = 0;
    }

    public void addProgram(){

    }

    public void showProgram(){
        Random randomNumber = new Random();
        int index = randomNumber.nextInt(programs.length);
        System.out.println(programs[randomNumber].getName());
    }
}
