public class Arrays extends Moon {
    
    private Asteroid[] asteroidBelt;
    private Asteroid[] saturnsRings;
   
    public Arrays(SolarSystem theSolarSystem, Planet myPlanet, double distance, double angle, double diameter, java.lang.String colour, double velocity, double centreRotateDis, double centreRotateAng, double rotVelocity) {

        super(theSolarSystem, myPlanet, distance, angle, diameter, colour, centreRotateDis, centreRotateAng, velocity, rotVelocity );
        this.asteroidBelt =  new Asteroid[30];
        this.saturnsRings = new Asteroid[600];

    }

    public Asteroid[] getRings() {

        return saturnsRings;
    }

    public void addAsteroid(Asteroid newAsteroid) {

        for(int i = 0; i < asteroidBelt.length; i++) {

            if(asteroidBelt[i] == null) {

                asteroidBelt[i] = newAsteroid; 
            }
            asteroidBelt[i].moveObject();
        }
        
    }

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

