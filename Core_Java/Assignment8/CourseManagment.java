package Assignment8;

public class CourseManagment {
    abstract class CourseType { String name; CourseType(String n){name=n;} }
    class ExamCourse extends CourseType { ExamCourse(String n){super(n);} }
    class AssignmentCourse extends CourseType { AssignmentCourse(String n){super(n);} }

    class Course<T extends CourseType> {
        private List<T> courses = new ArrayList<>();
        public void addCourse(T course){ courses.add(course); }
        public void showCourses(){
            for(T c : courses) System.out.println(c.name);
        }
    }

}
