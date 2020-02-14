package com.bjsxt.builder;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * ÓîÖæ·É´¬
 *
 */
public class AirShip {
    private OrbitalModule orbitalModule;//¹ìµÀ²Õ
    private Engine engine;//·¢¶¯»ú
    private EscapeTower escapeTower;//ÌÓÒÝËþ

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    public void launch() {
        System.out.println("µã»ð·¢Éä");
    }
}

    class OrbitalModule {
        private String name;

        public OrbitalModule(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class Engine {
        private String name;

        public Engine(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class EscapeTower {
        private String name;

        public EscapeTower(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
