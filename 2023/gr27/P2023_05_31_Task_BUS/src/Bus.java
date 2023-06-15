public class Bus {
    private String number; // номер автобуса

    private Driver driver; // ссылка на водителя

    public Bus(String number) { // конструктор - принимает на вход какой-то номер
        if (number != null && !number.equals("")) { // проверка номера - он должен быть не null и не пустым
            this.number = number;
        } else {
            this.number = "NO_NUMBER";
        }
    }

    public String getNumber() {
        return number;
    } // метод для получения номера

    public void setDriver(Driver driver) { // метод для фиксации водителя
        if (this.driver != null) { // если предыдущий водитель был - освобождаем его от управления
            this.driver.free(); // освобождаем предыдущего водителя
        }
        this.driver = driver; // задаем нового водителя
    }

    public void go() { // метод, который заставляет ехать автобус, с сообщением об имени водителя
        if (driver == null) {
            System.err.println("Нет водителя!");
        } else {
            System.out.println("Автобус - " + number
                    + " в пути, под управлением - " + driver.getName());
        }
    }
}
