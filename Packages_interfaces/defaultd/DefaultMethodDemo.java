package Packages_interfaces.defaultd;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFimp2 obj = new MyIFimp2();
        /**
         * Вызов метода getUserID() возможен, поскольку он явно
         * реализован классом MyFimp
         */
        System.out.println("Индетификатор пользователя " + obj.getIserID() );

        /**
         * Вызов метода getAdminID() возможен, поскольку
         * предоставляеться его реализация по умолчанию
         */
        System.out.println("Индетифекатор админа " + obj.getAdminID());
    }
}
