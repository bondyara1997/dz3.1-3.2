public class Main {
    public static void main(String[] args) {
        Account simple = new SimpleAccount(1000);
        Account credit = new CreditAccount(500);

        simple.pay(300);
        credit.pay(200);

        System.out.println("Simple: " + simple.getBalance());
        System.out.println("Credit: " + credit.getBalance());

        simple.transfer(credit, 500);
        System.out.println("Transfer success: " + simple.transfer(credit, 500));
    }
}