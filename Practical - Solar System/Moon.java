public class Moon extends Planet{

    private Planet planet;
    
    public Moon(double dis, double ang, double diam, String c, Planet p) {
        super(dis, ang, diam, c);
        this.planet = p;
    }

    public void drawIntoAbout(double speedRot, SolarSystem milkyWay){
        angle += speedRot;
        milkyWay.drawSolarObjectAbout(distance, angle, diameter, colour, planet.getDistance(), planet.getAngle());
    }
    
}
