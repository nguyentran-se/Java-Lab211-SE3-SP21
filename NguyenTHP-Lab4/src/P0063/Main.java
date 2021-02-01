package P0063;

public class Main {

    public static void main(String[] args) {
        try {
            HandlePerson handlePerson = new HandlePerson();
            handlePerson.inputThreePersons();
            Person[] persons = handlePerson.persons;
            handlePerson.sortBySalary(persons);
            handlePerson.functiondisplayPersonInfo(persons);
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
