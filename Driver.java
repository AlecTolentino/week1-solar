public class Driver {
    
    public static void main(String[] arguments) {

        // INSTANCES

        SolarSystem nSolar = new SolarSystem(1100, 1100);

        Sun theSun = new Sun(nSolar, 0, 0, 122.5, "YELLOW");

        Planet mercury = new Planet(nSolar, theSun, 80, 90,10.5, "LIGHT_GRAY", 3.7);

        Planet venus = new Planet(nSolar, theSun, 100, 90,14, "ORANGE", 3.4);

        Planet earth = new Planet(nSolar, theSun, 140, 90, 24.5, "BLUE", 3.1);

        Moon earthMoon = new Moon(nSolar, earth, 140, 90, 6, "GRAY", 25, 3, 3.1, 30);

        Planet mars = new Planet(nSolar, theSun, 190, 90,12, "#ce890a", 2.8);

        Planet jupiter = new Planet(nSolar, theSun, 260, 90,35, "#e18909", 2.3);

        Moon io = new Moon(nSolar, jupiter, 260, 90, 6, "YELLOW", 23, 90, 2.3, 18);
        Moon europa = new Moon(nSolar, jupiter, 260, 90, 5, "BROWN", 28, 90, 2.3, 13);
        Moon ganymede = new Moon(nSolar, jupiter, 260, 90, 9, "GREY", 31, 90, 2.3, 8);
        Moon callisto = new Moon(nSolar, jupiter, 260, 90, 7, "GREEN", 40, 90, 2.3, 4);

        Planet saturn = new Planet(nSolar, theSun, 360, 90,49, "#fffda7", 2);

        Planet uranus = new Planet(nSolar, theSun, 490, 90, 30, "CYAN", 1.7);

        Planet neptune = new Planet(nSolar, theSun, 560, 90,33, "#2486db", 1.4);

        Asteroid rogue  = new Asteroid(nSolar, mars, 210, 90, 3, "GREY", 0.5, 0, 23, 0);

        Arrays newArray = new Arrays(nSolar, saturn, 0, 0, 0, "GREEN", 0, 0, 0, 0);


        Asteroid ring1 = new Asteroid(nSolar, saturn, 360, 90, 7, "#7c4104", 1, 40, 2, 200);
        Asteroid ring2 = new Asteroid(nSolar, saturn, 360, 90, 3, "WHITE", 1, 45, 2, 200);
        Asteroid ring3 = new Asteroid(nSolar, saturn, 360, 90, 5, "#fe9e3c", 1, 55, 2, 200);

       

        Comet one = new Comet(nSolar,neptune, 500, 30.2, 3, "RED", 1.2, 80, 20.5, 1.4);



       while(true) {

            nSolar.finishedDrawing();
        
            

            theSun.createSun();
            one.moveComet();
            mercury.moveObject();
            venus.moveObject();
            earth.moveObject();



            earthMoon.moveRotate();

            mars.moveObject();

            jupiter.moveObject();
            io.moveRotate();
            europa.moveRotate();
            ganymede.moveRotate();
            callisto.moveRotate();

            saturn.moveObject();
            uranus.moveObject();
            neptune.moveObject();

            newArray.addAsteroid(rogue);
            newArray.addRing(ring1, ring2, ring3);


       }



        

        
    
      
        
      

    }
}
