package qa.learning;

public class Base {
    public static void dataTypes() {
        //byte(-128 127)
        byte a = 125;
        System.out.println(a);
        byte b = (byte) 200;
        System.out.println(b);

        //short(-32768 до 32767)
        short a1 = 12;
        System.out.println("There is example for short: " + a1);

        //int(-2147483648 до 2147483647)
        int a2 = 10;
        int a3 = 5;
        int result = a2 +  a3;
        System.out.println("The result of a2+a3: " + result);

        //long –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
        long num_a= 2147483L;
        long num_b= 2147483L;
        long sum_c = num_a + num_b;
        System.out.println("The sum of two long variables is = " + sum_c);


        //float
        float p1 = 10.89f;
        float p2 = 7.43f;
        float p3;
        p3 = p1*p2;
        System.out.println("The result of n1 x n2 is: " +p3);

        //double
        double d1 = 34354.232;
        double d2 = 4333.32313;
        double sum = d1 + d2;
        System.out.println("sum = "+sum);


        //char
        char c1, c2, c3;
        c1 = 65;
        c2 = 'B';
        c3 = 67;

        System.out.println("The characters are: " + c1 + c2 + c3);
        //"The characters are: " ABC
    }

    public static void booleanValues() {
        boolean mathG = (6 < 9) && (2 > 1);
        boolean mathT = (9 > 5) & (3 > 5);
        boolean mathR = (3<=4) || (4!=6);
        System.out.println("There are results of boolean expressions: " + mathG + " " + mathT + ""+ mathR);
    }

    public static void intValues() {
        int mathG = 5+5;
        int mathT = 10-5;
        int mathR = 5*5;
        int mathU = 15/5;
        int mathY = 19 % 2;
        System.out.println("There are results of int expressions: " + mathG + " " + mathT + " "+ mathR + " "
                           + mathU + " " + mathY);

    }

    public static void ifElseConstructions() {
        int a = 10;
        int b = 15;
        if (a > b) {
            System.out.println("Первое число больше второго");
        }
        else if (a < b) {
            System.out.println("Первое число меньше второго");
        }
         else {
            System.out.println("Числа равны");
        };
    }

    public static void complexOperations() {
        int a1 = 10;
        float f1 = 1.4f;
        double p1 = 50.1;
        System.out.println("The result of int / double: " + (a1 / p1));
        System.out.println("The result of float / double: " + (f1 / p1));
    }

}
