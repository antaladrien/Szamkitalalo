package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random a = new Random(System.currentTimeMillis());
        int b = a.nextInt(100);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String s;
        boolean gameover = false;
        System.out.println("Találd ki melyik számra gondoltam!");

        try {
            while (gameover == false){
                s = br.readLine();
                int temp = Integer.parseInt(s);

                if (b<temp)
                    System.out.println("Kisebb");
                else if (b>temp)
                    System.out.println("Nagyobb");
                else {
                    System.out.println("Kitaláltad!");
                    gameover = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
