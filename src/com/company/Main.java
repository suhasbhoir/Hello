package com.company;

public class Main {

    static void rec_patt(int n){
        if (n>0){
            rec_patt(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static String CtoF(float c){
        //(0°C × 9/5) + 32 = 32°F
        float result = (c* 9.0f/5.0f) + 32;
        return result + "°F";

    }
    public static void main(String[] args) {
//        rec_patt(9);
//        System.out.println(CtoF(65));

    }
}
