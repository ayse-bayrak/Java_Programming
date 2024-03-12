package day07_ifStatementsContinue;
/*
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given,
Write a program to determine and print which school type someone is in
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Assume that the given number is 1 ~ 18
 */
public class GradeLevelMultiifTask2 {
 public static void main(String[] args) {
  int gradeLevel = 9;
  String result=""; // temporary value

  if (gradeLevel <= 5 ) { // if false gradelevel >= 6
   result= "Elementary school";
  }
  else if (gradeLevel <= 8  )//false: grade level >=9
  {
   result = "Middle school";
  }

  else if (gradeLevel <=12 )
  {
   result = "High School";
  }
  else if (gradeLevel <=16 )
  {
   result = "Collage";
  }
  else
  {
   result = "Grad school";
  }

  System.out.println(result);
 }
}
