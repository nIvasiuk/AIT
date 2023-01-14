package P2022_12_06_HW2.src;

public class Student {
    //Реализовать класс Student с полями имя, количество пропущенных занятий.

    //Добавить в класс Student поле-массив с оценками (double[] rate).

    private String name;
    private int missedClasses;

    double[] rate;

    public Student(String studentName, int missedClasses) {
        this.name = studentName;
        this.missedClasses = missedClasses;
    }

    public void setRate(double[] rate) {
        this.rate = rate;
    }



    @Override
    public String toString() {
        String temp =  "";
        if (rate != null){
            for (int i = 0; i < rate.length; i++){
                temp += rate[i] + " ";
            }
        }
        temp = temp.equals("") ? " / оценки отсутсвуют " :  "/" + temp;
        return String.format(" %s (missed classes: %d), %s", name, missedClasses, temp);
    }
}
