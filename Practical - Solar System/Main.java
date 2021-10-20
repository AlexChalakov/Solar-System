public class Main {
    public static void main (String[] args){  //main method

        SolarSystem milkyWay = new SolarSystem(700,700); //new solar system instance creayed with 700x700 parameteres
        Sun sun = new Sun(0,0,65, "YELLOW");

        Planet earth = new Planet(120, 180, 30, "BLUE", 0, 0);
        Planet mars = new Planet(170, 100, 20, "RED", 0, 0);

        Moon moon = new Moon(100, 100, 10, "WHITE", earth.getRotAngle(), earth.getRotDistance());
    
        boolean inOrbit = true; //for infinite while loop
        while(inOrbit)
        {
            sun.drawInto(milkyWay);

            earth.drawInto(5,milkyWay);
            mars.drawInto(2,milkyWay);

            moon.drawInto(3, milkyWay);
            /*milkyWay.drawSolarObjectAbout(50, angle, 10, "DARK_GRAY", 0, 0); //Mercury
            milkyWay.drawSolarObjectAbout(80, angle2, 20, "LIGHT_GRAY", 0, 0); //Venus
            milkyWay.drawSolarObjectAbout(120, angle, 30, "BLUE", 0, 0);    //Earth
            milkyWay.drawSolarObjectAbout(170, angle, 20, "RED", 0, 0); //Red
            milkyWay.drawSolarObjectAbout(210, angle2, 50, "GRAY", 0, 0); //Jupiter
            milkyWay.drawSolarObjectAbout(250, angle, 40, "ORANGE", 0, 0); //Saturn
            milkyWay.drawSolarObjectAbout(290, angle2, 50, "BLUE", 0, 0); //Uranus
            milkyWay.drawSolarObjectAbout(350, angle, 40, "CYAN", 0, 0); //Neptune */

    
            milkyWay.finishedDrawing(); //drawing
        }  
    }
}

