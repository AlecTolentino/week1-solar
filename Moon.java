/** 
 * Moon class to create and move a Moon
**/
public class Moon extends SolarObject {
    
    protected Planet myPlanet;
    protected double centreRotateDis;
    protected double centreRotateAng;
    protected double rotVelocity = 0;

    /** 
     * Constructor for Moon class
     * Creates a Moon with the following requirements
     * 
     * @param myMoonsSun Associates a planet with a sun
     * @param myPlanet Associates a moon with a planet
     * @param distance Distance of moon from the sun
     * @param angle Angle of moon from the sun
     * @param diameter Diameter of the moon
     * @param colour Colour of the moon
     * @param centreRotateDis Distance from given point
     * @param centreRotateAng Angle from given point
     * @param velocity Sets the velocity of a moon
    **/
    public Moon(SolarSystem theSolarSystem, Planet myPlanet, double distance, double angle, double diameter, java.lang.String colour, double centreRotateDis, double centreRotateAng, double velocity, double rotVelocity) {

        super(theSolarSystem, distance, angle, diameter, colour, velocity);
        this.myPlanet = myPlanet;
        this.centreRotateDis = centreRotateDis;
        this.centreRotateAng = centreRotateAng;
        this.rotVelocity = rotVelocity;

    }

      // GETTERS //

    /**
     * Obtains the moon's rotational distance
     * @return The rotational distance as a double
    **/
     public double getRotDis() {

        return centreRotateDis;
    }

    /**
     * Obtains the moon's rotational angle
     * @return The rotational angle as a double
    **/
    public double getRotAng() {

        return centreRotateAng;
    }


    /**
     * Obtains the moon's rotational velocity
     * @return The rotational velocity as a double
    **/
     public double getRotVelocity() {

        return rotVelocity;
    }

      // SETTERS //

    /** 
     * Sets the rotational angle of the moon
     * @param newRotAngle The new rotational angle of the moon
     * */
    public void setRotAngle(double newRotAngle) {
        
        centreRotateAng = newRotAngle;
    }


    // METHODS //

    /** 
     * Creates movement for the moon
    **/
    public void moveRotate() {

        setAngle(getAngle() + getVelocity());
        setRotAngle(getRotAng() + getRotVelocity());
        theSolarSystem.drawSolarObjectAbout(getDistance(), getAngle(), getDiameter(), getColour(), getRotDis(),  getRotAng());
            
    }   
}

