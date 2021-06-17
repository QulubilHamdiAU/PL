package com.Praktikum.Modul4;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    Scanner scan = new Scanner(System.in);
    int i;
    int[] nomor;
    int x = 1;
    int y = 5;

    void DataInput(){
        nomor = new int[y];
        extracted();
    }

    private void extracted() {
        for (i=0;i<5;i++) {
            System.out.print("Data ke "+x+" : ");
            nomor[i] = Integer.parseInt(scan.nextLine());
            x++;
        }
    }

    void Sort(){
        Arrays.sort(nomor);
        System.out.print("hasil : ");
        for (i=0;i<5;i++){
            System.out.print(""+nomor[i]+"\t");
        }
    }
}

