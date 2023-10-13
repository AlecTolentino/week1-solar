public class Driver {
    
    public static void main(String[] arguments) {

        // INSTANCES

        SolarSystem nSolar = new SolarSystem(1100, 1100);

        Sun theSun = new Sun(nSolar);

       // Arrays nSolarArray = new Arrays(nSolar, theSun);

        theSun.createSun(0, 0, 122.5, "YELLOW");
        

        //nSolarArray.addMoon(earthMoon);

        Movement solar1 = new Movement(nSolar, theSun/* , earth, earthMoon, nSolarArray*/);

       //a.createMoon(225, 90, 9, "RED", 80, 240);

        Planet mercury = new Planet(nSolar, theSun, 3.7);
        mercury.createPlanet(80, 90,10.5, "LIGHT_GRAY");

        Planet venus = new Planet(nSolar, theSun, 3.4);
        venus.createPlanet(100, 90,14, "ORANGE");


        Planet earth = new Planet(nSolar, theSun, 3.1);
        earth.createPlanet(140, 90, 24.5, "BLUE");

        Moon earthMoon = new Moon(nSolar, earth, 3.1, 10);
        earthMoon.createMoon(140, 90, 6, "GRAY", 25, 3);


        Planet mars = new Planet(nSolar, theSun, 2.8);
        mars.createPlanet(190, 90,12, "#ce890a");

        Planet jupiter = new Planet(nSolar, theSun, 2.3);
        jupiter.createPlanet(280, 90,42, "#e18909");

        Planet saturn = new Planet(nSolar, theSun, 2);
        saturn.createPlanet(360, 90,49, "#fffda7");

        Planet uranus = new Planet(nSolar, theSun, 1.7);
        uranus.createPlanet(440, 90, 30, "CYAN");

        Planet neptune = new Planet(nSolar, theSun, 1.4);
        neptune.createPlanet(510, 90,35, "#2486db");

        Moon a = new Moon(nSolar, earth, 3, 5);


        //nSolarArray.addMoon(a);

        //Movement solar2 = new Movement(nSolar, theSun/* , earth, a*/);


        //Movement solar22 = new Movement(nSolar, theSun/*, venus, null*/);


       while(true) {

            nSolar.finishedDrawing();

            solar1.movePlanet(earth);
            solar1.moveMoon(earthMoon);

            solar1.movePlanet(mercury);

            solar1.movePlanet(venus);

            solar1.movePlanet(mars);

            solar1.movePlanet(jupiter);

            solar1.movePlanet(saturn);

            solar1.movePlanet(uranus);

            solar1.movePlanet(neptune);
            //solar1.moveMoon(a);


       }



        
        // Moon a = new Moon(nSolar, earth, 1, 4);
        // a.createMoon(225, 90, 9, "RED", 80, 3);

        // Movement solar2 = new Movement(nSolar, theSun, earth, a);
        // solar2.move(earth, a);

        
    
      
        
      

    }
}
