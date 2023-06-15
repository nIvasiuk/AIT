public class RemoteController {
    private TV tv;

    public RemoteController(TV tv) {
    this.tv = tv;
    }

    public void on(int channelNumber){
        tv.ranChannel(channelNumber).showProgram();

    }
}
