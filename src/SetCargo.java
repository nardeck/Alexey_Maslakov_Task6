import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;

public class SetCargo {

    public final int MAX_WEIGHT = 5000;

    private   Set<Integer> listOfCargo;
    private NavigableSet<Integer> permissible_weight;


    public SetCargo() {
    }

    public SetCargo(Set<Integer> listOfCargo) {
        this.listOfCargo = listOfCargo;
    }

    public SetCargo(NavigableSet<Integer> permissible_weight) {
        this.permissible_weight = permissible_weight;
    }

    @Override
    public String toString() {
        return "SetCargo{" +
                "listOfCargo=" + listOfCargo +
                '}';
    }

    public void addNewWeight(Integer weight) {
        listOfCargo.add(weight);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof SetCargo)) return false;
    SetCargo setCargo = (SetCargo) o;
    return MAX_WEIGHT == setCargo.MAX_WEIGHT && Objects.equals(listOfCargo, setCargo.listOfCargo) && Objects.equals(permissible_weight, setCargo.permissible_weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MAX_WEIGHT, listOfCargo, permissible_weight);
  }

  public void sumWeight() {
        int s = 0;
        Iterator<Integer> iterator = listOfCargo.iterator();
        while (iterator.hasNext()) {
            s += iterator.next();
        }
        System.out.println("_____");
        System.out.println("Cумма всех грузов равна " + s + " кг");
        if (s >= MAX_WEIGHT) {
            int s1 = s - MAX_WEIGHT;
            System.out.println("Cуммарный вес грузов превышает максимально допустимое значение в 5000 кг, необходимо убрать лишний груз");
            System.out.println("Превышение составляет - " + s1 + "кг");
        }
    }

    public void unloadingCargo() {
        System.out.println("______");
        int s = 0;
        Iterator<Integer> iterator = permissible_weight.iterator();
        while (iterator.hasNext()) {
            s += iterator.next();
        }
        System.out.println(s + " - уберем лишний груз");
        if (s >= MAX_WEIGHT) {
            int s1 = s - MAX_WEIGHT;
            permissible_weight.higher(s1);
            permissible_weight.remove(permissible_weight.higher(s1));
        }
        System.out.println("лишний груз убран!!!");
        System.out.println("Выводим список оставшихся весов грузов :");
        Iterator<Integer> iterator2 = permissible_weight.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        int s3 = 0;
        Iterator<Integer> iterator3 = permissible_weight.iterator();
        while (iterator3.hasNext()) {
            s3 += iterator3.next();
        }
        System.out.println("____");
        System.out.println("Новый суммарный вес равен - " + s3 + "кг");
    }


    public void polnaiaRazgruzka() {
        System.out.println("____");
        System.out.println("А теперь полностью выгрузим весь груз :");
        int b = permissible_weight.size();
        for (int i = 0; i < b; i++) {
            permissible_weight.remove(permissible_weight.first());
        }
        System.out.println(permissible_weight.toString());
    }
}






