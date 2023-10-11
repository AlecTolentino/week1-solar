public class Driver {
    
    public static void main(String[] arguments) {

        // INSTANCES

        SolarSystem nSolar = new SolarSystem(1000, 1000);

        Sun theSun = new Sun(nSolar);
        theSun.createSun(0, 0, 175, "YELLOW");
        
        Planet one = new Planet(nSolar, theSun, 1);
        one.createPlanet(225, 90, 35, "BLUE");

        Movement solar1 = new Movement(nSolar, theSun, one /*,null*/);
      
        solar1.movePlanet(one);

        
    
      
        
      

    }
}
