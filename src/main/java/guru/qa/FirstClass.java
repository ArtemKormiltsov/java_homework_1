package guru.qa;

public class FirstClass {

    public static void main(String[] args) {
        Client someClient = new Client(21,6,"Александр Николаевич");
        someClient.clientName();
        someClient.loanDecision();
    }
}
