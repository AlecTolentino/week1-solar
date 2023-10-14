/** 
 * Moon class capable of creating a moon in the Solar System
 * */
public class Moon {
    
    private SolarSystem myMoonsSun;
    private Planet myPlanet;

    private double velocity = 0;
    private double distance;
    private double angle;
    public double diameter;
    public java.lang.String colour;
    private double centreRotateDis;
    private double centreRotateAng;
    private double rotVelocity = 0;

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
     * */
    public Moon(SolarSystem myMoonsSun, Planet myPlanet, double distance, double angle, double diameter, java.lang.String colour, double centreRotateDis, double centreRotateAng, double velocity, double rotVelocity) {

        this.myMoonsSun = myMoonsSun;
        this.myPlanet = myPlanet;
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = colour;
        this.centreRotateDis = centreRotateDis;
        this.centreRotateAng = centreRotateAng;
        this.velocity = velocity;
        this.rotVelocity = rotVelocity;

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
     * Obtains the moons angle from the sun
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

    /**
     * Obtains the moon's rotational distance
     * @return The rotational distance as a double
     * */
     public double getRotDis() {

        return centreRotateDis;
    }

    /**
     * Obtains the moon's rotational angle
     * @return The rotational angle as a double
     * */
    public double getRotAng() {

        return centreRotateAng;
    }

    /**
     * Obtains the moon's velocity
     * @return The velocity as a double
     * */
    public double getVelocity() {

        return velocity;
    }

    /**
     * Obtains the moon's rotational velocity
     * @return The rotational velocity as a double
     * */
     public double getRotVelocity() {

        return rotVelocity;
    }

      // SETTERS //

      /** 
     * Sets the velocity of the moon
     * @param newVelocity The new velocity of the moonS
     * */
      public void setVelocity(double newVelocity) {

        velocity = newVelocity;
    }

    /** 
     * Sets the angle of the moon
     * @param newAngle The new velocity of the moon
     * */
    public void setAngle(double newAngle) {

        angle = newAngle;
    }

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
     * */
    public void moveMoon() {

        setAngle(getAngle() + getVelocity());
        setRotAngle(getRotAng() + getRotVelocity());

        myMoonsSun.drawSolarObjectAbout(getDistance(), getAngle(), getDiameter(), getColour(), getRotDis(),  getRotAng());
    }   
}

