package Recursion.Introduction;

public class Main {
    // ! Type of recurrence relation -
    /*

    *  1. Linear Recurrence relation -  Less Efficient
         *(Does not divides in parts)
          Fibonacci Series

    *  2. Divide and Conquere Recurrence relation -  Very Efficient
         *(If our problem is divided into parts)
           Binary Search

    */
    // ! Steps to solve Recursion problem -
    /*
    *1. Identify if you can break down problem into smaller problems.
    *2. Write the recurrence relation if needed.
    *3. Draw the recursive tree.

    * About Tree -
    *1. See the flow of funcitons, how they are getting in stack.
    *2. Indentify and focus on left tree calls and right tree calls.
    *3. Draw the tree and pointers using pen and paper.
    *4. Use a debugger to see the flow of code.

    *4. See how the values are returned at each step.
    *5. See where function call will come out.
    *6. In the end, you will come out of the main function.
     */




    //* In recursion we need some base condition to stop our infinite function calling
    //* Every new function calling will take new memory each time
    public static void main(String[] args) {

        print(5);
    }
    private static void print(int i) {
        if(i==0) return;
        System.out.println(i);
        print(i-1);
    }
}
