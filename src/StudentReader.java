import ro.fasttrackit.curs11.extramile.StudentGrade;

import java.util.List;
import java.util.Scanner;

public class StudentReader {
    public List<StudentGrade> readFile(String fileLocation) {
        Scanner scanner = new Scanner(fileLocation);
        while (scanner.hasNextLine()) {
            StudentGrade studentGrade = fetchStudentGrade(scanner.nextLine());
            students.add(studentGrade);
        }
        return students;

        private StudentGrade fetchStudentGrade (String line){
            String[] tokens = line.split(regex:"[]");
            return new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2]));

            return null;
        }
    }
        System.out.println(scanner.nextLine());
        return List.of();
}
}

