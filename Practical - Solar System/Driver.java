import java.util.ArrayList;

public class Driver implements SolarSystemController{

    SolarSystem milkyWay = new SolarSystem(800,800); //new solar system instance creayed with 700x700 parameteres
    SolarSystemGUI gui = new SolarSystemGUI(); //introducing the GUI
    ArrayList<SolarObject> SolarObjects = new ArrayList<SolarObject>(); //introducint the ArrayList where all the objects are stored

    public Driver(){
        
        gui.addSolarSystemController(this);

        SolarObjects.add(new Sun("Sun",milkyWay, 0, 0, 80, 0, "YELLOW"));
        
        SolarObjects.add(new Planet("Mercury",milkyWay, 70, 0, 10, 0.5, "DARK_GRAY")); //Mercury - 1
        SolarObject earth = new Planet("Earth",milkyWay, 130, 150, 20, 1,  "BLUE");
        SolarObjects.add(earth); //Earth - 2
        SolarObjects.add(new Planet("Mars",milkyWay, 190, 360, 10, 1.5, "RED")); //Mars - 3
        SolarObjects.add(new Planet("Jupiter",milkyWay, 270, 200, 50, 1, "GRAY")); // Jupiter - 4

        SolarObjects.add(new Moon("Moon",milkyWay, 40, 150, 10, 4, "WHITE", earth )); // Moon Earth

        boolean inOrbit = true; //for infinite while loop
        while(inOrbit){
            for(SolarObject objects : SolarObjects ){   //looping through each one of them
                if(objects.getName().equals("Moon")){
                    objects.drawIntoAbout(milkyWay, ((Moon) objects).getObject()); //drawing the moons
                    objects.move();
                } else {
                    objects.drawPlanetInto(milkyWay); //drawing the planets
                    objects.move();
                }
            }
         milkyWay.finishedDrawing();
        }
    }

    /**
     * A method to add the planets from the controller
     */
    @Override
    public void add(String name, double orbitalDistance, double initialAngle, double size, double speed, String colour) {
        SolarObject solarObject = new Planet(name, milkyWay, orbitalDistance, initialAngle, size, speed, colour);
        SolarObjects.add(solarObject);
        
    }

    /**
     * A method to add the moons orbitting the chosen planet 
     */
    @Override
    public void add(String name, double orbitalDistance, double initialAngle, double size, double speed, String colour,
            String parentName) {
        for(SolarObject aroundObject : SolarObjects){
            if(aroundObject.getName().equals(parentName)){
                SolarObject moonObject = new Moon(name, milkyWay, orbitalDistance, initialAngle, size, speed, colour, aroundObject);
                SolarObjects.add(moonObject);
            }
        }
    }

    /**
     * A method to remove the planets from the arraylist and from our Solar System
     */
    @Override
    public void remove(String name) {
        for(SolarObject deadPlanet : SolarObjects){
            if(deadPlanet.getName().equals(name)){
                SolarObjects.remove(deadPlanet);
            }
        }
    }
}
