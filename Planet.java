/** 
 * Planet class capable of creating a planet in the Solar System
 * */
public class Planet extends SolarObject{

    Sun mySun;

    /** 
     * Constructor for Planet class
     * Creates a Planet with the following requirements
     * 
     * @param mySolar Associates a planet with a solar system
     * @param mySun Associates a planet with a sun
     * @param distance Distance of planet from the sun
     * @param angle Angle of planet from the sun
     * @param diameter Diameter of the planet
     * @param colour Colour of the planet
     * @param velocity Sets the velocity of a planet
     * */
    public Planet(SolarSystem mySolar, Sun aSun, double distance, double angle, double diameter, java.lang.String colour, double velocity) {

        super(mySolar, distance, angle, diameter, colour, velocity);
        mySun = aSun;
     
    }

    
}
