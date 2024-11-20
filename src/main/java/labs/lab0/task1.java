package main.java.labs.lab0;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws IOException {
        Runtime instance = Runtime.getRuntime();
        long usedMemory = instance.totalMemory() - instance.freeMemory();
        int kb = 1024;
        long startTime = System.nanoTime();

        Scanner scanner = new Scanner(System.in);

        long a, b;
        //long a = scanner.nextLong(), b = scanner.nextLong();
        //System.out.println(a + b);
        //System.out.println(a + b * b);

        FileReader fr = new FileReader("src/main/resources/txtf/lab0/input/inputTask1.txt");
        Scanner fscan = new Scanner(fr);
        a = fscan.nextLong();
        b = fscan.nextLong();
        fr.close();

        FileWriter fw = new FileWriter("src/main/resources/txtf/lab0/output/output1.txt");
        fw.write((a + b) + "\n");
        fw.write(String.valueOf(a + b * b));
        fw.close();


        System.out.printf("Used memory: %,d (KB)\n", usedMemory/kb);
        System.out.printf("Runtime:   %,.9f (sec)", (System.nanoTime() - startTime)/Math.pow(10, 9));
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
