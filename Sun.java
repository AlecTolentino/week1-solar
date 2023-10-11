public class Sun {
    
    private SolarSystem mySolarSun;
    
    public Sun(SolarSystem createSolarSun) {

        mySolarSun = createSolarSun;

    }

    public void createSun(double newDis, double newAngle, double newDiam, java.lang.String newCol) {

        mySolarSun.drawSolarObject(newDis, newAngle, newDiam, newCol);
    }



}
