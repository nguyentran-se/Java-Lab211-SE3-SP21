package P0068;

public class Main {
    public static void main(String[] args) {
        HandleStudent handleStudent = new HandleStudent();
        System.out.println("====== Collection Sort Program ======");
        handleStudent.inputStudent();
        handleStudent.sortStudent();
        handleStudent.display();
    }
}
