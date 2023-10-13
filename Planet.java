public class Planet {

    private SolarSystem mySolar;
    private Sun mySun;

    private double velocity = 0;
    private double distance;
    private double angle;
    public double diameter;
    public java.lang.String colour;
    
    public Planet(SolarSystem createSolar, Sun createSun, double planSpeed) {

        mySolar = createSolar;
        mySun = createSun;
        velocity = planSpeed;

    }

    // GETTERS //

    public double getDistance() {

        return distance;
    }

    public double getAngle() {

        return angle;
    }

    public double getDiameter() {

        return diameter;
    }

    public java.lang.String getColour() {

        return colour;
    }

    public double getVelocity() {

        return velocity;
    }


    // SETTERS //

    public void setVelocity(double newVelocity) {

        velocity = newVelocity;
    }

    public void setAngle(double newAngle) {

        angle = newAngle;
    }

    // METHODS //

    public void createPlanet(double newDis, double newAngle, double newDiam, java.lang.String newCol) {

        //mySolar.drawSolarObject(newDis, newAngle, newDiam, newCol);
        distance = newDis;
        angle = newAngle;
        diameter = newDiam;
        colour = newCol;

    }

    public void movePlanet(Planet changePlanet) {

        changePlanet.setAngle(changePlanet.getAngle() + changePlanet.getVelocity());
        mySolar.drawSolarObject(mySun.getDistance(), mySun.getAngle(), mySun.getDiameter(), mySun.getColour());

        mySolar.drawSolarObject(changePlanet.getDistance(), changePlanet.getAngle(), changePlanet.getDiameter(), changePlanet.getColour());
    
}

    
}
