public class Dice {

    private int Max = 6; //terning får 6 sider
    private int facevalue;

    public Dice(int value, int facevalue){
        facevalue = value;

    }

    public Dice (){

    }
    //kast terningen og vis værdien
    public int roll()
    {
        //+1 for at terningen viser 6
        facevalue = (int)(Math.random()*Max)+ 1;

        return facevalue;

    }

    //hent værdien
    public int getFacevalue (){
        return facevalue;

    }
    //retunerer en streng repræsentation og objekts data

    public String toString(){
        String result = "values" + facevalue;
        return result;
    }

}
