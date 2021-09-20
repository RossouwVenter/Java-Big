package Exercise52;

import com.company.mypackage.HeavenlyBody;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, com.company.mypackage.HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<com.company.mypackage.HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
     com.company.mypackage.HeavenlyBody temp = new com.company.mypackage.HeavenlyBody("Mercury",88);
     solarSystem.put(temp.getName(),temp);
     planets.add(temp);
        temp = new com.company.mypackage.HeavenlyBody("Venus",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new com.company.mypackage.HeavenlyBody("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        com.company.mypackage.HeavenlyBody tempMoon = new com.company.mypackage.HeavenlyBody("Moon",27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new com.company.mypackage.HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new com.company.mypackage.HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new com.company.mypackage.HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new com.company.mypackage.HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new com.company.mypackage.HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new com.company.mypackage.HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new com.company.mypackage.HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new com.company.mypackage.HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new com.company.mypackage.HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new com.company.mypackage.HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new com.company.mypackage.HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(com.company.mypackage.HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getName());
        }

//        HeavenlyBody body = solarSystem.get("Jupiter");
//        System.out.println("Moons of " + body.getName());
//        for(HeavenlyBody jupiterMoon : body.getSatellites()){
//            System.out.println("\t" + jupiterMoon.getName());
//        }

        com.company.mypackage.HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for(com.company.mypackage.HeavenlyBody jupiterMoon : body.getSatellites()){
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<com.company.mypackage.HeavenlyBody> moons = new HashSet<>();
        for(com.company.mypackage.HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(com.company.mypackage.HeavenlyBody moon : moons){
            System.out.println("\t0" + moon.getName());
        }

//        Not the same as the first Pluto
        com.company.mypackage.HeavenlyBody pluto = new com.company.mypackage.HeavenlyBody("Pluto",842);
        planets.add(pluto);

        for (HeavenlyBody planet : planets){
            System.out.println(planet.getName() + ":" + planet.getOrbitualPeriod());
        }

        Object o = new Object();
        o.equals(o);
        "pluto".equals("");


    }
}
