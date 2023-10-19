/**
 * Asteroid class to create an asteroid
**/
public class Asteroid extends Moon {

    /** 
     * Constructor for Asteroid class
     * Creates an Asteroid with the following requirements
     * 
     * @param theSolarSystem Associates an Asteroid with a Solar System
     * @param myPlanet Associates an Asteroid with a planet
     * @param distance Distance of Asteroid from the sun
     * @param angle Angle of Asteroid from the sun
     * @param diameter Diameter of the Asteroid
     * @param colour Colour of the Asteroid
     * @param centreRotateDis Distance away from a given planet/co-ordinate
     * @param centreRotateAng Angle away from a given planet/co-ordinate
     * @param velocity Sets the velocity of a Asteroid
     * @param rotVelocity Rotational velocity around a planet
    **/
    public Asteroid(SolarSystem theSolarSystem, Planet myPlanet, double distance, double angle, double diameter, java.lang.String colour, double centreRotateDis, double centreRotateAng, double velocity, double rotVelocity) {

        super(theSolarSystem, myPlanet, distance, angle, diameter, colour, centreRotateAng, centreRotateDis, velocity, rotVelocity);
    
        
    }

    
}
