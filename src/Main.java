public class Main {


    public static void main(String[] args) {
        System.out.println("Task 7.5.1");


        System.out.println("Calculation through interface:");
        Calculatable c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));


    }


}
