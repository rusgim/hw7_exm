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
    }
}