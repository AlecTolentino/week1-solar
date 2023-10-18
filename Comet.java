public class Comet extends Moon{

    public Comet(SolarSystem theSolarSystem, Planet myPlanet, double distance, double angle, double diameter, java.lang.String colour, double velocity, double centreRotateDis, double centreRotateAng, double rotVelocity) {

        super(theSolarSystem, myPlanet, distance, angle, diameter, colour, centreRotateDis, centreRotateAng, velocity, rotVelocity );
        
    }

    public void moveComet() {

        setAngle(getAngle() + getVelocity());
        setRotAngle(getRotAng() + (getRotVelocity() - 4));

        theSolarSystem.drawSolarObjectAbout(getDistance(), getAngle(), getDiameter(), getColour(), getRotDis(),  getRotAng());
            
    }
    

    
    
}
