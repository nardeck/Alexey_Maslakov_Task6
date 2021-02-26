import java.util.Objects;

public class Student implements Comparable<Student> {

    private String nameOfStudent;
    private int mark;
    private int age;

    public Student(String nameOfStudent, int mark, int age) {
        this.nameOfStudent = nameOfStudent;
        this.mark = mark;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getMark() == student.getMark() && getAge() == student.getAge() && Objects.equals(getNameOfStudent(), student.getNameOfStudent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfStudent(), getMark(), getAge());
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "" + nameOfStudent +
                ", mark=" + mark +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.getMark() - o.getMark();
    }


}
