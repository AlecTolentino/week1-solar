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

    
    public void movePlanet(Planet changePlanet) {

        while(true) {

            changePlanet.setAngle(changePlanet.getAngle() + changePlanet.getVelocity());
            updatePlanet(planetSpeed.getAngle());
        }
        
    }
    

    // for(int i = 0; i < allPlanets.length; i++) {

    //     if(allPlanets[i] = null) {

    //         allPlanets[i] = Planet;
    //     }
    // }


    public void updatePlanet(double update) {

        solarSpeed.finishedDrawing();

        solarSpeed.drawSolarObject(sunSpeed.getDistance(), sunSpeed.getAngle(), sunSpeed.getDiameter(), sunSpeed.getColour());

        solarSpeed.drawSolarObject(planetSpeed.getDistance(), update, planetSpeed.getDiameter(), planetSpeed.getColour());
    }
}
