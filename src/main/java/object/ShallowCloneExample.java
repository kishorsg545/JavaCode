package object;

public class ShallowCloneExample
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course=new Course();
        course.setName("Math");

        Student student=new Student("Ram",course);
        Student originalStudent=(Student)student.clone();

        System.out.println(student == originalStudent);
        System.out.println(student.getCourse() == originalStudent.getCourse());
    }
}
