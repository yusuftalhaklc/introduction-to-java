public class Product {

//    public Product(int id, String name, String description, Double price, int stockAmount, String color){
//        System.out.println("Yapıcı blok çalıştı");
// over loading    this.name = name;
//    }




    // attribute || field
    private int id;
    String name;
    String description;
    double price;
    int stockAmount;
    String color;
    String kod;

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
