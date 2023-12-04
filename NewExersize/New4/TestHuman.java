package New4;

class TestHuman{
    public static void main(String[] arg){
        Human h = new Human("Голова", "Нога","Рука");
        h.setHand("ЛеваяРУка");
        System.out.println("Новая рука: " + h.getHand() );
    }
}
