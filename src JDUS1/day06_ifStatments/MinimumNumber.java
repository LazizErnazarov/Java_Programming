package day06_ifStatments;

public class MinimumNumber {

    public static void main(String[] args) {

        int n1 = 30,
                n2 = 1;
        if (n1 < n2) {
            System.out.println(n1 + " is the minimum number");
        }
        if (n2 < n1) {
            System.out.println(n2 + " is the minimum number");
        }
        if (n1 == n2) {
            System.out.println("Equal");
        }
    }
}

