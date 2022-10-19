package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 30000;
        int creditScore = 650;

        boolean eligibleForLoan  = salary >= 30000 && creditScore >= 650;
        System.out.println(eligibleForLoan);


    }
}
