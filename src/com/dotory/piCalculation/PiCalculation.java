package com.dotory.piCalculation;

import java.util.Scanner;

public class PiCalculation {

    public static void main(String[] args) {
        PiCalculation obj = new PiCalculation();
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        scanner.reset();

        int param;

        switch (scan) {
            case 0:
                System.out.print("x: ");
                param = scanner.nextInt();
                obj.limitPiCalculation(param);
            case 1:
                System.out.print("runAmount: ");
                param = scanner.nextInt();
                obj.infiniteGeometricSeries(param);
        }
    }

    public void limitPiCalculation(int x) {
        System.out.println(x * Math.sin(Math.toRadians(180.0/x)));
    }

    public void infiniteGeometricSeries(long runAmount) {
        final long start = System.currentTimeMillis();
        int i;
        double pi = 0;
        double bunmo = 1;
        double buho = 1;

        for (i = 1; i <= runAmount; i++) {
            pi = pi + (1/bunmo)*buho;
            bunmo = bunmo + 2;
            buho = buho * (-1);
        }

        System.out.println(4*pi);
        final long end = System.currentTimeMillis();
        System.out.println("Run Time: "+ (end - start)/10000.0);
    }
}
