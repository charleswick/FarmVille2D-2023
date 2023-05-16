import java.util.ArrayList;

public class MyFarmArrayList {


    public ArrayList<Plot> row = new ArrayList<Plot>();





    public MyFarmArrayList() {
        System.out.println("My farm using array lists");
        for (int x = 0; x < 10; x++) {
            for (int p = 0; p < 10; p++) {
                System.out.println(row.size());
                row.add(new Plot());
                row.get(p).printPlot();
            }
            row.remove(3);
        }


    }

}
