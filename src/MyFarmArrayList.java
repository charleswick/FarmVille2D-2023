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








}
