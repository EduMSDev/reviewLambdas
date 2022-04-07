package supplierlambda;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> i = () -> "Javier";

        System.out.println("The value is " + i.get());
    }
}
