package com.company;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
    }



    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }

        int megabytes = kiloBytes/1024;
        int kiloRemainder = kiloBytes%1024;


        System.out.println( kiloBytes + "  Kb " +   " megabytes are : " + megabytes);

    }
}
