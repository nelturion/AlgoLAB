package lab0;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("src/lab0/input.txt");
        Scanner scanner = new Scanner(fr);
        int n = scanner.nextInt();
        fr.close();

        FileWriter fw = new FileWriter("src/lab0/output.txt");

        if (n <= 0) {
            System.out.println("please, put the Natural number from 1 to 45 (there is no 0' number in Fibonacci sequence)");
        } else {
            long startTime = System.nanoTime();
            //System.out.println(fibonacci(n));
            fw.write(String.valueOf(fibonacci(n)));
            System.out.printf("time taken: %d (nanosec)", System.nanoTime() - startTime);
        }
        fw.close();
    }

    public static long fibonacci(int n) {
            /*if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }*/

        //linear algorithm goes here
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
