public class Movement {
    
    private SolarSystem solarSpeed;
    private Sun sunSpeed;
    private Planet planetSpeed;
    private Moon moonSpeed;

    public Movement(SolarSystem newSolarSpeed, Sun speedASun, Planet speedPlanet/* ,Moon speedMoon*/) {

        solarSpeed =  newSolarSpeed;
        sunSpeed = speedASun;
        planetSpeed = speedPlanet;
        //moonSpeed = speedMoon;
    }

    
    public void movePlanet() {

        System.out.println(planetSpeed.getAngle());

        planetSpeed.setVelocity(4);

        while(true) {

            //System.out.println(planetSpeed.getAngle());
            planetSpeed.setAngle(5);

        }

        
    }
}
