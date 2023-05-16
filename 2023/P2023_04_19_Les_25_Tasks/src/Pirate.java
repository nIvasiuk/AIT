public class Pirate {
     /*     name;
            nickName;
            boolean isDrunk;
         Создать конструктор и toString

         *** сделайте метод drink
         метод должен менять знaчение поля isDrunk на true
        */

    String name;
    String nickName;
    boolean isDrunk;

    Pirate(String name, String nickName, boolean isDrunk){
      this.name = name;
      this.nickName = nickName;
      this.isDrunk = isDrunk;
    }

  @Override
  public String toString() {
        if (isDrunk){
            return  name + " " +
                    nickName +
                    ". Hi is drank.";
        }
      return  name + " " +
              nickName +
              ". He is sober.";
  }

  /*
  Создать в классе Pirate метод say
         метод должен выводить в консоль
         "It is a bad day" - если пират трезв
         "Yohohoho, what a good life" - если пират пьян
         Создайте несколько пиратов, вызовите метод say
   */

    public void say(Pirate pirate){
        if (isDrunk){
            System.out.println("Yohohoho, what a good life");
        } else {
            System.out.println("It is a bad day");
        }
    }
}
