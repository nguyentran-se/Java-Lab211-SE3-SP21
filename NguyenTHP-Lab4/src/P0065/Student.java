package P0065;

/**
 *
 * @author Nguyen
 */
public class Student {
    private String name;
    private String classes;
    private double maths; 
    private double physics;
    private double chemistry; 
    private double average;
    private char type;

    public Student() {
    }

    public Student(String name, String classes, double maths, double physics, double chemistry, double average, char type) {
        this.name = name;
        this.classes = classes;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
        this.average = average;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", classes=" + classes + ", maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + ", average=" + average + ", type=" + type + '}';
    }
}
