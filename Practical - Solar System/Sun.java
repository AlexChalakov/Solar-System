public class Sun extends SolarObject{
    
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
    public Sun(String name, SolarSystem mW, double dis, double ang, double diam, double sp, String c) {
        super(name, mW, dis, ang, diam, sp, c);
    }
}
