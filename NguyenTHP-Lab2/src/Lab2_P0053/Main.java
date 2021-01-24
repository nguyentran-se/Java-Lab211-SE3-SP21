
package Lab2_P0053;

public class Main {
    public static void main(String[] args) {
        HandleBubbleSort handleBubbleSort = new HandleBubbleSort();
        int[] arr = null;
        while(true){
            int choice = handleBubbleSort.menu();
            switch (choice) {
                case 1:
                    arr = handleBubbleSort.inputElements();
                    break;
                case 2:
                    if(arr != null) handleBubbleSort.sortAscending(arr);
                    else System.out.println("Please input value before sorting!\n");
                    break;
                case 3:
                    if(arr != null) handleBubbleSort.sortDescending(arr);
                    else System.out.println("Please input value before sorting!\n");
                    break;
                default:
                    return;
            }
        }   
    }
}
