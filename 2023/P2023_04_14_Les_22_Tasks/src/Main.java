public class Main {
    public static void main(String[] args) {
       /*
       // Создайте метод void eatHealthy(String food)
        // Если еда равна "бургер"
        // то метод бросает ошибку с сообщением "Бургеры тебя убьют, не ешь"
        // Если еда не равна "бургер" - выводит в консоль "Приятного аппетита"
        // вызовите этот  метод в мейне и оберните в try catch
        */
try {

    eatHealthy("бургер");
} catch (Exception e){
    System.out.println(e.getMessage());
}
    }

    public static void eatHealthy(String food) throws Exception {
        if (food.equalsIgnoreCase("бургер")){
            throw new Exception("Бургеры тебя убьют, не ешь");
        } else {
            System.out.println("Приятного аппетита");
        }
    }
}