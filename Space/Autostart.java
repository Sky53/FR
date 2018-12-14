package Space;
// 1.219.9


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Autostart {
    private final int COMBUSTION_DRIVE = 9;// количество спутников
    private final int UNIVERSE_FLEET_SPEED_ACCELERATION = 1;    // множитель скорости
    private final int PROBE_BASE_SPEED = 100_000_000;   // базаовая скорость спутника
    private final int DELAY_BETWEEN_PROB = 2;   // таймаут выстрила пушки
    private int currentGalaxy;
    private int currentSystem;
    private int currentPosition;
    //


    // 5 галактик, 500 систем, 15 позиций
    public long calcFlyDistance(int galaxy, int system, int position) {
        if (galaxy != currentGalaxy) {
            return Math.round(Math.abs(20000 * (galaxy - currentGalaxy)));
        }
        if (system != currentSystem) {
            return Math.round(Math.abs(2700 + 95 * (system - currentSystem)));
        }
        if (position != currentPosition) {
            return Math.round(Math.abs(1000 + 5 * (position - currentPosition)));
        }
        return 0;
    }

    public long calcFlyTimeToOneWay(int galaxy, int system, int position) throws Exception {
        return (long) Math.ceil(10 + 3500 * (Math.sqrt((10 * calcFlyDistance(galaxy, system, position)) / (PROBE_BASE_SPEED))) / UNIVERSE_FLEET_SPEED_ACCELERATION);
    }
/*
расчитат разницу времени  в цыле между двумя системами, если разница больше 2000ms отправить спутники на текущую систему

 */

    public void sending() throws Exception {
        galaxytrack(getListPlanet(), COMBUSTION_DRIVE, new Planet(currentGalaxy,currentSystem,currentPosition));
//        // тут должен быть метод для расчеты разницы времени  i и i +1  системы, в случае если разница >= 2 отправлять на  i планету
//        for (int i = 0; i < getListPlanet().size(); i++){
//            if ()
//        }
    }

    public List<Planet> getListPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Planet> listPlanet = new ArrayList<>();
        while (!reader.readLine().isEmpty()) {
            Integer galaxy = Integer.parseInt(reader.readLine());
            Integer system = Integer.parseInt(reader.readLine());
            Integer position = Integer.parseInt(reader.readLine());
            listPlanet.add(new Planet(galaxy, system, position));
        }
        reader.close();
        return listPlanet;
    }

    public List<Long> galaxytrack(List<Planet> planets, int spyagent, Planet currentPlanet) throws Exception {
        // calcFlyTimeToOneWay одга дорога в с к=секуднах
        List<Long> timeWay = new ArrayList<>();
        List<Planet> planetList = new ArrayList<>(planets);
        for (int i = 0; i < planetList.size(); i++) {
            Planet thisPlanet = planetList.get(i);
            Long oneWay = calcFlyTimeToOneWay(thisPlanet.galaxy, thisPlanet.system, thisPlanet.position);
            Long Way = 2 * oneWay;
            timeWay.add(Way);
        }

        return timeWay;
    }


}

class Planet {
    int galaxy;
    int system;
    int position;


    public Planet(int galaxy, int system, int position) {
        this.galaxy = galaxy;
        this.system = system;
        this.position = position;
    }

    public int getGalaxy() {
        return galaxy;
    }

    public void setGalaxy(int galaxy) {
        this.galaxy = galaxy;
    }

    public int getSystem() {
        return system;
    }

    public void setSystem(int system) {
        this.system = system;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


    public Planet curientPlanet() {
        return this;
    }
}
