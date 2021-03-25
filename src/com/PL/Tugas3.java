package com.PL;

public class Tugas3 {

    public static void main(String[] args){
        int a = 0, b = 10;
        int c = 0;
        try {
            c = b / a;
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("\nArithmeticException is handled. But take care of the variable \"c\"");
        }
        finally {
            System.out.println("Sistem tetap berjalan");
            System.out.println("Nilai dari c :" + c);
        }

    }
}
