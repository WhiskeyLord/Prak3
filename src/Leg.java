public class Leg {
    private boolean isRight;
    private double size;
    Leg(boolean isRight, double size){
        this.isRight = isRight;
        this.size = size;
    }
    public void CheckLeg(){
        if (size>10){
            if(isRight){
                System.out.println("Правая нога длинная");
            }
            else{
                System.out.println("Левая нога длинная");
            }
        }
        else {
            System.out.println("Обычная нога");
        }
    }
}
