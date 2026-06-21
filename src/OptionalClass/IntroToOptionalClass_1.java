package OptionalClass;

import java.util.Optional;

class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static Optional<Student> getStudent(int id){
        if (id == 1){
            return Optional.of(new Student(1,"Athulya"));
        }
        return Optional.empty();
    }
}
public class IntroToOptionalClass_1 {
    public static void main(String[] args) {
        Optional<Student> student = Student.getStudent(2);

    }
}
