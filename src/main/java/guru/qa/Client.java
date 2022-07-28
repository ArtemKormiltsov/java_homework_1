package guru.qa;

public class Client {

    int age;
    int experience;
    String name;

    public Client(int age, int experience, String name) {
        this.age = age;
        this.experience = experience;
        this.name = name;
    }

    void loanDecision() {
        if (age >= 21 & experience >= 6) {
            System.out.println("Вам одобрен кредит, в ближайшее время с вами свяжется наш менеджер.");
        } else {
            System.out.println("К сожалению, Вам отказано в кредите.");
        }
    }

    void clientName() {
        System.out.println("Уважаемый, " + name + " !");
    }

}
