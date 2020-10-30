public class Squares {
    private String description;
    private int value;
    private Boolean bonusturn;

    public Squares (String description, int value, Boolean bonusturn){
        this.description = description;
        this.value = value;
        this.bonusturn = bonusturn;

    }
    public String getDescription(){
        return description;

    }
    public int getValue(){
        return value;

    }
    public Boolean getBonusturn(){
        return bonusturn;
    }
}
