import java.util.*;

public class Main {


    public static void main(String[] args) {

        Deque<String> queue = new LinkedList<>();

        Deque_Queue deque = new Deque_Queue(queue);

        deque.methodAddElementaryQueue();

        System.out.println("______");
        System.out.println("Добавим имена 3-х новых пациентов");
        deque.addNewMember("11.Svetlana");
        deque.addNewMember("12.Yuri");
        deque.addNewMember("13.Stepan");

        for (String text : queue) {
            System.out.println(text);
        }
        System.out.println("____");
        System.out.println("Сыграем в игру на выбывание и распечатаем на экран того, кто пришел последним:");
        deque.singleEliminationGame();
        System.out.println(deque.toString() + " - распечатаем последнего оставшегося участника");
        System.out.println("____");
        deque.clearDeque();
        deque.methodAddElementaryQueue();
        deque.randomSort();

        deque.removeAllExcept1st();

        System.out.println("____");
        List<String> brandOfBike = new ArrayList<>();
        brandOfBike.add("Fuji");

        ListOfBrand listOfBrand = new ListOfBrand(brandOfBike);

        listOfBrand.methodAddFirstPosition("RIZER");
        listOfBrand.methodAddLastPosition("GT");
        listOfBrand.methodAddFirstPosition("Aist");
        listOfBrand.methodAddLastPosition("TREK");
        listOfBrand.methodAddFirstPosition("CANNONDALE");
        listOfBrand.methodAddLastPosition("CUBE");
        listOfBrand.methodAddFirstPosition("Merida");

        for (String e : brandOfBike)
            System.out.println(e);

        listOfBrand.readListInRevers();

        listOfBrand.randomMiddle();

        System.out.println("____");
        Set<CreditCard> listCreditCard = new TreeSet<>();
        listCreditCard.add(CreditCard.Ivanov_Ivan);
        listCreditCard.add(CreditCard.Fomichev_Ivan);
        listCreditCard.add(CreditCard.Petrov_Ivan);
        listCreditCard.add(CreditCard.Kovolev_Maxim);
        listCreditCard.add(CreditCard.Samsonov_Kiril);
        listCreditCard.add(CreditCard.Sokolov_Vasiliy);
        listCreditCard.add(CreditCard.Sidorov_Roman);


        for (CreditCard l : listCreditCard)
            System.out.println(l);

        System.out.println("____");
        System.out.println("Cоздадим список весов грузов: ");
        Set<Integer> listOfCargo = new HashSet<>();
        listOfCargo.add(700);
        listOfCargo.add(300);
        listOfCargo.add(600);
        listOfCargo.add(450);
        listOfCargo.add(328);
        listOfCargo.add(60);
        listOfCargo.add(155);
        listOfCargo.add(306);
        listOfCargo.add(490);
        listOfCargo.add(860);

        SetCargo weightOfCargo = new SetCargo(listOfCargo);
        weightOfCargo.addNewWeight(230);
        weightOfCargo.addNewWeight(1000);

        Iterator<Integer> iterator = listOfCargo.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        weightOfCargo.sumWeight();

        NavigableSet<Integer> permissible_weight = new TreeSet<>();
        permissible_weight.addAll(listOfCargo);

        SetCargo i = new SetCargo(permissible_weight);
        i.unloadingCargo();
        i.polnaiaRazgruzka();

        System.out.println("______");

        Map<String, String> initialListUsers = new HashMap<>();
        initialListUsers.put("Svetlana_Ivanova", "Svetik123");
        initialListUsers.put("Roman_Bondarenko", "5ROMJk");
        initialListUsers.put("Nikilay_Vorobey", "Nicos4");
        initialListUsers.put("Kiril_Lebedev", "Kicker33");
        initialListUsers.put("Vadim_Kisilev", "Potter6");
        initialListUsers.put("Ivan_Ivanov", "QWERTY_123");
        initialListUsers.put("Anton_Golubev", "LOMik000");
        initialListUsers.put("Nikolay_Vinokurov", "Klon546");

        System.out.println("______");

        Users listusers = new Users(initialListUsers);

        listusers.addNewUser("Alexey", "777GGhf");

        listusers.addNewUser("T11", "2345HHff");
        listusers.addNewUser("Petro", "2hgH45h");

        for (Map.Entry<String, String> listUsers : initialListUsers.entrySet())
            System.out.println(listUsers.getKey() + " - " + listUsers.getValue());
        listusers.removeUser("Petro");

        for (Map.Entry<String, String> listUsers : initialListUsers.entrySet())
            System.out.println(listUsers.getKey() + " - " + listUsers.getValue());

        System.out.println("____");
        Set<Student> studentSet = new HashSet<>();

        Student student1 = new Student("Svetlana_Ivanova");
        Student student2 = new Student("Roman_Bondarenko");
        Student student3 = new Student("Nikilay_Vorobey");
        Student student4 = new Student("Vadim_Kisilev");
        Student student5 = new Student("Kiril_Lebedev");
        Student student6 = new Student("Ivan_Ivanov");
        Student student7 = new Student("Anton_Golubev");
        Student student8 = new Student("Nikolay_Vinokurov");

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);
        studentSet.add(student6);
        studentSet.add(student7);
        studentSet.add(student8);

        for (Student s : studentSet)
            System.out.println(s);


    }
}


















