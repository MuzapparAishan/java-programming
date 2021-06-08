package day48_constructors_static;

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.sql.Driver;

public class Bus {
    Driver driver;
    Engine engine;

    public String toString() {
        return driver.getName() +" | "+ engine.getCylinders();
    }

}
