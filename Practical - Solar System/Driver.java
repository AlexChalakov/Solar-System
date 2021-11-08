import java.util.ArrayList;

public class Driver implements SolarSystemController{

    SolarSystem milkyWay = new SolarSystem(800,800); //new solar system instance creayed with 700x700 parameteres
    SolarSystemGUI gui = new SolarSystemGUI();
    ArrayList<SolarObject> SolarObjects = new ArrayList<SolarObject>();

    public Driver(){
        
        gui.addSolarSystemController(this);

        SolarObjects.add(new Sun(milkyWay, 0, 0, 80, "YELLOW"));
        
        SolarObjects.add(new Planet(milkyWay, 70, 0, 10, "DARK_GRAY")); //Mercury - 1
        SolarObjects.add(new Planet(milkyWay, 130, 150, 20, "BLUE")); //Earth - 2
        SolarObjects.add(new Planet(milkyWay, 190, 360, 10, "RED")); //Mars - 3
        SolarObjects.add(new Planet(milkyWay, 270, 200, 50, "GRAY")); // Jupiter - 4

        SolarObjects.add(new Moon(milkyWay, SolarObjects.get(2).getDistance(), SolarObjects.get(2).getAngle(), 10, "WHITE")); // Moon Earth

        boolean inOrbit = true; //for infinite while loop
        while(inOrbit){
            for(SolarObject objects : SolarObjects){
                objects.drawPlanetInto(milkyWay);
                objects.move(0.5);
            }
            /*for(SolarObject moonObjects : SolarObjects){
                moonObjects.drawIntoAbout(milkyWay);
                moonObjects.move(1);
            }*/
         milkyWay.finishedDrawing();
        }
        
        /*
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

            milkyWay.finishedDrawing(); //actual drawing method happens here
        } */
    }

    @Override
    public void add(String name, double orbitalDistance, double initialAngle, double size, double speed, String colour) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void add(String name, double orbitalDistance, double initialAngle, double size, double speed, String colour,
            String parentName) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(String name) {
        // TODO Auto-generated method stub
        
    }
}
