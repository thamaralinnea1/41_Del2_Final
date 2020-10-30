import java.util.Random;

public class Dice1 {

    //her laver vi en a variabel
    private int facevalue ;

    // her laver vi a construktor
    public Dice1(){
        this.facevalue=6;
    }
    //her er en anden construktor
    public Dice1(int s){
        if(s>1)
            this.facevalue=s;
    }


    public int getFacevalue(){
        return facevalue;
    }
    // her laver vi en method/ funktion som har et opgave at rolle terning og viser den numberofside
    public int rolle(){

        Random rand= new Random(); // den her hadder en objekt
        return 1+rand.nextInt((facevalue));
    }
    }

