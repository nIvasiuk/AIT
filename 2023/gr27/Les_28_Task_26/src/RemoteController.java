public class RemoteController {
    private TV tv;

    public RemoteController(TV tv){
        this.tv = tv;
    }


    /*
    public void on(int channelNumber) - данный метод
позволит показать (напечатать в консоль) случайную передачу
канала с номером channelNumber
     */
   public void on(int channelNumber){
    Channel channel = tv.getChannel(channelNumber);
       if (channel == null){
          System.err.println("Канал отсутствует");
          return;
       }

   Program program = channel.getRandomProgram();
   System.out.println(program.getName());

    }
}
