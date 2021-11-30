public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void Add(){
        System.out.println("Müşteri Eklendi");
        DatabaseLogger logger = new DatabaseLogger();
        this.logger.Log("Log Mesajı");
    }
}
