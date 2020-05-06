public class Main {
    public static void main(String[] args) {
        int bill = 200;
        int amount = 1001;
        int total;
        if (amount > 1000) {
            int bonus = (int) amount / 100;
            total = bonus + amount + bill;
        } else {
            total = bill + amount;
        }
        System.out.println(total);
    }
}
