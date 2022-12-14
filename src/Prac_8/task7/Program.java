package Prac_8.task7;

public class Program {
    public static void recursion(int n, int key) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (key > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % key == 0) {
            System.out.println(key);
            recursion(n / key, key);
        } // Шаг рекурсии / рекурсивное условие
        else {
            recursion(n, ++key);
        }
    }
    public static void main(String[] args) {
        recursion(18, 2); // вызов рекурсивной функции
    }
}
