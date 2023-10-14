public class Driver {
    
    public static void main(String[] arguments) {

        // INSTANCES

        SolarSystem nSolar = new SolarSystem(1100, 1100);

        Sun theSun = new Sun(nSolar, 0, 0, 122.5, "YELLOW");

        SolarObject mercury = new SolarObject(nSolar,/*  theSun*/, 80, 90,10.5, "LIGHT_GRAY", 3.7);

        SolarObject venus = new SolarObject(nSolar, 100, 90,14, "ORANGE", 3.4);


        SolarObject earth = new SolarObject(nSolar, 140, 90, 24.5, "BLUE", 3.1);

       // SolarObject earthMoon = new SolarObject(nSolar, earth, 140, 90, 6, "GRAY", 25, 3, 3.1, 30);
       // Problems with inheritance, in their code they left a value out when creating an instance, I do it it doesn't work

        SolarObject mars = new SolarObject(nSolar, 190, 90,12, "#ce890a", 2.8);

        SolarObject jupiter = new SolarObject(nSolar, 280, 90,42, "#e18909", 2.3);

        SolarObject saturn = new SolarObject(nSolar, 360, 90,49, "#fffda7", 2);

        SolarObject uranus = new SolarObject(nSolar, 440, 90, 30, "CYAN", 1.7);

        SolarObject neptune = new SolarObject(nSolar, 510, 90,35, "#2486db", 1.4);




       while(true) {

            nSolar.finishedDrawing();
            

            theSun.createSun();
            mercury.moveObject();
            venus.moveObject();
            earth.moveObject();
            //earthMoon.moveMoon();
            mars.moveObject();
            jupiter.moveObject();
            saturn.moveObject();
            uranus.moveObject();
            neptune.moveObject();




       }



        

        
    
      
        
      

    }
}
