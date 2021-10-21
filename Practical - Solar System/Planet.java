public class Planet {
    public double distance;
    public double angle;
    public double diameter;
    public String colour;
    public double rotationAngle;
    public double rotationDistance;

    public Planet(double dis, double ang, double diam, String c){
        this.distance = dis;
        this.angle = ang;
        this.diameter = diam;
        this.colour = c;
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

    public void drawPlanetInto (double speedRot,SolarSystem milkyWay){
        angle += speedRot;
        milkyWay.drawSolarObject(distance, angle, diameter, colour);
    }

}
    

