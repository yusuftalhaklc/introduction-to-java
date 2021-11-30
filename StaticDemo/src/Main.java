public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "Laptop";
        product.price = 10900;
        manager.add(product);
        DatabaseHelper.Crud.delete();

    }
}
