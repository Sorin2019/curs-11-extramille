public class Main {
    public static void main(String[] args) throws Exception {
        StudentReader reader = new StudentReader();
        reader = new StudentReader();
        reader.readFile("grades.txt");

        Classroom classroom = new Classroom(students);
        System.out.println(classroom.getGrades(discipline:"Computer Science"));

    }

}

