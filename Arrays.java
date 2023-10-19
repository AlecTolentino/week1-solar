/**
 * Array class to create a large amount of asteroids
**/
public class Arrays extends Moon {
    
    private Asteroid[] asteroidBelt;
    private Asteroid[] saturnsRings;
   

     /** 
     * Constructor for Arrays class
     * Creates arrays with the following requirements
     * 
     * @param theSolarSystem Associates an array with a Solar System
     * @param myPlanet Associates an array with a planet
     * @param distance Distance of Asteroid from the sun
     * @param angle Angle of Asteroid from the sun
     * @param diameter Diameter of the Asteroid
     * @param colour Colour of the Asteroid
     * @param velocity Sets the velocity of a Asteroid
     * @param centreRotateDis Distance away from a given planet/co-ordinate
     * @param centreRotateAng Angle away from a given planet/co-ordinate
     * @param rotVelocity Rotational velocity around a planet
    **/
    public Arrays(SolarSystem theSolarSystem, Planet myPlanet, double distance, double angle, double diameter, java.lang.String colour, double velocity, double centreRotateDis, double centreRotateAng, double rotVelocity) {

        super(theSolarSystem, myPlanet, distance, angle, diameter, colour, centreRotateDis, centreRotateAng, velocity, rotVelocity );
        this.asteroidBelt =  new Asteroid[30];
        this.saturnsRings = new Asteroid[600];

    }

    // GETTERS //

    /**
     * Obtains an object array
     * @return An asteroid array
    **/
    public Asteroid[] getRings() {

        return saturnsRings;
    }

    // METHODS //

    /** 
      * Creates an array of asteroids
      * @param newAsteroid Asteroid to create many asteroids of that type
    **/
    public void addAsteroid(Asteroid newAsteroid) {

        for(int i = 0; i < asteroidBelt.length; i++) {

            if(asteroidBelt[i] == null) {

                asteroidBelt[i] = newAsteroid; 
            }
            asteroidBelt[i].moveObject();
        }
        
    }

    /** 
      * Creates an array of asteroids about a point
      * @param newRing Asteroid to create many asteroids of that type
      * @param newRing2 Asteroid ring 2 to create many asteroids of that type
      * @param newRing3 Asteroid ring 3 to create many asteroids of that type
    **/
    public void addRing(Asteroid newRing, Asteroid newRing2, Asteroid newRing3) {

        newRing.setAngle(newRing.getAngle() + newRing.getVelocity());
        newRing.setRotAngle(newRing.getRotAng() + newRing.getRotVelocity());

        newRing2.setAngle(newRing2.getAngle() + newRing2.getVelocity());
        newRing2.setRotAngle(newRing2.getRotAng() + newRing2.getRotVelocity());

        newRing3.setAngle(newRing3.getAngle() + newRing3.getVelocity());
        newRing3.setRotAngle(newRing3.getRotAng() + newRing3.getRotVelocity());

        for(int i = 0; i < saturnsRings.length; i++) {

            if(saturnsRings[i] == null) {

                saturnsRings[i] = newRing;

                if(saturnsRings[200] != null) {
                    
                    saturnsRings[i] = newRing2;
                }

                 if(saturnsRings[400] != null) {
                    
                    saturnsRings[i] = newRing3;
                }
            }
        
         saturnsRings[i].setRotAngle(saturnsRings[i].getRotAng() + saturnsRings[i].getRotVelocity() + 1);
         theSolarSystem.drawSolarObjectAbout(saturnsRings[i].getDistance(), saturnsRings[i].getAngle(), saturnsRings[i].getDiameter(), saturnsRings[i].getColour(), saturnsRings[i].getRotDis(),  saturnsRings[i].getRotAng());

        }

      

        
    }
}

