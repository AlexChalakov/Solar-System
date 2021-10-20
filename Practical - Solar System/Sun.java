public class Sun {
    private double distance;
    private double angle;
    private double diameter;
    private String colour;

    public Sun(double dis, double ang, double diam, String c){
        this.distance = dis;
        this.angle = ang;
        this.diameter = diam;
        this.colour = c;
    }

    public void drawInto (SolarSystem milkyWay){
        milkyWay.drawSolarObject(distance, angle, diameter, colour);
    }
}
