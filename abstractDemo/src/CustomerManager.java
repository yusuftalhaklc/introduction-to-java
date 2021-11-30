public class CustomerManager {
    BaseDatabaseManager databaseManager;
    public void getCustomers (){

        databaseManager.getData();
        //        Bağımlılık örneği
//        OracleDatabseManager oracleDatabseManager = new OracleDatabseManager();
//        oracleDatabseManager.getData();
    }
}
