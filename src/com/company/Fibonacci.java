package com.company;


public class Fibonacci {
    public Fibonacci(int x) {
        fibonacci = x;
        while (count < fib.length) {
            if (count == 0) {
                fib[0] = 0;
                fib[1] = 1;
                fib[2] = 1;
                count = count + 3;
            }
            else if ((count > 0) || (count < 46)) {
                fib[count] = fib[count - 1] + fib[count - 2];
                count++;
            }
            else
                break;
        }
    }
    boolean method1() {
        count = 0;
        while (count < fib.length) {
            if (fib[count] == fibonacci) {
                return true;
            }
            count++;
        }
        return false;
    }
    String method2() {
        String numb = "";
        count = 0;
        int count2;
        while (count < fib.length) {
            if (fib[count] == fibonacci) {
                break;
            }
            else
                count++;
        }
        count2 = count;
        count = 0;
        while (count < count2) {
            numb = numb + fib[count] + ", ";
            count++;
        }
        numb = numb + "and " + fib[count2] + ".";
        return numb;
    }
    int fib[] = new int[46];
    int count = 0;
    int fibonacci;
}
