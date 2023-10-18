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

        Planet jupiter = new Planet(nSolar, theSun, 280, 90,42, "#e18909", 2.3);

        Planet saturn = new Planet(nSolar, theSun, 360, 90,49, "#fffda7", 2);

        Planet uranus = new Planet(nSolar, theSun, 440, 90, 30, "CYAN", 1.7);

        Planet neptune = new Planet(nSolar, theSun, 510, 90,35, "#2486db", 1.4);

        Asteroid rogue  = new Asteroid(nSolar, theSun, 235, 90, 3, "GREY", 2.6);

        Comet one = new Comet(nSolar,neptune, 500, 30.2, 3, "RED", 1.2, 80, 20.5, 1.4);




       while(true) {

            nSolar.finishedDrawing();
        
            

            theSun.createSun();
            one.moveComet();
            mercury.moveObject();
            venus.moveObject();
            earth.moveObject();

            rogue.moveObject();

            earthMoon.moveRotate();

            mars.moveObject();
            jupiter.moveObject();
            saturn.moveObject();
            uranus.moveObject();
            neptune.moveObject();



       }



        

        
    
      
        
      

    }
}
