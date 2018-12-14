package Packages_interfaces.defaultd;

public interface MyIF {
    /**
     * Объявления "Обычного" метода интерфейса, который не включает
     * поределения реализации по Умолчанию
     */
    int getIserID();
//Объявление метода по умалчанию
    default int getAdminID() {
        return 1;
    }
}


