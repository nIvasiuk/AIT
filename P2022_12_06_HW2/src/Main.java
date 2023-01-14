package P2022_12_06_HW2.src;

// 1
//Реализовать класс Student с полями имя, количество пропущенных занятий.
// Создать класс Group, который «управляет» массивом студентов.
// В классе Group реализовать методы: добавить студента в группу,
// получить список студентов в виде нового объекта Group.
//
//2*
//Добавить в класс Student поле-массив с оценками (double[] rate).
// Реализовать в программе возможность получить имя самого успевающего (по среднему балу) студента.
public class Main {
    public static void main(String[] args) {

        Group group1 = new Group();

        group1.addStudentToGroup( new Student("Max", 2));
        group1.addStudentToGroup( new Student("Ivan", 10));
        group1.addStudentToGroup( new Student("Inga", 4));
        group1.addStudentToGroup( new Student("Anna", 0));

        System.out.println(group1);
        System.out.println( "__________________________________");

        group1.getStudent(0).setRate(new double[] {7, 7, 7, 7});
        System.out.println(group1);
    }
}