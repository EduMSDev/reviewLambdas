package lambdasnotparameters;

public class LambdaTest {
    public static void main(String[] args) {

        FunctionTest ft = () -> System.out.println("Hola mundo");

        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.myMethod(ft);

    }


    public void myMethod(FunctionTest ft) {
        ft.saludar();
    }
}
