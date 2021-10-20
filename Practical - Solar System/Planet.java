public class Planet {
    private double distance;
    private double angle;
    private double diameter;
    private String colour;
    private double rotationAngle;
    private double rotationDistance;

    public Planet(double dis, double ang, double diam, String c, double rotationAng, double rotationDis){
        this.distance = dis;
        this.angle = ang;
        this.diameter = diam;
        this.colour = c;
        this.rotationAngle = rotationAng;
        this.rotationDistance = rotationDis;
    }

    public double getDistance(){
        return distance;
    }

    public void setDistance(double distance){
        this.distance = distance;
    }

    public double getAngle(){
        return angle;
    }

    public void setAngle(double angle){
        this.angle = angle;
    }

    public double getDiameter(){
        return diameter;
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
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


    public void drawInto (double speedRot,SolarSystem milkyWay){
        angle += speedRot;
        milkyWay.drawSolarObjectAbout(distance, angle, diameter, colour, getRotAngle(), getRotDistance());
    }

}
    
