package Packages_interfaces.defaultd;

public class MyIFimp implements MyIF {
    /**
     * Реализации подлежит лишь метод getUserID() интерфейса MyIF.
     * делать этого для метода getAdminID() необязательно, поскольку
     * при необходимости может быть использована его реализация,
     * заданная по умолчанию
     */
    @Override
    public int getIserID() {
        return 100;
    }
}
