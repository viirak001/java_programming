package Method_Intro;

import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class testAi {
    /*
        private static String[][] hall; // Hall array
        private static int rowNumber, columnNumber; // Row and column counts

        // Method to display the menu
        public static void menu() {
            System.out.print("""
                👉 List Option as below :
                    1. Set up Hall.
                    2. Start Booking.
                    3. Cancel booked Seat.
                    4. View History.
                    5. Exit.
                """);
        }

        // Method to handle user input for selecting an option
        public static void callingOption() {
            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("-".repeat(30));
                System.out.print("👉 Input List Option: ");
                int option = input.nextInt();
                input.nextLine(); // Consume newline

                switch (option) {
                    case 1 -> setup();
                    case 2 -> booking(input);
                    case 3 -> cancelBooking(input);
                    case 4 -> viewHistory();
                    case 5 -> {
                        System.out.println("        >> Exit <<");
                        System.exit(0);
                    }
                    default -> System.out.println("⚠ Invalid option! Please try again.");
                }
            }
        }

        // Method to set up the hall
        public static void setup() {
            Scanner input = new Scanner(System.in);
            System.out.print("Insert Row: ");
            rowNumber = input.nextInt();
            System.out.print("Insert Column: ");
            columnNumber = input.nextInt();
            input.nextLine(); // Consume newline

            hall = new String[rowNumber][columnNumber];

            // Initialize seats with labels
            char rowLabel = 'A';
            for (int i = 0; i < rowNumber; i++) {
                for (int j = 0; j < columnNumber; j++) {
                    hall[i][j] = rowLabel + String.valueOf(j + 1) + "A"; // "A1A" (A = Available)
                }
                rowLabel++;
            }

            // Display the hall layout
            displayHall();
        }

        // Method to display the hall layout
        public static void displayHall() {
            if (hall == null) {
                System.out.println("⚠ Please set up the hall first (Option 1).");
                return;
            }

            System.out.println("Current Hall Layout:");
            for (String[] row : hall) {
                for (String seat : row) {
                    System.out.print("| " + seat + " ");
                }
                System.out.println("|");
            }
        }

        // Method to book a seat
        public static void booking(Scanner input) {
            if (hall == null) {
                System.out.println("⚠ Please set up the hall first (Option 1).");
                return;
            }

            System.out.print("Enter your name for booking: ");
            String name = input.nextLine();

            System.out.print("Enter seat (e.g., A1): ");
            String seat = input.nextLine().toUpperCase();

            boolean booked = false;
            for (int i = 0; i < rowNumber; i++) {
                for (int j = 0; j < columnNumber; j++) {
                    if (hall[i][j].equals(seat + "A")) { // Check if seat is available
                        hall[i][j] = seat + "B"; // Mark as booked (B = Booked)
                        booked = true;
                        System.out.println("✅ " + name + " successfully booked seat " + seat);
                        break;
                    }
                }
                if (booked) break;
            }

            if (!booked) {
                System.out.println("⚠ Seat not available or invalid input.");
            }

            displayHall();
        }

        // Method to cancel a booking
        public static void cancelBooking(Scanner input) {
            if (hall == null) {
                System.out.println("⚠ Please set up the hall first (Option 1).");
                return;
            }

            System.out.print("Enter seat to cancel booking (e.g., A1): ");
            String seatToCancel = input.nextLine().toUpperCase();

            boolean canceled = false;
            for (int i = 0; i < rowNumber; i++) {
                for (int j = 0; j < columnNumber; j++) {
                    if (hall[i][j].equals(seatToCancel + "B")) { // Check if seat is booked
                        hall[i][j] = seatToCancel + "A"; // Mark as available
                        canceled = true;
                        System.out.println("✅ Booking for seat " + seatToCancel + " has been canceled.");
                        break;
                    }
                }
                if (canceled) break;
            }

            if (!canceled) {
                System.out.println("⚠ No booking found for seat " + seatToCancel);
            }

            displayHall();
        }

        // Method to view booking history (displays booked seats)
        public static void viewHistory() {
            if (hall == null) {
                System.out.println("⚠ Please set up the hall first (Option 1).");
                return;
            }

            System.out.println("Booked Seats History:");
            boolean found = false;
            for (String[] row : hall) {
                for (String seat : row) {
                    if (seat.endsWith("B")) { // If seat is booked
                        System.out.print(seat + " ");
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("⚠ No bookings found.");
            } else {
                System.out.println();
            }
        }

        // Method to wait for user input to continue
        public static void pressKey() {
            System.out.print(">>> Press any key to continue <<<");
            new Scanner(System.in).nextLine();
        }

        // Main method
        public static void main(String[] args) {
            menu();
            callingOption();
            pressKey();
        }

     */





        public static String[][] hall;
        public static int rowNumber;
        public static int columnNumber;
        public static StringBuilder bookingHistory = new StringBuilder();

        public static void menu() {
            System.out.println("""
                👉 List Option as below :
                    1. Set up Hall.
                    2. Start Booking.
                    3. Cancel booked Seat.
                    4. View History.
                    5. Exit.
                """);
        }

        public static void callingOption() {
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("-".repeat(30));
                System.out.print("👉 Input List Option: ");
                int option = input.nextInt();
                switch (option) {
                    case 1 -> setup();
                    case 2 -> booking();
                    case 3 -> cancelBooking();
                    case 4 -> viewHistory();
                    case 5 -> {
                        System.out.println("        >> Good 👊👊👊 Bye <<");
                        System.exit(0);
                    }
                    default -> System.out.println(" 😤 Option Invalid 😒😒😒 >> Please try again <<");
                }
                pressKey();
            }
        }

        public static void setup() {
            Scanner input = new Scanner(System.in);
            System.out.print(" 👉 Insert Row: ");
            rowNumber = input.nextInt();
            System.out.print(" 👉 Insert Column: ");
            columnNumber = input.nextInt();
            hall = new String[rowNumber][columnNumber];
            char names = 'A';
            for (int i = 0; i < hall.length; i++) {
                for (int j = 0; j < hall[i].length; j++) {
                    hall[i][j] = names + "-" + (j + 1) + " : ST"; // Default: ST (Seat Available)
                }
                names++;
            }
            designDisplay();
        }

        public static void designDisplay() {
            for (String[] row : hall) {
                for (String seat : row) {
                    System.out.print("| " + seat + " | ");
                }
                System.out.println();
            }
        }

        public static void booking() {
            Scanner input = new Scanner(System.in);
            System.out.print(" 👉 Enter seat code to book (e.g., A-1): ");
            String seatCode = input.nextLine().toUpperCase().trim();
            boolean found = false;

            for (int i = 0; i < hall.length; i++) {
                for (int j = 0; j < hall[i].length; j++) {
                    if (hall[i][j].startsWith(seatCode)) {
                        found = true;
                        if (hall[i][j].endsWith("BK")) {
                            System.out.println(" 🙄 This seat has already been booked! Try another.");
                            return;
                        }
                        hall[i][j] = seatCode + " : BK";
                        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                        bookingHistory.append("Booked: ").append(seatCode).append(" at ").append(timestamp).append("\n");
                        System.out.println(" ✅ Seat " + seatCode + " booked successfully!");
                    }
                }
            }
            if (!found) {
                System.out.println(" 😑 Seat not found! Please check and try again.");
            }
            designDisplay();
        }

        public static void cancelBooking() {
            Scanner input = new Scanner(System.in);
            System.out.print(" 👉 Enter seat code to cancel (e.g., A-1): ");
            String seatCode = input.nextLine().toUpperCase().trim();
            boolean found = false;

            for (int i = 0; i < hall.length; i++) {
                for (int j = 0; j < hall[i].length; j++) {
                    if (hall[i][j].startsWith(seatCode)) {
                        found = true;
                        if (!hall[i][j].endsWith("BK")) {
                            System.out.println(" 🙄 This seat is not booked yet!");
                            return;
                        }
                        hall[i][j] = seatCode + " : ST";
                        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                        bookingHistory.append("Canceled: ").append(seatCode).append(" at ").append(timestamp).append("\n");
                        System.out.println(" ✅ Seat " + seatCode + " booking has been canceled.");
                    }
                }
            }
            if (!found) {
                System.out.println(" 😑 Seat not found! Please check and try again.");
            }
            designDisplay();
        }

        public static void viewHistory() {
            System.out.println(" 👉 Booking & Cancellation History:");
            if (bookingHistory.length() == 0) {
                System.out.println(" 🤦‍♀️ No booking history found.");
            } else {
                System.out.println(bookingHistory);
            }
        }

        public static void pressKey() {
            System.out.print(" 👉 >>> Press Enter to continue <<<");
            new Scanner(System.in).nextLine();
        }

        public static void main(String[] args) {
            menu();
            callingOption();
        }
}
