package day07_ifStatementsContinue;

public class PosNegZeroMultiBranchIfTask1 {
    public static void main(String[] args) {
        int num = 20;
        String result = "";

        if (num > 0) {
            result = "Positive";
        } else if (num < 0) {
            result = "Negative";
        }
        else {
            result = "Zero";
        }
        System.out.println(result);
    }
}
