public class Marmalade extends Product {

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public Marmalade() {
        this("мармеладки");
    }

    public Marmalade(String name) {
        this(name, 1);
    }

    public Marmalade(String name, double price) {
        this(name, price, 10);

    }

    public Marmalade(String name, double price, int quantity) {

        super(name, price);
        this.quantity = quantity;
    }

    public Marmalade(String brand, String name, double price, int quantity) {
        super(brand, name, price);
        this.quantity = quantity;
    }

    @Override
    String displayInfo() {
        // return super.displayInfo();
        return String.format("%s - %s - %f - кол-во в уп.: %d", brand, name, price, quantity);

    }
}
