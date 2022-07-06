/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;

public class Program1 {

    // Factorial method
    public static long factorial(int num) {
        long fact = 1;
        for (int x = 2; x <= num; x++) fact = fact * x;
        return fact;
    }

    // Sum of Squares Method
    public static long sumOfSquares(int num) {
        long sum = 0;
        for (int x = 1; x <= num; x++) sum += (long) x * x;
        return sum;
    }

    // Fibonacci Sequence Method
    public static int[] fibonacci(int num) {
        int[] fibb = new int[num];
        if (num == 1) fibb[0] = 1;
        else if (num == 2) {
            fibb[0] = 1;
            fibb[1] = 2;
        } else {
            fibb[0] = 1;
            fibb[1] = 2;
            for (int i = 2; i < num; i++) fibb[i] = fibb[i - 1] + fibb[i - 2];
        }
        return fibb;
    }

    public static void main(String[] args) {

        String inputFile = "/Users/sandradawkins/NetBeansProjects/Test/src/Input.txt"; // the input file to read from
        String outputFile = "output.txt"; // the name of the output file generated

        try {
            Scanner fileReader = new Scanner(new File(inputFile));
            PrintWriter fileWriter = new PrintWriter(new File(outputFile));
            int num; long result;
            while ( fileReader.hasNextInt()){
                num = fileReader.nextInt();
                result = factorial(num);
                fileWriter.write("Factorial of "+num+" is "+ result+"\r\n");
                result = sumOfSquares(num);
                fileWriter.write("Series sum of "+num+" is "+ result+"\r\n");
                int[] fibb = fibonacci(num);
                fileWriter.write("Fibonacci series for first "+num+" terms:\r\n");
                for(int term: fibb) fileWriter.write(term+" ");
                fileWriter.write("\r\n");
                fileWriter.flush();
            }
            fileReader.close();
            fileWriter.close();



        } catch (FileNotFoundException e) {
            System.out.println("Error: could not find the input file to read.");
        }


    }
}
