public class Moon extends Planet{

    private Planet planet;
    
    public Moon(double dis, double ang, double diam, String c, Planet p) {
        super(dis, ang, diam, c);
        this.planet = p;
    }

    /*public double getRotAngle(){
        return rotationAngle;
    } 

    public void setRotAngle(double rotationAngle){
        this.rotationAngle = rotationAngle;
    }

    public double getRotDistance(){
        return rotationDistance;
    }

    public void setRotDistance(double rotationDistance){
        this.rotationDistance = rotationDistance;
    }*/

    public void drawIntoAbout(double speedRot, SolarSystem milkyWay){
        angle += speedRot;
        milkyWay.drawSolarObjectAbout(distance, angle, diameter, colour, planet.getDistance(), planet.getAngle());
    }
    
}
