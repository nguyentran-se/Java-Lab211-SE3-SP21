package P0081;

public abstract class Bee {

    protected String name;
    protected float health = 100;
    protected boolean isDead = false;

    public Bee() {
    }

    public Bee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public boolean isIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    public void dammage(float d) {
        this.setHealth(this.getHealth() - d);
    }

    @Override
    public String toString() {
        if (isDead) {
            return this.name + " | " + String.format("%.2f",this.health ) + " | " + "Dead";
        } else {
            return this.name + " | " + String.format("%.2f",this.health ) + " | " + "Alive";
        }
    }

    public abstract void checkDead();

}
