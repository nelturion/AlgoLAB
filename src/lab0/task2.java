package lab0;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws IOException{
        Runtime instance = Runtime.getRuntime();
        long usedMemory = instance.totalMemory() - instance.freeMemory();
        int kb = 1024;
        long startTime = System.nanoTime();

        FileReader fr = new FileReader("src/lab0/input.txt");
        Scanner scanner = new Scanner(fr);
        int n = scanner.nextInt();
        fr.close();

        FileWriter fw = new FileWriter("src/lab0/output.txt");

        if (n <= 0) {
            fw.write("0");

            System.out.printf("Runtime:   %,.9f (c)\n", (System.nanoTime() - startTime)/Math.pow(10, 9));
            System.out.printf("Used memory: %,d (KB)", usedMemory/kb);
        } else {
            fw.write(String.valueOf(fibonacci(n)));

            System.out.printf("Runtime:   %,.9f (c)\n", (System.nanoTime() - startTime)/Math.pow(10, 9));
            System.out.printf("Used memory: %,d (KB)", usedMemory/kb);
        }
        fw.close();
    }

    public static long fibonacci(int n) {
        long curr = 1, prev = 1;
        for (int i = 0; i < n - 2; i++) {
            long t = curr;
            curr += prev;
            prev = t;
        }
        return curr;
    }
}
