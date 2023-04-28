public class MyFarm {

    public static void main(String[] args) {
        MyFarm charlie = new MyFarm();



    }
    public Plot[][] grid;
    public MyFarm(){
        System.out.println("Hello from my farm!");
        Plot Ryan = new Plot();
        //Ryan.printPlot();

            grid = new Plot[10][10];
        for (int row = 0; row < grid.length; row++) {

            for (int col = 0; col < grid[row].length; col++) {

                grid[row][col]=new Plot();

                grid[row][col].printPlot();


            }


        }
          totalPlants();
        printPlantNames();

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
                //System.out.println(sumOfPlants);
            }
        System.out.println(sumOfPlants);


    }


}
