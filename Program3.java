import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.time.*; 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore
 */
public class Program3 {



    // Tester class named hello


    // driver function
    public static void main(String[] args) throws FileNotFoundException {


         
        // pass the path to the file as a parameter 
        File file = new File("/Users/sandradawkins/NetBeansProjects/Test/src/dates.txt"); 
        Scanner sc = new Scanner(file); 

        int n = 1;


        // under try and finally read file

        try
        {
            while( sc.hasNext() )
            {

                // read line

                String user = sc.nextLine();

                String arr[] = user.split("-");

                // getting date 

                int mon = Integer.parseInt(arr[0]);

                int day = Integer.parseInt(arr[1]);

                int year = Integer.parseInt(arr[2]);

                // create an object of LocalDate of given date

                LocalDate givendate = LocalDate.of(year, mon, day); 

                // and now add today's date

                LocalDate todaydate = LocalDate.now(); 

                // and here calculate age

                Period age = Period.between(givendate, todaydate); 

                // and print it here

                System.out.println("Age of "+n+"th member is : "+age.getYears()+"years, "+age.getMonths()+" months, "+age.getDays()+" days.");
            }
        }

        finally
        {
            sc.close();
        }


    }

}

