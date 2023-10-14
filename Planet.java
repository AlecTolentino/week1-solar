/** 
 * Planet class capable of creating a planet in the Solar System
 * */
public class Planet {

    private SolarSystem mySolar;
    private Sun mySun;

    private double velocity = 0;
    private double distance;
    private double angle;
    public double diameter;
    public java.lang.String colour;
    
    /** 
     * Constructor for Planet class
     * Creates a Planet with the following requirements
     * 
     * @param createSolar Associates a planet with a solar system
     * @param createSun Associates a planet with a sun
     * @param distance Distance of planet from the sun
     * @param angle Angle of planet from the sun
     * @param diameter Diameter of the planet
     * @param colour Colour of the planet
     * @param velocity Sets the velocity of a planet
     * */
    public Planet(SolarSystem createSolar, Sun createSun, double distance, double angle, double diameter, java.lang.String colour, double velocity) {

        mySolar = createSolar;
        mySun = createSun;
        this.velocity = velocity;
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = colour;

    }

    // GETTERS //

    /**
     * Obtains the planet's distance from the sun
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
     * Obtains the planet's diameter
     * @return The angle from the sun as a double
     * */
    public double getDiameter() {

        return diameter;
    }

    /**
     * Obtains the planet's colour
     * @return The colour of the planet as a java.lang.String
     * */
    public java.lang.String getColour() {

        return colour;
    }

    /**
     * Obtains the planet's velocity
     * @return The velocity of the planet
     * */
    public double getVelocity() {

        return velocity;
    }


    // SETTERS //

    /** 
     * Sets the velocity of the planet
     * @param newVelocity The new velocity of the planet
     * */
    public void setVelocity(double newVelocity) {

        velocity = newVelocity;
    }

    /** 
     * Sets the angle of the planet
     * @param newAngle The new angle of the planet
     * */
    public void setAngle(double newAngle) {

        angle = newAngle;
    }

    // METHODS //

    /** 
     * Moves a planet
     **/
    public void movePlanet() {

        setAngle(getAngle() + getVelocity());
        mySolar.drawSolarObject(mySun.getDistance(), mySun.getAngle(), mySun.getDiameter(), mySun.getColour());

        mySolar.drawSolarObject(getDistance(), getAngle(), getDiameter(), getColour());
        
        
    }

    
}
