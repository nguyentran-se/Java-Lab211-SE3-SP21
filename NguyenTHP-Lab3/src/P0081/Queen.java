package P0081;

public class Queen extends Bee {

    public Queen() {
    }

    public Queen(String name) {
        super(name);
    }

    public void checkDead() {
        if(this.health < 20) setIsDead(true);
    }
}
