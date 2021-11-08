public class Moon extends SolarObject{

    private Planet planet;
    
    /**
     * Create a Moon object.
     * Once an instance of this Moon class is created,
     * a stelar object of the given diameter is built,
     * being able to be displayed in the Solar System.
     * It is specified that the object created should circle around a specified planet.
     * @param mW the solar system the moon belongs to.
     * @param dis the distance from the sun to the object.
     * @param ang the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     * @param diam the size of the object.
     * @param c the colour of this object, as a string. It is always one of the given options from the colour variations from the Solar System class.
     */
    public Moon(SolarSystem mW, double dis, double ang, double diam, String c) {
        super(mW, dis, ang, diam, c);
    }

    /**
     * Method for drawing the Moon object into the specified Solar System.
     * We pass two arguments and make the Moon orbit one of the specified planets.
     * @param speedRot the rotation with which the object will orbit planets.
     * @param milkyWay the Solar System that we want to draw the moon into.
     */
    public void drawIntoAbout(double speedRot, SolarSystem milkyWay){
        angle += speedRot;
        milkyWay.drawSolarObjectAbout(distance, angle, diameter, colour, planet.getDistance(), planet.getAngle());
    }
    
}
