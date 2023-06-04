import java.util.ArrayList;

public class TV {
/*
В телевизоре можно хранить набор каналов (Channel).
В каждом канале может быть набор передач (Program).
 */

    private String model;
    private String number;
    private ArrayList <Channel> channels;
    private RemoteController remoteController;

    public TV(String model, String number) {
        this.model = model;
        this.number = number;
        channels = new ArrayList<Channel>();
    }

    public void addChannel(Channel channel) {
        channels.add(channel);
    }
   public Channel getChannel(int channelNumber) {
        for (Channel channel : channels){
            if (channel.getNumber() == channelNumber){
                return channel;
            }
        }
   return null;
   }

   public void printChannels(){
        for (Channel channel : channels){
            channel.printChannels();
        }
   }
}
