

// Создать класс Group, который «управляет» массивом студентов.
// В классе Group реализовать методы: добавить студента в группу,
// получить список студентов в виде нового объекта Group.

// Реализовать в программе возможность получить имя самого успевающего (по среднему балу) студента.



public class Group {

    private int capacity = 4;
    private Student[] array = new Student[capacity];

    private int size = 0;


    public void addStudentToGroup(Student student){
        if (size < array.length){
            array[size++] = student;   // как он тут понимает, что size++ это соответсвующий индекс массива, если size это счётчик.

        }
    }

    public Student getStudent(int index){
        if (index < size && index >= 0 ){
            return array[index];
        } else {
            return null;
        }
    }

    public Student getBestStudent(){
        Student best = array[0];
        for (int i = 0; i < size; i++) {
            if (best.averegeGrade() < array[i].averegeGrade()) {
                best = array[i];
            }
        }
        return best;
    }



    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++){
            res += array[i] + "\n";
                    }
        return res;
    }
}
