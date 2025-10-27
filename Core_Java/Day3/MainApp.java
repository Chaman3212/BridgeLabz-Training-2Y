import college.student.Student;
import college.faculty.Faculty;

    public class MainApp {
        public static void main(String[] args) {
            Student s = new Student("Aarav", 101);
            s.displayName();
            s.displayRoll();

            Faculty f = new Faculty("Mehra Sir", "Data Structures");
            f.displayName();
            f.displaySubject();
        }
    }


