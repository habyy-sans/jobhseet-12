import java.util.Scanner;

public class CinemaWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];
        int choice;
        do {
            System.out.println("\n--- Cinema Menu ---");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    int row, column;
                    while (true) {
                        System.out.print("Enter row number (1-4): ");
                        row = sc.nextInt() - 1; 
                        System.out.print("Enter column number (1-2): ");
                        column = sc.nextInt() - 1;
                        if (row >= 0 && row < 4 && column >= 0 && column < 2) {
                            if (audience[row][column] == null) {
                                audience[row][column] = name;
                                System.out.println("Data added successfully.");
                                break;
                            } else {
                                System.out.println("Seat already occupied! Try another seat.");
                            }
                        } else {
                            System.out.println("Invalid row or column number!");
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n--- Audience List ---");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print((audience[i][j] == null ? "***" : audience[i][j]) + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
    }
}
