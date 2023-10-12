public class Arrays {

    private SolarSystem theSolar;
    private Sun theSun;

    
    private Planet[] allPlanets;
    private Moon[] allMoons;

    public Arrays(SolarSystem mySolar, Sun mySun) {

        theSolar = mySolar;
        theSun = mySun;

        allPlanets = new Planet[10];
        allMoons = new Moon[40];
    }

    // public Moon getMoons() {

    //     return allMoons.length;
    // }

    public void addMoon(Moon newMoon) {

        for(int i = 0; i < allMoons.length; i++) {

            if(allMoons[i] == null) {

                allMoons[i] = newMoon;
                break;
            }
        }
    }
}
