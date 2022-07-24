package com.dotory.piCalculation;

import java.util.Scanner;

public class PiCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        scanner.reset();

        long param;

        switch (scan) {
            case 0:
                System.out.print("x: ");
                param = scanner.nextLong();
                limitPiCalculation(param);
                break;
            case 1:
                System.out.print("runAmount: ");
                param = scanner.nextLong();
                infiniteGeometricSeries(param);
                break;
        }
    }

    public static void limitPiCalculation(long x) {
        System.out.println(x * Math.sin(Math.toRadians(180.0/x)));
    }

    public static void infiniteGeometricSeries(long runAmount) {
        final long start = System.currentTimeMillis();
        int i;
        double pi = 0;
        double denominator = 1;
        double sign = 1;

        for (i = 1; i <= runAmount; i++) {
            pi = pi + (1/denominator) * sign;
            denominator = sign + 2;
            sign = sign * (-1);
        }

        System.out.println(4*pi);
        final long end = System.currentTimeMillis();
        System.out.println("Run Time: "+ (end - start)/10000.0);
    }
}
