/** 
 * Parent class for a Solar Object
 * Contains important attributes of most Solar Objects
 * Contains methods for most Solar Objects
**/
public class SolarObject {
    
    protected SolarSystem theSolarSystem;
    protected double distance;
    protected double angle;
    protected double diameter;
    protected java.lang.String colour;
    protected double velocity = 0;

    /** 
     * Constructor for SolarObject class
     * Creates a SolarObject with the following requirements
     * 
     * @param theSolarSystem Associates a Solar Object with a Solar System
     * @param distance Distance of Solar Object from the sun
     * @param angle Angle of Solar Object from the sun
     * @param diameter Diameter of the Solar Object
     * @param colour Colour of the Solar Object
     * @param velocity Sets the velocity of a Solar Object
    **/
    public SolarObject(SolarSystem theSolarSystem, double distance, double angle, double diameter, java.lang.String colour, double velocity) {

        this.theSolarSystem = theSolarSystem;
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = colour;
        this.velocity = velocity;

    }


    // GETTERS //

    /**
     * Obtains the distance of an object from the Sun
     * @return The distance from the sun as a double
    **/
    public double getDistance() {

        return distance;
    }

    /**
     * Obtains the angle of an object from the sun
     * @return The angle from the sun as a double
    **/
    public double getAngle() {

        return angle;
    }

    /**
     * Obtains an object's diameter
     * @return The object's diameter
    **/
    public double getDiameter() {

        return diameter;
    }

    /**
     * Obtains the objects's colour
     * @return The colour of the object as a java.lang.String
    **/
    public java.lang.String getColour() {

        return colour;
    }

    /**
     * Obtains the objects's velocity
     * @return The velocity of the object
    **/
    public double getVelocity() {

        return velocity;
    }

    // SETTERS //

    /** 
     * Sets the velocity of the object
     * @param newVelocity The new velocity of the object
    **/
    public void setVelocity(double newVelocity) {

        velocity = newVelocity;
    }

    /** 
     * Sets the angle of the object
     * @param newAngle The new angle of the object
    **/
    public void setAngle(double newAngle) {

        angle = newAngle;
    }

     // METHODS //

    /** 
      * Creates movement for an object
    **/
    public void moveObject() {

        setAngle(getAngle() + getVelocity());

        theSolarSystem.drawSolarObject(getDistance(), getAngle(), getDiameter(), getColour());
    }   
}
