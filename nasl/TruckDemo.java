package nasl;

class Vehicle {
    private int passengers; // Кол-во пассажиров
    private int fuelcap;   // Объем топливного бака в галлонах
    private int mpg;       // потребление топлива в милях на галлон

    // Конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //возвратить дальность поездки

    int range() {
        return mpg * fuelcap;
    }

    /**
     * Вычислить объем топлива, требуещего для
     * прохождения заданного пути
     */
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Методы достпупа к переменным экземпляра
    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}

// Расширение класса Vehicle для грузовиков
class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        /* Иницилизация членов класса Vehicle
        c использованием конструктора этого класса.
         */
        super(p, f, m);
        cargocap = c;
    }
    // Методы доступа к переменной cargocap
    int getCargocap() {
        return cargocap;
    }
    void  setCargocap(int c) {
        cargocap = c;
    }
}

public class TruckDemo {
    public static void main(String[] args) {
        // Создать ряд новых объектов типа Truck
        Truck semi = new Truck(2,20,7,44000);
        Truck pickup = new Truck(3,28,15,2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Грузовик может перевезти " + semi.getCargocap() + " Футнов");
        System.out.println("Для преодаления " + dist + " миль грузовику требуется " + gallons + " Галонов топлива\n");

        gallons = pickup.fuelneeded(dist);
        System.out.println("Picup может перевезти " + pickup.getCargocap() + " Футнов");
        System.out.println("Для преодаления " + dist + " миль Pickup требуется " + gallons + " Галонов топлива\n");
    }
}
