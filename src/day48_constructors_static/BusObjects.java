package day48_constructors_static;

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.sql.Driver;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Abbas");
        bus.engine = new Engine(10);

        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver = new Driver("Aziz");
        metroBus.engine = new Engine(15);

        System.out.println(metroBus);

        //print Driver name of metroBus
        System.out.println(metroBus.driver.getName());
    }
}
