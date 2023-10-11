public class Moon {
    
    private SolarSystem myMoonsSun;
    private Planet myPlanet;

    public Moon(SolarSystem createSolar, Planet createPlanet) {

        myMoonsSun = createSolar;
        myPlanet = createPlanet;

    }

    public void createMoon(double newDis, double newAngle, double newDiam, java.lang.String newCol, double rotateDis, double rotateAng) {

        myMoonsSun.drawSolarObjectAbout(newDis, newAngle, newDiam, newCol, rotateDis, rotateAng);
    }
}

