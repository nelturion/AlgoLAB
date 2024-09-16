package lab0;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();

        //scan number
        FileReader fr = new FileReader("src/input.txt");
        int n = new Scanner(fr).nextInt();
        fr.close();

        //calculate F(22) and its %10
        int prev = (int) (fibonacci(1) % 10);

        //calculate F(23) and its %10
        int curr = (int) (fibonacci(2) % 10);

        //keep going in cycle until n
        for (int i = 22; i < n; i++) {
            int t = curr;
            curr = (prev + curr) % 10;
            prev = t;
        }
        System.out.println(curr);
    }

    public static long fibonacci(int n) {
        //linear O(n)
        //разово (циклом) считаем наше число. числа (n - k) не хранятся в памяти
        long curr = 1, prev = 1;
        for (int i = 0; i < n - 2; i++) {
            long t = curr;
            curr += prev;
            prev = t;
        }
        return curr;
    }
}
