package functionlambda;

public class Client {

    private String name;
    private double order;
    private int table;

    public Client(String name, double order, int table) {
        this.name = name;
        this.order = order;
        this.table = table;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOrder() {
        return order;
    }

    public void setOrder(double order) {
        this.order = order;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }
}
