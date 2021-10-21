public class Moon extends Planet{

    private double rotationAngle;
    private double rotationDistance;
    
    public Moon(double dis, double ang, double diam, String c, double rotationAng, double rotationDis) {
        super(dis, ang, diam, c);
        this.rotationAngle = rotationAng;
        this.rotationDistance = rotationDis;
    }

    public double getRotAngle(){
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
    }

    public void drawIntoAbout(double speedRot, SolarSystem milkyWay){
        angle += speedRot;
        milkyWay.drawSolarObjectAbout(distance, angle, diameter, colour, rotationAngle, rotationDistance);
    }
    
}
