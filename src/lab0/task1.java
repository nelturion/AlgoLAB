package lab0;

import java.io.*;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println(a + b * b);

        FileReader fr = new FileReader("src/lab0/input.txt");
        Scanner fscan = new Scanner(fr);
        a = fscan.nextInt();
        b = fscan.nextInt();
        fr.close();

        FileWriter fw = new FileWriter("src/lab0/output.txt");
        fw.write((a + b) + "\n");
        fw.write(String.valueOf(a + b * b));
        fw.close();
    }
}
