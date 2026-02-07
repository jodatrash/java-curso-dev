package basic.c08_oop.ClassesExercises;

public class Student {
    // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).

    int score;

    public Student(int score) {
        this.score = score;
    }

    public boolean isApproved(){
        return score >=60;
    }
}
