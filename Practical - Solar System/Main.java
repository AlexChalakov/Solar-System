public class Main {

/**
 * This class provides a main method which runs out Solar System
 * @author Alex Chalakov
 */
    public static void main (String[] args){  //main method

        SolarSystem milkyWay = new SolarSystem(800,800); //new solar system instance creayed with 700x700 parameteres
        Sun sun = new Sun(0,0,80, "YELLOW");    //declaring the sun object

        //introducing planets into the Solar System
        Planet mercury = new Planet(70, 0, 10, "DARK_GRAY"); 
        Planet earth = new Planet(130, 150, 20, "BLUE");
        Planet mars = new Planet(190, 360, 10, "RED");
        Planet jupiter = new Planet(270, 200, 50, "GRAY");

        //introducing moons into the Solar System
        Moon moon = new Moon(40, 150, 10, "WHITE", earth);
        Moon europa = new Moon(50, 50, 15, "ORANGE", jupiter);
        Moon callisto = new Moon(50, 230, 15, "LIGHT_GRAY", jupiter);
    
        boolean inOrbit = true; //for infinite while loop
        while(inOrbit)
        {
            //drawing in our objects into the Solar System
            sun.drawInto(milkyWay);

            earth.drawPlanetInto(0.5,milkyWay);
            mars.drawPlanetInto(2,milkyWay);
            mercury.drawPlanetInto(3, milkyWay);
            jupiter.drawPlanetInto(1, milkyWay);

            moon.drawIntoAbout(8, milkyWay);
            europa.drawIntoAbout(6, milkyWay);
            callisto.drawIntoAbout(6, milkyWay);
            
            /*milkyWay.drawSolarObjectAbout(80, angle2, 20, "LIGHT_GRAY", 0, 0); //Venus
            milkyWay.drawSolarObjectAbout(250, angle, 40, "ORANGE", 0, 0); //Saturn
            milkyWay.drawSolarObjectAbout(290, angle2, 50, "BLUE", 0, 0); //Uranus
            milkyWay.drawSolarObjectAbout(350, angle, 40, "CYAN", 0, 0); //Neptune */

            milkyWay.finishedDrawing(); //actual drawing method happens here
        }  
    }
}

