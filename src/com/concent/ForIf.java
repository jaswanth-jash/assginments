package com.concent;

public class ForIf {
    public static void main(String args[]) {
        String season = "summer";
        int month;
        if (season.equals("winter")) {
            for (month = 1; month <= 3; month++) {
                if (month == 3) {
                    System.out.println("Starting three months winter season " + month);
                }
            }
            if (season.equals("summer")) {
                for (month = 4; month <= 6; month++) {
                    if (month == 6) {
                        System.out.println("Next three months summer season " + month);
                    }
                }
                if (season.equals("rainy")) {
                    for (month = 7; month <= 9; month++) {
                        if (month == 9) {
                            System.out.println("Next three months rainy season " + month);
                        }
                        break;
                    }
                    if (season.equals("post monsoon")) {
                        for (month = 9; month <= 12; month++) {
                            if (month == 12) {
                                System.out.println("Last threes months post monsoon seasons " + month);
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("This season not present in the climate");
        }
    }
}
