package com.Praktikum.Modul6;

import java.io.File;  // buat import file
import java.io.FileNotFoundException;  // handle error ketika file nya tidak ditemukan
import java.util.Scanner;
import java.io.IOException;  // handle error ketika input dan output
import java.io.FileWriter; // menulis file

/**
 *
 * @author Qulubil Hamdi
 * @version 1.5
 * @since 1.0
 */
public class Main {
    int countStr = 0, countInt = 0;

    public void pilih() {
        int pilih;

        Scanner scan = new Scanner(System.in);
        System.out.println("\n1. Input Data\n2. Lihat Data\n3. Keluar");
        System.out.print("\nPilih : ");
        pilih = scan.nextInt();
        switch (pilih) {
            case 1 : {
                input();
            }
            case 2 : {
                read();
            }
            case 3 : System.exit(0);
        }
    }

    /**
     *
     * @param strNum Menentukan apakah dalam inputan ada double atau tidak
     * @return true return double
     * @throws NumberFormatException Saat mencoba melempar string menjadi numeric
     */
    public boolean isNum(String strNum)throws NumberFormatException{
        try {
            Double.parseDouble(strNum);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    /**
     * Methode ini untuk menulis data ke dalam file
     * @throws Exception melempar exception input
     * @throws NumberFormatException Saat mencoba melempar string menjadi numeric
     * @exception IOException menangkap jika ada kesalahan pada file
     * @exception ArrayIndexOutOfBoundsException jika array berada diluar index
     */
    public void input(){
        String[] inString = new String[5];
        int[] inNumber = new int[5];
        String input;

        try {
            //Inisialisasid
            Scanner scan = new Scanner(System.in);
            FileWriter file = new FileWriter("Data.txt",true);

            //input
            System.out.print("Input: ");
            input = scan.nextLine();
            if (input.isEmpty()){
                throw new Exception("Inputan tidak boleh kosong!");
            }
            String[] arr = input.split(",");
            for (int i =0; i<arr.length; i++) {
                if (isNum(arr[i])) {
                    inNumber[countInt] = Integer.parseInt(arr[i]);
                    countInt++;
                } else {
                    inString[countStr] = arr[i];
                    countStr++;
                }
                file.write(String.valueOf(arr[i]));
                file.write("\n");
                file.close();

            }
            System.out.println("Data berhasil ditambahkan");

        } catch (IOException e) {
            System.out.println("IO Exception Error: "+e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bounds Exception Error : " + e);
        } catch (Exception e){
            System.out.println("Error: "+e);
        } finally {
            back();
        }
    }

    private void back(){
        Scanner sc = new Scanner(System.in);
        String pil;

        System.out.println("\nLanjut? Y/N");
        System.out.print("\nInput: ");
        pil = sc.nextLine();

        switch (pil) {
            case "Y", "y" : input();
            case "N", "n" : pilih();
            default : back();
        }
    }


    /**
     * Methode ini untuk mengecek data yang telah di inputkan user
     * @exception FileNotFoundException handle error ketika file tidak ditemukan
     * @see FileNotFoundException
     */
    public void read(){

        System.out.println("\nData yang sudah di Input: ");
        try {

            File file = new File("Data.txt");
            Scanner Read = new Scanner(file);
            while (Read.hasNextLine()) {
                String data = Read.nextLine();
                System.out.println(data);
            }
            Read.close();
            System.out.printf("\nJumlah data format String (inString) : %d \n", countStr);
            System.out.printf("Jumlah data format Number (inNumber) : %d \n", countInt);


        } catch (FileNotFoundException e) {
            System.out.println("Error: File Tidak Ditemukan!");

        } finally {
            pilih();
        }
    }

    public static void main(String[] args) {
        Main maen = new Main();
        maen.pilih();
    }
}