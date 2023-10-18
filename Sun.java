/** 
 * Sun class capable of creating a sun in the Solar System
 * */
public class Sun {
    
    private SolarSystem mySolarSun;
    
    private double distance;
    private double angle;
    private double diameter;
    private java.lang.String colour;

    
    /** 
     * Constructor for Sun class
     * Creates a Sun with the following requirements
     * 
     * @param mySolarSun Associates a sun with a solar system
     * @param distance Distance of moon from the sun
     * @param angle Angle of moon from the sun
     * @param diameter Diameter of the moon
     * @param colour Colour of the moon
     * */
    public Sun(SolarSystem mySolarSun, double distance, double angle, double diameter, java.lang.String colour) {

        this.mySolarSun = mySolarSun;
        this.distance = distance;
        this.angle = angle; 
        this.diameter = diameter;
        this.colour = colour;

    }

    // GETTERS //

     /**
     * Obtains the moons distance from the sun
     * @return The distance from the sun as a double
     * */
    public double getDistance() {

        return distance;
    }

    /**
     * Obtains the planet's angle from the sun
     * @return The angle from the sun as a double
     * */
    public double getAngle() {

        return angle;
    }

    /**
     * Obtains the moons diameter 
     * @return The diameter fof the moon as a double
     * */
    public double getDiameter() {

        return diameter;
    }

    /**
     * Obtains the moon's colour
     * @return The colour of the planet as a java.lang.String
     * */
    public java.lang.String getColour() {

        return colour;
    }

    // METHODS //
     /**
     * Creates a sun
     * */
    public void createSun() {

        mySolarSun.drawSolarObject(getDistance(), getAngle(), getDiameter(), getColour());
   
    }



}
