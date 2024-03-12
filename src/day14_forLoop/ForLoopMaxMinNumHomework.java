package day14_forLoop;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class ForLoopMaxMinNumHomework {

    public static void MaxNum () {

        Scanner input = new Scanner(System.in);
        int maxNum=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number/ five times ");
            int num = input.nextInt();

            if(num<0) { // if the input is invalid
                System.err.println("Invalid Number");
                return;
            } 
            
            if(!(maxNum>num))  {// update maxNumber if the current number is greater
                    maxNum=num;  }


        }
        System.out.println("maxNum = " + maxNum);
    }
    
    public static void MinNum() {
        
        Scanner input = new Scanner(System.in);
        int minNum=1000000;// since want to min num initial very big num..
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Enter a number");
            int num = input.nextInt();
            
            if (num<0&&num>1000000) { // check the valid num, input can not be negative or very big num
                System.err.println("invalid number: "+ num);
                return;
            }
            
            if (num<minNum) {
                minNum = num;
            }
        }
        System.out.println("minNum = " + minNum);
        
    }

    public static void main(String[] args) {

        //MaxNum ();
        MinNum();

    }

    }


/*
  // write a program that can ask the user enter a number for five times,  print the maximum number


            // write a program that can ask the user enter a number for five times, print the minimum number
        }
 */