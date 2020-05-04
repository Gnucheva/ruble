public class Main {
    public static void main(String[] args) {
        long bill = 200;
        long amount = 1300;
        long total;
        if (amount > 1001) {
            int bonus = (int) amount / 100;
            total = bonus + amount + bill;
        } else {
            total = bill + amount;
        }
        System.out.println(total);
    }
}
