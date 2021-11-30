public class ProductValidator {
    // constructur
    static {
        System.out.println("Statik yapıcı blok çalıştı");
    }

    public ProductValidator() {
        System.out.println("yapıcı blok çalıştı");
    }

    // static yaptığımız zaman new yapmadan sadece bir kere çağırabiliriz
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty())
            return true;
        else
            return false;
    }
//    // inner class
//    public static class BaskaBirClass {
//        public static void sil(){
//
//        }

}
