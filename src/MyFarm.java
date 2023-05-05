public class MyFarm {

    public static void main(String[] args) {
        MyFarm charlie = new MyFarm();



    }
    public Plot[][] grid;
    public MyFarm(){
        System.out.println("Hello from my farm!");
        Plot Ryan = new Plot();
        //Ryan.printPlot();

            grid = new Plot[3][3];
        for (int row = 0; row < grid.length; row++) {

            for (int col = 0; col < grid[row].length; col++) {

                grid[row][col]=new Plot();

                grid[row][col].printPlot();


            }


        }
          //totalPlants();
        //printPlantNames();
        //totalCarrots();
        //averageNumberOfPlants();
        //numberOfEmptyPlots();
        //everyOtherNeedsWater();
        plantWithMaxNumber();

    }

    public void printPlantNames() {
        for(int v = 0; v< grid.length; v++)
            for(int z = 0; z<grid[v].length; z++){
                System.out.println(grid[v][z].plantName + " in row "+v +" and column "+z);

                //System.out.println(sumOfPlants);
            }
    }

    public void totalPlants(){

        int sumOfPlants = 0;

        for(int e = 0; e< grid.length; e++)
            for(int c = 0; c<grid[e].length; c++){
                sumOfPlants += grid[e][c].numberOfplants;
            }
        System.out.println(sumOfPlants);


    }
    public void totalCarrots(){
        int sumOfCarrots = 0;
        for(int m = 0; m< grid.length; m++)
            for(int b = 0; b<grid[m].length; b++){
               if (grid[m][b].plantName.equals("carrots")){
                   sumOfCarrots= sumOfCarrots+grid[m][b].numberOfplants;
                }
            }
        System.out.println("There are " + sumOfCarrots+" carrot plants in the farm");








    }
    public void averageNumberOfPlants() {
        int numOfPlants = 0;
        int totalPlots = 0;
        for(int g = 0; g< grid.length; g++)
            for(int h = 0; h<grid[g].length; h++){
                numOfPlants += grid[g][h].numberOfplants;
                totalPlots = g*h;
            }

        System.out.println("The average number of plants per plot is "+numOfPlants/totalPlots);



    }
    public void numberOfEmptyPlots() {
        int emptyPlots = 0;
        for(int c = 0; c< grid.length; c++)
            for(int v = 0; v<grid[c].length; v++){
                if (grid[c][v].plantName.equals("empty")){
                    emptyPlots=emptyPlots+1;
                }
            }
        System.out.println("There are "+emptyPlots +" empty plots in the farm");


    }
    public void everyOtherNeedsWater(){
        int waterNum = 1;
        for(int t = 0; t< grid.length; t++)
            for(int y = 0; y<grid[t].length; y++){
                waterNum=waterNum*-1;
                if (waterNum==1){
                    grid[t][y].needsWater=true;

                }
                if (waterNum==-1){
                    grid[t][y].needsWater=false;
                }
                grid[t][y].printPlot();
            }



        // change the value of needsWater to be true for every other plot
        // print the value or needs water for all plots row by row

        //multiply waternum by -1 each time??
    }
    public void plantWithMaxNumber() {
        int maxPlants = 0;
        String maxPlantType = "start";
        for(int c = 0; c< grid.length; c++)
            for(int v = 0; v<grid[c].length; v++){
                if (grid[c][v].numberOfplants > maxPlants){
                    maxPlants = grid[c][v].numberOfplants;
                    maxPlantType=grid[c][v].plantName;

                }
            }
        System.out.println("The max plant count is "+maxPlants +" "+maxPlantType+" plant");

        // which plant type has the most total plants?
    }






}
