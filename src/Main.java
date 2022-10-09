import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        //задание 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        //задание 2
        System.out.println(" ");
        for (int i1 = 10; i1 >= 1; i1--) {
            System.out.println("Итерация цикла в обратном порядке " + i1);
        }
        //задание 3
        System.out.println(" ");
        int k = 0;
        for (; k <= 17;  k++) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }
        //задание 4
        System.out.println(" ");
        for (int m = 10; m >= -10; m--) {
            System.out.println(m);
        }
        //задание 5
        System.out.println(" ");
        for (int i3 = 1904; i3 <= 2096; i3 = i3 + 4) {
            System.out.println(i3 + " год является високосным");
        }
        //задание 6
        System.out.println(" ");
        for (int s = 7; s <= 98; s = s + 7) {
            System.out.println(s);
        }
        //задание 7
        System.out.println(" ");
        for (int u = 1; u <= 512; u = u * 2) {
            System.out.println(u);
        }
        //задание 8
        System.out.println(" ");
        int salary = 29000;
        int total = 0;
        for (int z = 1; z <= 12; z++) {
            total = total + salary;
            System.out.println("Месяц " + z + " , сумма накоплений равна " + total + " рублей");
        }
        //задание 8
        System.out.println(" ");
        int salaryPercentages = 29000;
        int total2 = 0;
        for (int p = 1; p <= 12; p++) {
            total2 = (total2 + total2 / 100);
            total2 = total2 + salaryPercentages;
            System.out.println("Месяц " + p + " , сумма накоплений равна " + total2 + " рублей");
        }

    }
}

