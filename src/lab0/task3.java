package lab0;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Runtime;

public class task3 {
    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        Runtime instance = Runtime.getRuntime();
        long totalMemory = instance.totalMemory();
        long freeMemory = instance.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        long maxMemory = instance.maxMemory();
        int kb = 1024;

        //scan number
        FileReader fr = new FileReader("src/lab0/input.txt");
        int n = new Scanner(fr).nextInt();
        fr.close();

        int prev = (int) (fibonacci(1) % 10);
        int curr = (int) (fibonacci(2) % 10);

        //keep going in cycle until n
        for (int i = 1; i < n-1; i++) {
            int t = curr;
            curr = (prev + curr) % 10;
            prev = t;
        }

        FileWriter fw = new FileWriter("src/lab0/output.txt");
        fw.write(String.valueOf(curr));
        fw.close();

        System.out.printf("Total memory: %,d (KB)\n", totalMemory/kb);
        System.out.printf("Free memory: %,d (KB)\n", freeMemory/kb);
        System.out.printf("Used memory: %,d (KB)\n", usedMemory/kb);
        System.out.printf("Max memory: %,d (KB)\n", maxMemory/kb);
        System.out.printf("Runtime:   %,.9f (sec)", (System.nanoTime() - startTime)/Math.pow(10, 9));
    }

    public static long fibonacci(int n) {
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
