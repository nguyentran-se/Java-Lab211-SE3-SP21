package P0081;

public class Worker extends Bee {

    public Worker() {
    }

    public Worker(String name) {
        super(name);
    }
    
    public void checkDead() {
        if(this.health < 70) setIsDead(true);
    }
}
