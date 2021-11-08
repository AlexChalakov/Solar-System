public class Sun extends SolarObject{
    
    private SolarSystem milkyWay;
    private double distance;
    private double angle;
    private double diameter;
    private String colour;

    /**
     * Create a Sun object.
     * Once an instance of this Sun class is created,
     * a stelar object of the given diameter is built,
     * being able to be displayed in the Solar System.
     * The object should be in the middle of the system.
     * Planets would orbit it.
     * @param mW the solar system the sun belongs to.
     * @param dis the distance from the sun to the object.
     * @param ang the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     * @param diam the size of the object.
     * @param c the colour of this object, as a string. It is always one of the given options from the colour variations from the Solar System class.
     */
    public Sun(SolarSystem mW, double dis, double ang, double diam, String c) {
        super(mW, dis, ang, diam, c);
    }

    /**
     * Method for drawing the Sun object into the specified Solar System.
     * We pass it as an argument and then specify the measurements of the sun.
     * @param milkyWay the Solar System that we want to draw the sun into.
     */
    public void drawInto (){
        milkyWay.drawSolarObject(distance, angle, diameter, colour);
    }
}
