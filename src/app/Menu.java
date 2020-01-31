package app;

public class Menu {
    Helpers helpers = new Helpers();

    public void showMenu() {
        System.out.println("\033[0;37;49mMenu");
        System.out.println("Choose option");

        System.out.println("1. Play PvP");
        System.out.println("2. Play PvC");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. Exit program");
        
        helpers.emptyLinesThree();
    }
}