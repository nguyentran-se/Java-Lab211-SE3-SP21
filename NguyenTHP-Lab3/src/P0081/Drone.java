package P0081;

public class Drone extends Bee{

    public Drone() {
    }

    public Drone(String name) {
        super(name);
    }

    

    @Override
    public void checkDead() {
        if(this.health < 50) setIsDead(true);
    }
}
