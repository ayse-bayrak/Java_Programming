package day07_ifStatementsContinue;

public class NetIncomeCalculator {


/*
9. Create a class named NetIncomeCalc,
Write a program that can calculate the salary after tax
based on the following requirements
                the tax rates are:
                        35% for a salary of 130K or more
                        30% for a salary of 100K to 129k
                        25% for a salary of 80K to 99K
                        20% for a salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */
        public static void main(String[] args) {
            int salary= 80000;
            double taxRate;
// Applying tax rates based on salary
            if (salary >=130000) {
                taxRate=0.35;
            } else if (salary>=100000) {
                taxRate=0.30;
            }
            else if (salary>=80000) {
                taxRate=0.25;
            }
            else  {
                taxRate=0.20;
            }
            double afterTaxSalary;
            boolean isMarried = true;
// Applying marriage discount if married
            if (isMarried) {
                taxRate -=0.05;
            }
            // Calculating net income
            afterTaxSalary = salary*(1-taxRate);
            System.out.println("After Tax Salary is = $" + afterTaxSalary);

        }
    }
