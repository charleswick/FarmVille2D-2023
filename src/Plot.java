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

    }

}

