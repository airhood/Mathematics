package com.dotory.problem3xplus1;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem3xplus1 {
    public static void main(String[] args) {
        Problem3xplus1 obj = new Problem3xplus1();

        obj.start();
    }

    public void start() {
        Scanner modeScanner = new Scanner(System.in);
        System.out.println("Mode (0: single calculation, 1: statistic)");
        int mode = modeScanner.nextInt();

        switch (mode) {
            case 0:
                singleMode();
                break;
            case 1:
                statistic();
                break;
        }
    }

    public void singleMode() {
        int startNum;

        int loop;

        Scanner startNumScanner = new Scanner(System.in);
        System.out.print("startNum: ");
        startNum = startNumScanner.nextInt();

        Scanner loopScanner = new Scanner(System.in);
        System.out.print("\n\nloop: ");
        loop = loopScanner.nextInt();

        long lastNum = startNum;

        if (loop == 0) {
            int i = 0;
            while (lastNum != 1) {
                if (checkIsEvenNum(lastNum)) {
                    lastNum = lastNum / 2;
                } else {
                    lastNum = (lastNum * 3) + 1;
                }

                i++;

                System.out.println("[" + i + "] " + "LastNum: " + lastNum);
            }
        } else {
            for (int i = loop; i < 0; i--)
            {
                if (checkIsEvenNum(lastNum)) {
                    lastNum = lastNum / 2;
                } else {
                    lastNum = (lastNum * 3) + 1;
                }

                System.out.println("[" + (loop - i + 1) + "] " + "LastNum: " + lastNum);
            }
        }
    }

    public void statistic() {
        ArrayList<Long> maxValues = new ArrayList<>();
        ArrayList<Integer> calculateProcedures = new ArrayList<>();

        Scanner maxCalculateValueScanner = new Scanner(System.in);
        System.out.print("maxCalculationValue: ");
        int maxCalculateValue = maxCalculateValueScanner.nextInt();

        for (int p = 1; p <= maxCalculateValue; p++)
        {
            int startNum = p;

            long lastNum = startNum;

            long maxValue = 0;

            int calculateProcedure = 0;

            int i = 0;
            while (lastNum != 1) {
                if (checkIsEvenNum(lastNum)) {
                    lastNum = lastNum / 2;
                } else {
                    lastNum = (lastNum * 3) + 1;
                }

                i++;

                if (lastNum > maxValue) {
                    maxValue = lastNum;
                }

                calculateProcedure++;
            }

            maxValues.add(maxValue);
            calculateProcedures.add(calculateProcedure);

            maxValue = 0;
            calculateProcedure = 0;
        }

        for (int l = 0; l <= maxCalculateValue; l++)
        {
            System.out.println("[" + l + "] " + " maxValue: " + maxValues.get(l) + "  maxCalculateProcedures: " + calculateProcedures.get(l));
        }
    }

    public boolean checkIsEvenNum(long num)
    {
        if (Math.floorMod(num, 2) == 0) return true;

        return false;
    }
}
