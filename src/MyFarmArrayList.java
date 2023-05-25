import java.util.ArrayList;

public class MyFarmArrayList {


    public ArrayList<Plot> row = new ArrayList<Plot>();





    public MyFarmArrayList() {
        System.out.println("My farm using array lists");

            for (Plot a: row) {
                System.out.println(row.size());
                row.add(new Plot());
                a.printPlot();
            }



            for (int p = 0;p<11;p++){
                //System.out.println(row.size());
                row.add(new Plot());
                row.get(p).printPlot();

            }
//            row.remove(3);
//            System.out.println(row.size());



//

        //totalPlants();
        printPlantNames();
        //printRowInfo();
        addSunflower();
        addCorn();
        printPlantNames();
        //tomatoLocations();
        //totalCarrots();
        //averageNumberOfPlants();
       // numberOfCarrotPlots();
       // numberOfEmptyPlots();
        //printRowInfo();
        everyOtherNeedsWater();
       // printRowInfo();
        plantWithMaxNumber();


    }
    public void totalPlants() {
        // how many total plants are there in the row?
        int totalPlantCount = 0;
        for (Plot a:row){
            totalPlantCount+=a.numberOfplants;

        }
        System.out.println(totalPlantCount);

    }
    public void printPlantNames() {
        // print the name of each plant in the row and its index
        for (int k = 0; k<row.size();k++){
          System.out.println("Plot at "+k+" has "+ row.get(k).numberOfplants+" "+row.get(k).plantName+ " plants \t");
        }

    }
    public void printRowInfo() {
        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row
        for (Plot a:row){
            System.out.print("Plot at "+a+" has "+ a.numberOfplants+" "+a.plantName+ " plants and it is "+a.needsWater+" that it needs water\t");
        }
    }
    public void addSunflower() {
        // add a lettuce plot to the end of the row with 42 plants that need water
        // call printPlantNames() method before and after your addition to make sure it worked
        Plot sunflower = new Plot();
        sunflower.needsWater = true;
        sunflower.plantName="sunflower";
        sunflower.numberOfplants=42;

        row.add(sunflower);


    }
    public void addCorn() {
        // add a lettuce plot to the end of the row with 42 plants that need water
        // call printPlantNames() method before and after your addition to make sure it worked
        Plot corn = new Plot();
        corn.needsWater = false;
        corn.plantName="corn";
        corn.numberOfplants=70;

        row.add(3,corn);



    }
    public void tomatoLocations() {
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes
        for(int m=0;m<row.size();m++){
            if (row.get(m).plantName.equals("tomato"))
            {
           System.out.println("There is a tomato plot at index "+m+" that has "+row.get(m).numberOfplants+" plants");

            }

        }

        }
    public void totalCarrots() {
        // how many total carrot plants are there?
        int numCarrots = 0;

        for(Plot b:row){
            if (b.plantName.equals("carrots")){
                numCarrots+=b.numberOfplants;

            }

        }
        System.out.println("There are "+ numCarrots+" carrots");

    }
    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        int sumOfPlants = 0;
        int averageNum = 0;
        for(int m=0;m<row.size();m++){
            sumOfPlants+=row.get(m).numberOfplants;



        }
        averageNum=sumOfPlants/row.size();
        System.out.println("The average number of plants are "+averageNum+" plants");


    }
    public void numberOfCarrotPlots() {
        // how many plots have carrots on them
// call printPlantNames() method to check
        int numCarrots = 0;

        for(Plot b:row){
            if (b.plantName.equals("carrots")){
                numCarrots+=1;

            }

        }
        System.out.println("There are "+ numCarrots+" carrot plots");
    }
    public void numberOfEmptyPlots() {
        // how many plots are empty
// call printPlantNames() method to check
        int numEmpty = 0;

        for(Plot b:row){
            if (b.plantName.equals("empty")){
                numEmpty+=1;

            }

        }
        System.out.println("There are "+ numEmpty+" empty plots");
    }



    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot
        int everyOtherCounter = 1;

        for(Plot b:row){
            everyOtherCounter=everyOtherCounter*-1;
            if (everyOtherCounter==1){
                b.needsWater=true;


            }
            else {
                b.needsWater=false;
            }

        }

    }
    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        int mostPlant = 0;

        for(Plot b:row){
            if (b.numberOfplants>mostPlant){
                mostPlant= b.numberOfplants;

            }

        }
        System.out.println(mostPlant);
    }



}





















