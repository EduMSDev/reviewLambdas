package main.lambdawithparameters;

public class LambdaTest2 {

    public static void main(String[] args) {
        Operations op = (num1, num2) -> System.out.println(num1 + num2);

        LambdaTest2 lambdaTest2 = new LambdaTest2();
        /* You can choose the behavior of a lambda function or what your function will do.
        In this case it is being told to show the parameters */
        lambdaTest2.myMethod(((num1, num2) -> System.out.println(num1 + num2)), 25, 30);
    }

    public void myMethod(Operations op, int num1, int num2) {
        op.showSum(num1, num2);
    }
}
