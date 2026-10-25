package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is a kind of product that has an id, name and price, and is just shipped instead of downloaded.
// A ShoppingCart would NOT pass this test: it HAS products inside it, but it is not itself a product (HAS-A, not IS-A).
public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);   // MUST be the first statement
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}