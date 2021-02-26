import java.util.Comparator;

public class NameSurenameComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {

        return o1.getNameOfStudent().compareTo(o2.getNameOfStudent());


    }
}



