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



            for (int p = 0;p<10;p++){
                //System.out.println(row.size());
                row.add(new Plot());
                row.get(p).printPlot();

            }
//            row.remove(3);
//            System.out.println(row.size());



//

        //totalPlants();
        //printPlantNames();
        //printRowInfo();
        addLettuce();

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
        for (Plot a:row){
          System.out.println("Plot at "+a+" has "+ a.numberOfplants+" plants");
        }

    }
    public void printRowInfo() {
        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row
        for (Plot a:row){
            System.out.println("Plot at "+a+" has "+ a.numberOfplants+" "+a.plantName+ " plants and it is "+a.needsWater+" that it needs water");
        }
    }
    public void addLettuce() {
        // add a lettuce plot to the end of the row with 42 plants that need water
        // call printPlantNames() method before and after your addition to make sure it worked

    }








}
