public class Main {
    public static void main(String[] args) {
        TwoWayLinkedList<Integer> list = new TwoWayLinkedList<>();
        
        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Print the elements of the list
        System.out.println("List elements:");
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
