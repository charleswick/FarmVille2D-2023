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

        totalPlants();

    }
    public void totalPlants() {
        // how many total plants are there in the row?
        int totalPlantCount = 0;
        for (Plot a:row){
            totalPlantCount+=a.numberOfplants;

        }
        System.out.println(totalPlantCount);

    }



}
