package com.dotory.startConfig;

import com.dotory.piCalculation.PiCalculation;
import com.dotory.piCalculation.PiCalculation;
import com.dotory.problem3xplus1.Problem3xplus1;

import java.util.Scanner;

public class StartConfig {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.next();

        Problem3xplus1 class1 = new Problem3xplus1();
        PiCalculation class2 = new PiCalculation();

        switch (scan) {
            case "Problem3xplus1":
                class1.main(null);
            case "LimitPiCalculation":
                class2.main(null);
        }
    }
}
