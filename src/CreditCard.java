public enum CreditCard {
    Petrov_Ivan("AlfaBank", "MasterCard", 1111_4444_5555_6666L),
    Sidorov_Roman("PriorBank", "MasterCard", 1111_2222_3432_4444L),
    Sokolov_Vasiliy("BelarusBank", "Visa", 5674_7777_9876_7899L),
    Ivanov_Ivan("BelarusBank", "Visa", 5334_5677_8876_8769L),
    Fomichev_Ivan("AlfaBank", "MasterCard", 2222_2323_5465_6643L),
    Kovolev_Maxim("PriorBank", "MasterCard", 3331_2223_1323_5423L),
    Samsonov_Kiril("BelarusBank", "Visa", 3444_4547_6676_7659L);


    private final String nameOfBank;
    private final String playmentSystem;
    private final Long numberOfCreditCard;

    CreditCard(String nameOfBank, String playmentSystem, long numberOfCreditCard) {
        this.nameOfBank = nameOfBank;
        this.numberOfCreditCard = numberOfCreditCard;
        this.playmentSystem = playmentSystem;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public String getPlaymentSystem() {
        return playmentSystem;
    }

    public Long getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "nameOfBank='" + nameOfBank + '\'' +
                ", playmentSystem='" + playmentSystem + '\'' +
                ", numberOfCreditCard=" + numberOfCreditCard +
                '}';
    }
}