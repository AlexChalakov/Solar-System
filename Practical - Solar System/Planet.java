public class Planet {
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String colour;
    protected double rotationAngle;
    protected double rotationDistance;

    /**
     * Create a Planet object.
     * Once an instance of this Planet class is created,
     * a stelar object of the given diameter is built,
     * being able to be displayed in the Solar System.
     * @param dis the distance from the sun to the object.
     * @param ang the angle (in degrees) that represents how far the planet is around its orbit of the sun.
     * @param diam the size of the object.
     * @param c the colour of this object, as a string. It is always one of the given options from the colour variations from the Solar System class.
     */
    public Planet(double dis, double ang, double diam, String c){
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

    public double getRotAngle(){ //get method for the rotation angle - not needed yet
        return rotationAngle;
    } 

    public void setRotAngle(double rotationAngle){ //set method for the rotation angle - not needed yet
        this.rotationAngle = rotationAngle;
    }

    public double getRotDistance(){ //get method for the rotation distance - not needed yet
        return rotationDistance;
    }

    public void setRotDistance(double rotationDistance){ //set method for the rotation angle - not needed yet
        this.rotationDistance = rotationDistance;
    }

    /**
     * Method for drawing the Planet object into the specified Solar System.
     * We pass two arguments and make the Planet orbit our sun in the middle.
     * @param speedRot the rotation with which the planet will orbit around the sun.
     * @param milkyWay the Solar System that we want to draw the planet into.
     */
    public void drawPlanetInto (double speedRot,SolarSystem milkyWay){
        angle += speedRot;
        milkyWay.drawSolarObject(distance, angle, diameter, colour);
    }

}
    

