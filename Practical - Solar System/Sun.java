public class Sun extends SolarObject{
    
    /**
     * Create a Sun object.
     * Once an instance of this Sun class is created,
     * a stelar object of the given diameter is built,
     * being able to be displayed in the Solar System.
     * The object should be in the middle of the system.
     * Planets would orbit it.
     * @param mW the solar system the sun belongs to.
     * @param diam the size of the object.
     */
    public Sun(SolarSystem mW, double diam) {
        super("Sun", mW, 0, 0, diam, 0, "YELLOW");
    }
}
