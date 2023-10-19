public class Arrays extends Moon {
    
    private Asteroid[] asteroidBelt;
    private Asteroid[] saturnsRings;
   
    public Arrays(SolarSystem theSolarSystem, Planet myPlanet, double distance, double angle, double diameter, java.lang.String colour, double velocity, double centreRotateDis, double centreRotateAng, double rotVelocity) {

        super(theSolarSystem, myPlanet, distance, angle, diameter, colour, centreRotateDis, centreRotateAng, velocity, rotVelocity );
        this.asteroidBelt =  new Asteroid[30];
        this.saturnsRings = new Asteroid[10];

    }

    public void addAsteroid(Asteroid newAsteroid) {

        for(int i = 0; i < asteroidBelt.length; i++) {

            if(asteroidBelt[i] == null) {

                asteroidBelt[i] = newAsteroid; 
            }
            asteroidBelt[i].moveObject();
        }
        
    }

    public void addRing(Asteroid newRing) {

        

        for(int i = 0; i < saturnsRings.length; i++) {


            if(saturnsRings[i] == null) {

              
                saturnsRings[i] = newRing;
    
            
            }
            saturnsRings[i].moveRotate();
           
        }
        System.out.println(saturnsRings[0].getRotAng());
        System.out.println(saturnsRings[1].getRotAng());


        
    }
}

