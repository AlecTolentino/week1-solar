public class Movement {
    
    private SolarSystem solarSpeed;
    private Sun sunSpeed;
    private Planet planetSpeed;
    private Moon moonSpeed;
   // private Arrays moonA;

    public Movement(SolarSystem newSolarSpeed, Sun speedASun, Planet speedPlanet, Moon speedMoon/*,Arrays newA*/) {

        solarSpeed =  newSolarSpeed;
        sunSpeed = speedASun;
        planetSpeed = speedPlanet;
        moonSpeed = speedMoon;
        //moonA = newA;
    }

    //Movement class moves one planet and one moon, if there are multiple moons we need mutliple instances

    public Moon getspeed() {

        return moonSpeed;
    }

    
    public void movePlanet(Planet changePlanet) {

            changePlanet.setAngle(changePlanet.getAngle() + changePlanet.getVelocity());
            solarSpeed.drawSolarObject(sunSpeed.getDistance(), sunSpeed.getAngle(), sunSpeed.getDiameter(), sunSpeed.getColour());

            solarSpeed.drawSolarObject(planetSpeed.getDistance(), planetSpeed.getAngle(), planetSpeed.getDiameter(), planetSpeed.getColour());
        
    }

    public void moveMoon(Moon changeMoon) {

        changeMoon.setAngle(changeMoon.getAngle() + changeMoon.getVelocity());
        changeMoon.setRotAngle(changeMoon.getRotAng() + changeMoon.getRotVelocity());

        solarSpeed.drawSolarObjectAbout(moonSpeed.getDistance(), changeMoon.getAngle(), moonSpeed.getDiameter(), moonSpeed.getColour(), moonSpeed.getRotDis(),  changeMoon.getRotAng());
    }   

    // How do i get it to stop so i can draw other objects and make them move also
    //arrays? if changeMoon = position in array, change that positions values to new values
    // How do i add multiple moons with less lines of code of "movement instances"
    //Planet needs moon to move?
    

    // for(int i = 0; i < allPlanets.length; i++) {

    //     if(allPlanets[i] = null) {

    //         allPlanets[i] = Planet;
    //     }
    // }

}
