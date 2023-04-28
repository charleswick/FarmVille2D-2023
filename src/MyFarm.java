public class MyFarm {

    public static void main(String[] args) {
        MyFarm charlie = new MyFarm();



    }
    public Plot[][] grid;
    public MyFarm(){
        System.out.println("Hello from my farm!");
        Plot Ryan = new Plot();
        //Ryan.printPlot();

            grid = new Plot[10][1];
        for (int row = 0; row < grid.length; row++) {

            for (int col = 0; col < grid[row].length; col++) {

                grid[row][col]=new Plot();

                grid[row][col].printPlot();
                grid[row][col].totalPlants();

            }


        }


    }


}
