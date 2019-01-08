import Grain.Field;
import Harvester.Harvester;
import Harvester.Drone;

import java.text.Format;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Harvester harvester = new Harvester();
        Drone drone = new Drone();
        drone.scan(field);



    }
}
