import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /*
      Task 26
Есть телевизор (TV)

В телевизоре можно хранить набор каналов (Channel).
В каждом канале может быть набор передач (Program).

Есть пуль от телевизора (RemoteController).

Реализовать в пульте метод:

public void on(int channelNumber) - данный метод
позволит показать (напечатать в консоль) случайную передчу
канала с номером channelNumber

В main продемонстрировать работу программу


Был водитель, он связан с автобусом, а втобус с ним
Был автобус, у него были пассажиры.

Есть телевизор, он связан с пультом.

Есть телевизор, и в нем массив каналов.
Есть канал, а в канале массив программ.

remoteController.on(2)
  -> Tv
    -> Channel
      -> Program -> печатает свое название
        */

        TV tv = new TV("SONY", "MR-589");

        Channel channelNews = new Channel(1, "News-De");

        Program morningNews = new Program("Morning News");
        Program eveningNews = new Program("Evening News");
        Program sportToday = new Program("Sport Today");

        channelNews.addProgram(morningNews);
        channelNews.addProgram(eveningNews);
        channelNews.addProgram(sportToday);

        channelNews.printProgramList();

        Channel channelMusic = new Channel(2, "Music-De");

        Program historyOfMusic = new Program("History of Music");
        Program musicNews = new Program("Music News");
        Program musicToday = new Program("Music Today");


        channelMusic.addProgram(historyOfMusic);
        channelMusic.addProgram(musicNews);
        channelMusic.addProgram(musicToday);

        channelMusic.printProgramList();


        Channel channelArt = new Channel(3, "Art-De");

        Program historyOfAtr = new Program("History of Art");
        Program ArtNews = new Program("Art News");
        Program artToday = new Program("Art Today");

        channelArt.addProgram(historyOfAtr);
        channelArt.addProgram(ArtNews);
        channelArt.addProgram(artToday);

        channelArt.printProgramList();

        RemoteController remoteController = new RemoteController(tv);

        tv.addChannel(channelNews);
        tv.addChannel(channelMusic);
        tv.addChannel(channelArt);

        System.out.println();
        remoteController.on(1);
        remoteController.on(2);
        remoteController.on(3);
        remoteController.on(12);

        tv.printChannels();

    }
}