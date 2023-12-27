package encapsulation.challenge;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50, 10, true);
        System.out.printf("Initial page count = %d %n", printer.getPagesPrinted());
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", printer.getPagesPrinted(), printer.getPagesPrinted());
        System.out.println(printer);

        Printer printer2 = new Printer(50, true);
        int printPages = printer2.printPages(5);
        System.out.printf("Initial page count = %d %n", printer2.getPagesPrinted());
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", printPages, printer2.getPagesPrinted());
        System.out.println(printer2);

        Printer printer3 = new Printer(50, false);
        printPages = printer3.printPages(5);
        System.out.printf("Initial page count = %d %n", printer3.getPagesPrinted());
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", printPages, printer3.getPagesPrinted());
        System.out.println(printer3);

        printPages = printer3.printPages(100);
        System.out.printf("Initial page count = %d %n", printer3.getPagesPrinted());
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", printPages, printer3.getPagesPrinted());
        System.out.println(printer3);
    }

}
