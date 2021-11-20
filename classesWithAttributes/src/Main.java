public class Main {

    public static void main(String[] args) {
	    Product product = new Product();
        product.name = "Laptop";
        product.setId(1);
        product.description = "Samsung Laptop";
        product.price = 3000;
        product.stockAmount = 3;
        product.color = "Mavi";
        product.getId();
        System.out.println(product.name);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}
