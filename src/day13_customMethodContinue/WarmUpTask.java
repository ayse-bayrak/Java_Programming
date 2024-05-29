package day13_customMethodContinue;


public class WarmUpTask {
    public static void main(String[] args) {
        System.out.println("===========case 1===========");
        int a =30;
        int b =6;
        char c = '*';
        calculate(35, 7, '/');

        calculate(a, b, c);


/*

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your two numbers and a math operator");
        double n1 = scan.nextDouble(),
                n2 =scan.nextDouble();

        char operator = scan.next().charAt(0);

        calculate(n1,n2,operator);

        System.out.println("===========================");

 */
        System.out.println("===========case 2===========");
        int age =89;

        ageGroup(age);
        ageGroup(-12);
        ageGroup(2000);

        System.out.println("===========case 3===========");

        eligibleToVote(23, true);



    }

    //case1-calculate two numbers with mathOperator
   public static void calculate(double num1, double num2,char mathOperator) {

        switch (mathOperator){
            case '+':
                System.out.println(num1+ "  " + mathOperator + "  " + num2 + " = " + (num1+num2));break;
            case '-':
                System.out.println(num1+ "  " + mathOperator + "  " + num2 + " = " + (num1-num2));break;
            case '*':
                System.out.println(num1+ "  " + mathOperator + "  " + num2 + " = " + (num1*num2));break;
            case '/':
                System.out.println(num1+ "  " + mathOperator + "  " + num2 + " = " + (num1/num2));break;
            default:
                System.out.println("invalid operator: " + mathOperator);
                break;
        }
    }



    //case2-define age group
    public static void ageGroup(int age){

        if (age >= 0 && age <= 150){

            System.out.println((age<=21)? "Teenager": (age<55)? "Adult": "Senior ");

        }else {
            System.err.println("Invalid age:"+ age);
        }

    }

    public static void eligibleToVote(int age, boolean isAmerican) {

        if (age>=18 && isAmerican) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are  not eligible");
        }
    }
}
/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30


	2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )


    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote

 */