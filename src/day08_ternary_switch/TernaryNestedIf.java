package day08_ternary_switch;

public class TernaryNestedIf {
    public static void main(String[] args) {
        int score =175;
       /*
        String result = "";
        if (score >=0 && score <=100)
        {
            if(score >= 60){
                result = "Passed";
            } else {
                result ="Failed";
            }
        }else result="invalid number";
        System.out.println(result);

        System.out.println(result);
*/
//============  NESTED TERNARY===================
        String result = (score >= 0 && score <= 100)?
                        (score >=60)? "Passed": "Failed"
                : "invalid";
        System.out.println(result);

        //===============NESTED TERNAARY==================

        int n =15;

        String day = (n >=1 && n <=7)? (n==1)? "Monday": (n==2)? "Tuesday" :
                (n==3)? "Wednesday" : (n == 4)? "Thursday" : ( n == 5)? "Friday": (n==6)? "Saturday" : "Sunday"
                : "no such a day";

        System.out.println(day);

    }
}
