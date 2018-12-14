package Packages_interfaces.defaultd;

public class MyIFimp2 implements MyIF {
    /**
     * Предоставляеться реализация обоих методов -
     *  getUserID() & getAdminID()
     */
    @Override
    public int getIserID() {
        return 174;
    }

    @Override
    public int getAdminID() {
        return 48;
    }
}
