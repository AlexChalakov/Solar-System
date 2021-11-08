public class Planet extends SolarObject{
    
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String colour;
    protected SolarSystem milkyWay;

    /**
     * Create a Planet object.
     * Once an instance of this Planet class is created,
     * a stelar object of the given diameter is built,
     * being able to be displayed in the Solar System.
     * @param dis the distance from the sun to the object.
     * @param ang the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     * @param diam the size of the object.
     * @param c the colour of this object, as a string. It is always one of the given options from the colour variations from the Solar System class.
     */
    public Planet(SolarSystem mW, double dis, double ang, double diam, String c) {
        super(mW, dis, ang, diam, c);
    }

    /**
     * Method for drawing the Planet object into the specified Solar System.
     * We pass two arguments and make the Planet orbit our sun in the middle.
     * @param speedRot the rotation with which the planet will orbit around the sun.
     * @param milkyWay the Solar System that we want to draw the planet into.
     */
    public void drawPlanetInto (double speedRot,SolarSystem milkyWay){
        angle += speedRot;
        milkyWay.drawSolarObject(getDistance(), getAngle(), getDiameter(), getColour());
    }

}
    

