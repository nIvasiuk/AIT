
// 1
//Реализовать класс Student с полями имя, количество пропущенных занятий.
// Создать класс Group, который «управляет» массивом студентов.
// В классе Group реализовать методы: добавить студента в группу,
// получить список студентов в виде нового объекта Group.
//
//2*
//Добавить в класс Student поле-массив с оценками (double[] rate).
// Реализовать в программе возможность получить имя самого успевающего (по среднему балу) студента.

// Реализовать класс Group метод, который ищет в группе студента с заданным именем.


public class Main {
    public static void main(String[] args) {

        Group group1 = new Group();


        group1.addStudentToGroup( new Student("Max", 2));
        group1.addStudentToGroup( new Student("Ivan", 10));
        group1.addStudentToGroup( new Student("Inga", 4));
        group1.addStudentToGroup( new Student("Anna", 0));

        System.out.println(group1);
        System.out.println( "__________________________________");

        group1.getStudent(0).setRate(new double[] {2, 2, 2, 2});
        group1.getStudent(1).setRate(new double[] {6, 6, 4, 4.2});
        group1.getStudent(2).setRate(new double[] {3, 4, 3.1, 4.7});
        System.out.println(group1);


        Group group2 = new Group();


        group2.addStudentToGroup(new Student("Leonard", 2));

        System.out.println(group2);

        System.out.println(group1.getStudent(1).averegeGrade());

        System.out.println(group1.getBestStudent());
        System.out.println("__________________________");
        System.out.println(group1.getStudentByName("Inga"));


    }
}