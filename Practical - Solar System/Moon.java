public class Moon extends SolarObject{
    
    private SolarObject orbittingObject;

    /**
     * Create a Moon object.
     * Once an instance of this Moon class is created,
     * a stelar object of the given diameter is built,
     * being able to be displayed in the Solar System.
     * It is specified that the object created should circle around a specified planet.
     * @param dis the distance from the sun to the object.
     * @param mW the solar system the planet is in.
     * @param ang the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     * @param diam the size of the object.
     * @param sp the speed of the object.
     * @param c the colour of this object, as a string. It is always one of the given options from the colour variations from the Solar System class.
     * @param obj the solar object the moon will orbit.
     */
    public Moon(String name, SolarSystem mW, double dis, double ang, double diam, double sp, String c, SolarObject obj) {
        super(name, mW, dis, ang, diam, sp, c);
        this.orbittingObject = obj;
    }

    public SolarObject getObject(){
        return orbittingObject;
    }
}
