public class DatabaseLogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Logged to Database : "+message);
    }
}
//overriding aynı metotu iki farklı class da kullanma