public class Hero {
    private String icon = "# ";
    private int x=1;
    private int y=1;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public String getIcon(){
        return icon;
    }
    public void heroUp(){
        y--;
    }
    public void heroLeft(){
        x--;
    }
    public void heroDown(){
        y++;
    }
    public void heroRight(){
        x++;
    }
}
