package com.concent;

public class Array {
    public static void main(String args[]){
        String cars[] = {"volvo","BMW","RR","SWFIT","ford"};
        System.out.println(cars.length);
        //for(int i=0;i<cars.length;i++){
           // System.out.println(cars[i]);

         for(String i : cars){
             System.out.println(i );
         }
        }
    }

