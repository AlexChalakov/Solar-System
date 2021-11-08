public class SolarObject {
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String colour;
    protected SolarSystem milkyWay;

    public SolarObject(SolarSystem mW, double dis, double ang, double diam, String c){
        this.milkyWay = mW;
        this.distance = dis;
        this.angle = ang;
        this.diameter = diam;
        this.colour = c;
    }

    public double getDistance(){ //get method for the distance
        return distance;
    }

    public void setDistance(double distance){ //set method for the distance
        this.distance = distance;
    }

    public double getAngle(){ //get method for the angle
        return angle;
    }

    public void setAngle(double angle){ //set method for the angle
        this.angle = angle;
    }

    public double getDiameter(){ //get method for the diameter
        return diameter;
    }

    public void setDiameter(double diameter){ //set method for the diameter
        this.diameter = diameter;
    }

    public String getColour(){ //get method for the colour
        return colour;
    }

    public void setColour(String colour){ //set method for the colour
        this.colour = colour;
    }

    public void drawPlanetInto (SolarSystem milkyWay){
        milkyWay.drawSolarObject(getDistance(), getAngle(), getDiameter(), getColour());
    }

    public void drawIntoAbout(SolarSystem milkyWay){
        milkyWay.drawSolarObjectAbout(distance, angle, diameter, colour, getDistance(), getAngle());
    }

    public void move (double speedRot){
        angle += speedRot;
    }
}
