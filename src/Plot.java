public class Plot {
    public String plantName;
    public int numberOfplants;
    public boolean needsWater;

    public Plot(){
        //plantName = "basil";
        needsWater = true;
        numberOfplants = (int)(Math.random()*100)+10;
        int num = (int)(Math.random()*5);
        if(num ==0){
            plantName = "sunflower";
        }
        if (num ==1){
            plantName = "corn";
        }
        if (num ==2){
            plantName = "carrots";
        }
        if (num ==3){
            plantName = "tomato";
        }
        if (num ==4){
            plantName = "empty";
        }

    }
    public void printPlot(){
        System.out.println("There is a "+plantName+" plant in the plot that has "+numberOfplants + " plants and is "+needsWater +" that it needs water.");
    }

}

