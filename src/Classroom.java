import ro.fasttrackit.curs11.extramile.StudentGrade;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> students;

    public Classroom(List<StudentGrade> students) {
        this.students = new ArrayList<>(students);

    }

    public List<Integer> getGrades(String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade student : students) {
            if (student.getDiscipline().equals(discipline)) {
                result.add(student.getGrade());
            }
        }
        return result;

    }
}

