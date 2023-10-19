/** 
 * Comet class to create and move a comet
**/
public class Comet extends Moon{

    /** 
     * Constructor for Comet class
     * Creates a Comet with the following requirements
     * 
     * @param theSolarSystem Associates a Comet with a Solar System
     * @param myPlanet Associates a comet with a planet
     * @param distance Distance of comet from the sun
     * @param angle Angle of comet from the sun
     * @param diameter Diameter of the comet
     * @param colour Colour of the comet
     * @param velocity Sets the velocity of a comet
     * @param centreRotateDis Distance away from a given planet/co-ordinate
     * @param centreRotateAng Angle away from a given planet/co-ordinate
     * @param rotVelocity Rotational velocity around a planet
    **/
    public Comet(SolarSystem theSolarSystem, Planet myPlanet, double distance, double angle, double diameter, java.lang.String colour, double velocity, double centreRotateDis, double centreRotateAng, double rotVelocity) {

        super(theSolarSystem, myPlanet, distance, angle, diameter, colour, centreRotateDis, centreRotateAng, velocity, rotVelocity );
        
    }

    // METHODS //

    /**
     * Creates movement for a comet
    **/
    public void moveComet() {

        setAngle(getAngle() + getVelocity());
        setRotAngle(getRotAng() + (getRotVelocity() - 4));

        theSolarSystem.drawSolarObjectAbout(getDistance(), getAngle(), getDiameter(), getColour(), getRotDis(),  getRotAng());
            
    }
    

    
    
}
