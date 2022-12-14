package Java_test.Task_1.Task_2;

public class Ball {
    private double x;
    private double y;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){
        x = 0.0;
        y = 0.0;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString(){
        String information = "Ball @(" + x + "," + y + ")";
        return information;
    }
}