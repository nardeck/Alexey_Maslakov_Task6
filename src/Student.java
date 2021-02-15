public class Student implements Comparable {

    private String nameOfStudent;


    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }


    @Override
    public int compareTo(Object o) {

        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                '}';
    }
}
