package Minggu7;

import java.util.Scanner;

public class ForKelipatan21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        int kelipatan,jumlah=0,counter=0;
        double average;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input21.nextInt();

        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
            }
        }
        average = (double) jumlah/counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.println("Rerata = " + average);
    }
}
