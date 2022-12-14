package Prac_7.task1_3;

public class MovablePoint implements Movable{
    int x;
    int y;
    int Speed;

    int GetSpeed(){return this.Speed;}

    public MovablePoint(int x, int y, int Speed) {
        this.x = x;
        this.y = y;
        this.Speed = Speed;
    }

    @Override
    public void moveLeft(int x) {
        this.x-=x*this.Speed;
    }

    @Override
    public void moveRight(int x) {
        this.x+=x*this.Speed;
    }

    @Override
    public void moveUp(int y) {
        this.y+=y*this.Speed;
    }

    @Override
    public void moveDown(int y) {
        this.y-=y*this.Speed;
    }

    @Override
    public String toString() {
        return  "x = "+x+" y = " + y;
    }
}
