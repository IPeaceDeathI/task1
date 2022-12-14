package Prac_7.task1_3;

public class MovableRectangle implements Movable{

    MovablePoint bottomRight;
    MovablePoint topLeft;

    public MovableRectangle(MovablePoint bottomRight, MovablePoint topLeft) {
        this.bottomRight = bottomRight;
        this.topLeft = topLeft;
    }

    public boolean SpeedTest(MovablePoint x, MovablePoint y){
        if(x.GetSpeed() == y.GetSpeed()) return true;
        else return false;
    }

    @Override
    public void moveLeft(int x) {
        bottomRight.moveLeft(x);
        topLeft.moveLeft(x);
    }

    @Override
    public void moveRight(int x) {
        bottomRight.moveRight(x);
        topLeft.moveRight(x);
    }

    @Override
    public void moveUp(int y) {
        topLeft.moveUp(y);
        bottomRight.moveUp(y);
    }

    @Override
    public void moveDown(int y) {
        topLeft.moveDown(y);
        bottomRight.moveDown(y);
    }

    @Override
    public String toString() {
        return "MovableRectangle:\n" +
                "top left: " + topLeft +
                "\nbottom right: " + bottomRight;
    }
}
