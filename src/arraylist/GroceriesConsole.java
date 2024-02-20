package arraylist;
/*

    Section10
    List, ArrayList, LinkedList, Iterator, Autoboxing
    ArrayList Challenge Part1

    Create an interactive console program.
    user menu options as shown here:

    Available actions:
    0 - to shutdown
    1 - to add item(s) to list (comma delimited list)
    2 - to remove any items (comma delimited list)
    Enter a number for which action you want to do:

    Using the Scanner class, solicit a menu item 0, 1 or 2
    process the item accordingly.

    Your grocery list should be an ArrayList.
    You should use methods on the ArrayList, to add items, remove items,
    check if an item is already in the list, and print a sorted list.
    You shouldn't allow duplicate items in the list.

 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class GroceriesConsole {
    public static void main(String[] args) {
        /*
         * addItems() { checkItems() }
         * removeItems()
         * printItems()
         *
         * String -> split by , -> array
         * for loop array
         * insert into ArrayList
         * print ArrayList
         * */

        Scanner input = new Scanner(System.in);

        ArrayList<String> listItems = new ArrayList<>();

        while (true) {

            System.out.println("Available actions:");
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list (comma delimited list)");
            System.out.println("2 - to remove any items (comma delimited list)");
            System.out.println("Enter a number for which action you want to do:");

            String actionNumber = input.nextLine();

            switch (actionNumber) {
                case "0" -> {
                    System.out.println("exit");
                    return;
                }
                case "1" -> {
                    System.out.println("add item(s) to list (comma delimited list): ");
                    String addedItems = input.nextLine();
                    listItems = addItems(listItems, addedItems);
                    System.out.println(listItems);
                }
                case "2" -> {
                    System.out.println("remove any items (comma delimited list): ");
                    String removedItems = input.nextLine();
                    listItems = removeItems(listItems, removedItems);
                    System.out.println(listItems);
                }
                default -> {
                    System.out.println("Sorry wrong choice!");
                }
            }
        }
    }

    public static ArrayList<String> addItems(ArrayList<String> listItems, String addedItems) {
        addedItems = addedItems.replaceAll("\\s+","");
        String[] arrItems = addedItems.split(",");
        for (String arrItem : arrItems) {
            if (!listItems.contains(arrItem)) {
                listItems.add(arrItem);
            }
        }
        listItems.sort(Comparator.naturalOrder());
        return listItems;
    }

    public static ArrayList<String> removeItems(ArrayList<String> listItems, String removedItems) {
        removedItems = removedItems.replaceAll("\\s+","");
        String[] arrItems = removedItems.split(",");
        for (String arrItem : arrItems) {
            if (listItems.contains(arrItem)) {
                listItems.remove(arrItem);
            }
        }
        listItems.sort(Comparator.naturalOrder());
        return listItems;
    }


}
