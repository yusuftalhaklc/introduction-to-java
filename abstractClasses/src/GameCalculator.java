public abstract class GameCalculator {
    // abstract --> soyut
    public abstract void hesapla();

    // final herkes için aynı
    public final void gameover(){
        System.out.println("Oyun Bitti!");
    }
}
