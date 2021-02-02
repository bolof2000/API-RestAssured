package roughwork;

public class CalculateShapes {

    public int length;
    public int height;
    public  static double pie = 3.142;
    public CalculateShapes(int length,int height){
        this.height = height;
        this.length = length;

    }
    public int areaOfShape(){
        return length*height;

    }

    public double volumeOfShape(){
        return length*height*pie;
    }

    public int perimeterOfShape(){
        return length*height*2;
    }

}
