package Metod;

class Stack {
    private char stck[]; // The array to store stack element
    private int tos;     // Top of stack

    /**
     * build an empty stack of a given size
     */

    Stack(int size) {
        stck = new char[size]; // to allocate memory for the stack
        tos = 0;
    }

    /**
     * build one stack from another stack
     */
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];
        // copy element
        for (int i = 0; i < tos; i++) {
            stck[i] = ob.stck[i];
        }
    }

    /**
     * build a stack with the original values
     */
    Stack(char a[]) {
        stck = new char[a.length];

        for (char anA : a) {
            push(anA);
        }
    }

    /**
     * place symbol on the stack
     *
     * @param ch
     */
    void push(char ch) {
        if (tos == stck.length) {
            System.out.println(" - Stack is full");
            return;
        }
        stck[tos] = ch;
        tos++;
    }

    /**
     * removing symbols from the stack
     */
    char pop() {
        if (tos == 0) {
            System.out.println(" - Stack is empty");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }

}

public class StackDemo {
    public static void main(String[] args) {
        /**
         * create an empty stack of 10 items
         */
        Stack stk1 = new Stack(10);
        char name[] = {'T', 'o', 'm'};
        //build a stack an array
        Stack stk2 = new Stack(name);
        char ch;
        int i;
        // place the characters on the stack srl1
        for (i = 0; i < 10; i++) {
            stk1.push((char) ('A' + i));

        }
        /**
         * build one stack from another stack
         */
        Stack stk3 = new Stack(stk1);
        // show stacks
        System.out.println(" Contents of stk1: ");
        for (i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print(" Contents of stk2: ");
        for (i = 0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print(" Contents of stk3: ");
        for (i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }

    }
}
