import java.io.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String name;
    private String category;
    private double price;

    // Constructor
    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Category: " + category);
        System.out.println("Product Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Deserialize the Product object
        Product deserializedProduct = deserializeProduct("product.ser");
        if (deserializedProduct != null) {
            System.out.println("Deserialized Product Details:");
            deserializedProduct.display();
        }
    }

    // Deserialize Product object from file
    private static Product deserializeProduct(String fileName) {
        Product product = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            product = (Product) in.readObject();
            System.out.println("Product deserialized successfully");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}
