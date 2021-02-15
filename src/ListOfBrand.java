import java.util.List;
import java.util.Objects;

public class ListOfBrand {


    private List<String> brandOfBike;

    public ListOfBrand() {
    }

    public ListOfBrand(List<String> brandOfBike) {
        this.brandOfBike = brandOfBike;
    }

    public static void doSomething(List<String> brand) {


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListOfBrand)) return false;
        ListOfBrand that = (ListOfBrand) o;
        return Objects.equals(brandOfBike, that.brandOfBike);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandOfBike);
    }

    @Override
    public String toString() {
        return "" + brandOfBike;
    }

    public void methodAddLastPosition(String nameOfBrand) {
        brandOfBike.add(nameOfBrand);
    }

    public void methodAddFirstPosition(String nameOfBrand) {
        brandOfBike.add(0, nameOfBrand);
    }

    public void readListInRevers() {
        int a = brandOfBike.size();
        int j = a - 1;
        int k;
        System.out.println();
        System.out.println("Прочитываем список по элементу с конца и начала :");
        for (int i = a - 1; i >= (a / 2); i--) {
            System.out.println(brandOfBike.get(i));
            if (i >= (a / 2)) {
                k = (a - 1) - j;
                System.out.println(brandOfBike.get(k));
                j--;
            }
        }
    }

    public void randomMiddle() {

        int b = brandOfBike.size() - 1;
        double r = Math.random() * b;
        int r1 = (int) Math.ceil(r);
        if (r1 == 0) {
            r1++;
        } else if (r1 == brandOfBike.size() - 1) {
            r1--;
            System.out.println();
        }
        String t = brandOfBike.get(r1);
        brandOfBike.remove(r1);
        brandOfBike.add(t);
        System.out.println();
        System.out.println("Берем случайный элемент из середины первого списка и кладем его в конец :");
        for (int i = 0; i < brandOfBike.size(); i++) {
            System.out.println(brandOfBike.get(i));
        }
    }
}
