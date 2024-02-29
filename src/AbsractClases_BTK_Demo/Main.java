package AbsractClases_BTK_Demo;

import AbsractClases_BTK_Demo.CustomerManager;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();

        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomer();

        customerManager.databaseManager = new SqlDatabaseManager();
        customerManager.getCustomer();

        BaseDataManager baseDataManager = new SqlDatabaseManager();
        baseDataManager.getData();

        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.getCustomer();
    }
}
