package roughwork;

public class CalculateShapeSquare extends CalculateShapes{

    public CalculateShapeSquare(int length, int height) {
        super(length, height);
    }

    @Override
    public int areaOfShape(){
        return length*height*2;

    }

    @Override
    public double volumeOfShape(){
        return length*height*pie*0.1222;
    }

    public int perimeterOfShape(){
        return length*height*2;
    }
}
