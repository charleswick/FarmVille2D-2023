public class MyFarm {
    public static void main(String[] args) {
        MyFarm charlie = new MyFarm();



    }
    public MyFarm(){
        System.out.println("Hello from my farm!");
        Plot Ryan = new Plot();
        //Ryan.printPlot();

            Plot [][] grid = new Plot[10][1];
        for (int i = 0; i < grid.length; i++) {

            for (int p = 0; p < grid[i].length; p++) {

                grid[i][p]=new Plot();

                grid[i][p].printPlot();
            }
        }



    }

}
