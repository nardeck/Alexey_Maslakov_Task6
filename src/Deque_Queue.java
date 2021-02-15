import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;

public class Deque_Queue {

    private Deque<String> deque;

    public Deque_Queue() {
    }

    public Deque_Queue(Deque<String> deque) {
        this.deque = deque;
    }


    public void addNewMember(String name) {
        deque.addLast(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deque_Queue)) return false;
        Deque_Queue that = (Deque_Queue) o;
        return Objects.equals(deque, that.deque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deque);
    }

    public void methodAddElementaryQueue() {
        System.out.println();
        System.out.println("Создадим изначальную очередь в поликлинике и выводим на экран: ");
        System.out.println();
        deque.add("1.Artem");
        deque.add("2.Andrey");
        deque.add("3.Vadim");
        deque.add("4.Joe");
        deque.add("5.Elena");
        deque.add("6.Nikolay");
        deque.add("7.Phil");
        deque.add("8.Pavel");
        deque.add("9.Aleksey");
        deque.add("10.Grigory");
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void singleEliminationGame() {
        if ((deque.size() - 1) % 3 == 0) {
            for (int i = 0; i <= deque.size(); i++) {
                deque.removeFirst();
                deque.removeFirst();
                System.out.println(deque.getLast());
                deque.removeLast();
            }
            Iterator<String> iterator = deque.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else
            System.out.println("В этой поликлинике в очередь запускают по три человека, введите имена 3-х новых пациентов");
    }

    @Override
    public String toString() {
        return "В очереди остался один человек" + deque;
    }

    public void clearDeque() {
        deque.clear();
    }

    public void randomSort() {
        System.out.println("");
        System.out.println("Рандомно перемешаем:");
        int b = deque.size() - 1;
        double r = Math.random() * b;
        int r1 = (int) Math.ceil(r);
        for (int i = 0; i < r1; i++) {
            deque.addLast(deque.peekFirst());
            deque.pollFirst();
            deque.addLast(deque.peekFirst());
            deque.pollFirst();
            deque.addLast(deque.peekFirst());
            deque.pollFirst();
        }
        Iterator<String> iterator1 = deque.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }

    public void removeAllExcept1st() {
        int b = deque.size() - 1;
        System.out.println();
        System.out.println("Удаляем все элементы за исключением первого");
        for (int i = 0; i < b; i++) {
            deque.removeLast();
        }
        Iterator<String> iterator2 = deque.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}