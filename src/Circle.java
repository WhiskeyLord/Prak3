public class Circle {
    private float size;
    private String color;
    public void SetParameters(float size, String color){
        this.size = size;
        this.color = color;
    }
    public String GetInfo(){
        return("size: "+ size+ " color: "+ color);
    }
}
