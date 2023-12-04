package New4;

public class Human{
    private String head;
    private String leg;
    private String hand;
    public Human(String h, String l, String ha){
        head = h;
        leg = l;
        hand = ha;

    }
    public String getHead(){
        return head;
    }
    public String getLeg(){
        return leg;
    }
    public String getHand(){
        return hand;
    }
    public void setHead(String h){
        head = h;
    }
    public void setHand(String ha){
        hand = ha;
    }
    public void setLeg(String l){
        leg = l;
    }
}