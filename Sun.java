public class Sun {
    
    private SolarSystem mySolarSun;
    
    private double distance;
    private double angle;
    public double diameter;
    public java.lang.String colour;
    
    public Sun(SolarSystem createSolarSun) {

        mySolarSun = createSolarSun;

    }

    public double getDistance() {

        return distance;
    }

    public double getAngle() {

        return angle;
    }

    public double getDiameter() {

        return diameter;
    }

    public java.lang.String getColour() {

        return colour;
    }

    public void createSun(double newDis, double newAngle, double newDiam, java.lang.String newCol) {

        //mySolarSun.drawSolarObject(newDis, newAngle, newDiam, newCol);
        distance = newDis;
        angle = newAngle;
        diameter = newDiam;
        colour = newCol;
    }



}
