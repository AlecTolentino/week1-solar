public class Driver {
    
    public static void main(String[] arguments) {

        // INSTANCES

        SolarSystem nSolar = new SolarSystem(1000, 1000);

        Sun theSun = new Sun(nSolar);

        Arrays nSolarArray = new Arrays(nSolar, theSun);

        theSun.createSun(0, 0, 175, "YELLOW");
        
        Planet earth = new Planet(nSolar, theSun, 1);
        earth.createPlanet(225, 90, 35, "BLUE");

        Moon earthMoon = new Moon(nSolar, earth, 1, 4);
        earthMoon.createMoon(225, 90, 9, "GRAY", 40, 3);

        //nSolarArray.addMoon(earthMoon);

        Movement solar1 = new Movement(nSolar, theSun, earth, earthMoon/* , nSolarArray*/);

        Moon a = new Moon(nSolar, earth, 1, 3);
        a.createMoon(225, 90, 9, "RED", 80, 3);

        Planet venus = new Planet(nSolar, theSun, 0.3);
        venus.createPlanet(400, 55,80, "GREEN");

        //nSolarArray.addMoon(a);

        Movement solar2 = new Movement(nSolar, theSun, earth, a);


        Movement solar22 = new Movement(nSolar, theSun, venus, null);


       while(true) {

            nSolar.finishedDrawing();

            solar1.movePlanet(earth);
            solar22.movePlanet(venus);
            solar2.moveMoon(a);
            solar1.moveMoon(earthMoon);

       }



        
        // Moon a = new Moon(nSolar, earth, 1, 4);
        // a.createMoon(225, 90, 9, "RED", 80, 3);

        // Movement solar2 = new Movement(nSolar, theSun, earth, a);
        // solar2.move(earth, a);

        
    
      
        
      

    }
}
