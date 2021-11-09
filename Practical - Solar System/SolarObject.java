public class SolarObject {
    protected String name;
    protected SolarSystem milkyWay;
    protected double distance;
    protected double angle;
    protected double diameter;
    protected double speed;
    protected String colour;

    /**
     * This is the constructor for the father class, which all of the other objects inherit.
     * As implemented in all of the other object classes, it can polymorph itself into any of them,
     * creating the ones we need.
     * @param name the name of the object iself.
     * @param mW the solar system the planet is in.
     * @param dis the distance from the sun to the object.
     * @param ang the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     * @param diam the size of the object.
     * @param sp the speed of the object.
     * @param c the colour of this object, as a string. It is always one of the given options from the colour variations from the Solar System class.
     */
    public SolarObject(String name, SolarSystem mW, double dis, double ang, double diam, double sp, String c){
        this.name = name;
        this.milkyWay = mW;
        this.distance = dis;
        this.angle = ang;
        this.diameter = diam;
        this.speed = sp;
        this.colour = c;
    }

    public String getName(){ //get method for name
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getDistance(){ //get method for the distance
        return distance;
    }

    public void setDistance(double distance){ //set method for the distance
        this.distance = distance;
    }

    public double getAngle(){ //get method for the angle
        return angle;
    }

    public void setAngle(double angle){ //set method for the angle
        this.angle = angle;
    }

    public double getDiameter(){ //get method for the diameter
        return diameter;
    }

    public void setDiameter(double diameter){ //set method for the diameter
        this.diameter = diameter;
    }

    public String getColour(){ //get method for the colour
        return colour;
    }

    public void setColour(String colour){ //set method for the colour
        this.colour = colour;
    }
    
     /**
     * Method for drawing the Planet object into the specified Solar System.
     * We pass one argument and make the Planet orbit our sun in the middle with the drawLine inside.
     * @param milkyWay the Solar System that we want to draw the planet into.
     */
    public void drawPlanetInto (SolarSystem milkyWay){
        milkyWay.drawSolarObject(getDistance(), getAngle(), getDiameter(), getColour());
    }

     /**
     * Method for drawing the Moon object into the specified Solar System.
     * We pass two arguments and make the Moon orbit one of the specified planets.
     * @param milkyWay the Solar System that we want to draw the moon into.
     * @param aroundBody the body which the soon will orbit.
     */
    public void drawIntoAbout(SolarSystem milkyWay, SolarObject aroundBody){
        milkyWay.drawSolarObjectAbout(distance, angle, diameter, colour, aroundBody.getDistance(), aroundBody.getAngle());
    }

    /**
     * Method for making the moving of objects possible.
     */
    public void move (){
        angle += speed;
    }
}
