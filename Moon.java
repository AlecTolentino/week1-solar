public class Moon {
    
    private SolarSystem myMoonsSun;
    private Planet myPlanet;
    private Arrays array;

    private double velocity = 0;
    private double distance;
    private double angle;
    public double diameter;
    public java.lang.String colour;
    private double centreRotateDis;
    private double centreRotateAng;
    private double rotVelocity = 0;

    public Moon(SolarSystem createSolar, Planet createPlanet, double moonSpeed, double moonRotVelocity) {

        myMoonsSun = createSolar;
        myPlanet = createPlanet;
        velocity = moonSpeed;
        rotVelocity = moonRotVelocity;

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

     public double getRotDis() {

        return centreRotateDis;
    }

    public double getRotAng() {

        return centreRotateAng;
    }

    public double getVelocity() {

        return velocity;
    }

     public double getRotVelocity() {

        return rotVelocity;
    }

      // SETTERS //

      public void setVelocity(double newVelocity) {

        velocity = newVelocity;
    }

    public void setAngle(double newAngle) {

        angle = newAngle;
    }

     public void setRotAngle(double newRotAngle) {

        centreRotateAng = newRotAngle;
    }

    public void createMoon(double newDis, double newAngle, double newDiam, java.lang.String newCol, double newRotDis, double newRotAng) {

        //myMoonsSun.drawSolarObjectAbout(newDis, newAngle, newDiam, newCol, newRotDis, newRotAng);
        distance = newDis;
        angle = newAngle;
        diameter = newDiam;
        colour = newCol;
        centreRotateDis = newRotDis;
        centreRotateAng = newRotAng;


    }
}

