public class StarPrinter {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*This program uses nested for loops to print out stars incrementally. 
 * The outer for loop runs 5 times (from 1 to 5) and the inner for loop runs from 1 to the current value of the outer loop variable (i). This means that on the first iteration of the outer loop, the inner loop will run 1 time, printing out one star. On the second iteration, the inner loop will run 2 times, printing out two stars, and so on. 
The println statement is used to print a newline character after each row of stars.*/
