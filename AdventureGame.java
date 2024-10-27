
import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int score = 0;

        int choice1 = 0;
        int choice2 = 0;
        int choice3 = 0;
        int choice4 = 0;
        int choice5 = 0;
        int choice6 = 0;
        int choice7 = 0;
        int choice8 = 0;

        boolean hasTV = false;
        boolean hasLaptop = false;
        boolean hasHeadphones = false;
        boolean hasPhone = false;

        // Welcome Message
        System.out.println("Welcome to the Best Buy Adventure Game!");
        System.out.println("Your goal is to navigate through the store, collect items, and score points.");

        // Entrance
        System.out.println("\nYou enter Best Buy and see two sections ahead of you.");
        System.out.println("Do you go to the (1) Electronics or (2) Customer Service?");
        choice1 = scanner.nextInt();

        // Electronics Section
        if (choice1 == 1) {
            System.out.println("\nYou head to the Electronics section and see a TV display.");
            System.out.println("Do you (1) pick up a TV or (2) walk past it?");
            choice2 = scanner.nextInt();

            if (choice2 == 1) {
                System.out.println("You pick up a TV! +40 points.");
                score += 40;
                hasTV = true;
            } else {
                System.out.println("You decided not to pick up the TV.");
            }

            // Salesperson
            System.out.println("\nA salesperson approaches and insists on showing you high-end laptops.");
            System.out.println("Do you (1) listen politely or (2) tell them you’re not interested?");
            choice3 = scanner.nextInt();

            if (choice3 == 1) {
                System.out.println("They talk for 20 minutes, and you feel frustrated. -20 points.");
                score -= 20;
            } else {
                System.out.println("They leave, and you save time. No change in points.");
            }

            // Laptop Aisle
            System.out.println("\nYou see the laptop aisle next.");
            System.out.println("Do you (1) pick up a laptop or (2) skip it?");
            choice4 = scanner.nextInt();

            if (choice4 == 1) {
                System.out.println("You pick up a laptop! +35 points.");
                score += 35;
                hasLaptop = true;
            } else {
                System.out.println("You skip the laptop aisle.");
            }

        // Customer Service 
        } else {
            System.out.println("\nYou approach the Customer Service desk.");
            System.out.println("The associate offers you a free phone case.");
            System.out.println("Do you (1) accept the case or (2) decline?");
            choice5 = scanner.nextInt();

            if (choice5 == 1) {
                System.out.println("You accepted the free phone case! +10 points.");
                score += 10;
                hasPhone = true;
            } else {
                System.out.println("You decline the phone case.");
            }

            // Security 
            System.out.println("\nA security guard notices you lingering and asks to see your bag.");
            System.out.println("Do you (1) cooperate or (2) argue?");
            choice6 = scanner.nextInt();

            if (choice6 == 1) {
                System.out.println("They check your bag and let you go. No points lost.");
            } else {
                System.out.println("The guard decides to report you for suspicious behavior. -30 points.");
                score -= 30;
            }

            // Headphones Aisle
            System.out.println("\nYou see the headphones aisle next.");
            System.out.println("Do you (1) pick up a pair of headphones or (2) skip it?");
            choice7 = scanner.nextInt();

            if (choice7 == 1) {
                System.out.println("You pick up a pair of headphones! +30 points.");
                score += 30;
                hasHeadphones = true;
            } else {
                System.out.println("You skip the headphones aisle.");
            }
        }

        // :o ROBBERY??
        System.out.println("\nAs you continue shopping, you feel a tap on your shoulder.");
        System.out.println("It’s a stranger. Do you (1) ignore them or (2) confront them?");
        choice8 = scanner.nextInt();

        if (choice8 == 2) {
            System.out.println("The stranger distracts you and manages to swipe an item from your cart!");
            int robbedItem = (int)(Math.random() * 4); 

            if (robbedItem == 0) {
                if (hasTV) {
                    System.out.println("They stole your TV! -40 points.");
                    score -= 40;
                    hasTV = false;
                } else {
                    System.out.println("Luckily, they couldn’t find anything valuable.");
                }
            } else if (robbedItem == 1) {
                if (hasLaptop) {
                    System.out.println("They stole your laptop! -35 points.");
                    score -= 35;
                    hasLaptop = false;
                } else {
                    System.out.println("Luckily, they couldn’t find anything valuable.");
                }
            } else if (robbedItem == 2) {
                if (hasHeadphones) {
                    System.out.println("They stole your headphones! -30 points.");
                    score -= 30;
                    hasHeadphones = false;
                } else {
                    System.out.println("Luckily, they couldn’t find anything valuable.");
                }
            }
        } else {
            System.out.println("You ignore the stranger, and they walk away.");
        }

        // Surprise Inspection
        System.out.println("\nAs you head towards the checkout, you’re stopped by a store manager for a surprise inspection.");
        int inspection =  (int)(Math.random() * 2); 
        if (inspection == 0) {
            System.out.println("The manager is pleased with your shopping choices. +10 points.");
            score += 35;
        } else {
            System.out.println("The manager finds a misplaced item in your cart. -10 points.");
            score -= 35;
        }

        scanner.close();

        // Checkout
        System.out.println("\nYou approach the checkout counter.");
        if (hasTV) {
            score += 15;
        }
        if (hasLaptop) {
            score += 15;
        }
        if (hasHeadphones) {
            score += 15;
        }
        if (hasPhone) {
            score += 15;
        }

        System.out.println("Checking out...");        
        System.out.println("Your final score: " + score);

        // Outcome

        // Secret Ending
        if ((choice1 == 2) && (choice5 == 2) && (choice6 == 2) && (choice7 == 2) && (choice8 == 2)) {
            System.out.println("YOU ONLY PRESSED 2s! PUT IN SOME MORE EFFORT!");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢻⡖⠚⢿⣛⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣹⣎⢆⠻⣷⡻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⣟⠿⣿⣿⣏⢧⢻⣷⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠺⣥⣽⣬⢦⠛⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⠤⠖⠚⠛⠋⠉⣝⠉⠉⢩⡙⠛⠒⠦⠤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠖⠋⣉⠀⠀⠀⠀⠀⠀⠀⠋⠳⠺⠉⠀⠀⠀⠀⠀⠀⠉⠉⠲⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡭⠆⣠⠖⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⢮⣷⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡾⠇⣠⡜⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠋⠀⣰⢿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡌⢷⡀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⡿⠁⠀⠁⢸⣿⣿⣶⣶⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣦⣴⣶⣶⣿⣿⠁⠀⢳⡀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠀⡠⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣦⣄⡀⠀⢄⣤⣴⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⣷⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⣠⢣⡇⠀⠘⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠃⠀⠀⣜⡆⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣸⠁⠀⠃⣾⠇⢠⡄⠀⣠⠏⠀⠀⠉⡝⣿⣿⡿⢿⣿⣿⠇⣿⣿⣿⣿⣿⡿⠿⡛⠋⠁⢹⡄⠀⠀⢰⠀⠀⢿⠟⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⡟⠀⡆⠀⡏⠀⢸⠀⠀⢻⡀⠀⠀⠀⢻⣻⣿⣿⠆⢈⠉⠀⠉⢫⢡⡸⠿⢿⣿⠃⠀⠀⠈⡇⠀⠀⢸⡄⠀⠈⣧⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⢸⠃⢰⠀⠀⡇⠀⠸⣆⠀⠀⠳⣄⠀⠀⠀⠈⠉⢁⣠⢞⣀⡴⣦⡸⡆⠙⠓⠛⠉⠀⠀⠀⣰⠇⠀⠀⢸⡇⡆⠀⢹⡀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠰⣿⠀⣾⠀⠀⣿⠀⠀⠈⠣⣄⣀⠀⠙⠓⠒⠒⠛⢉⡴⠋⠀⣠⠀⠙⢞⠧⣤⣀⣀⣀⣤⠴⠃⠀⠀⢀⡿⠀⣇⠀⠀⣧⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⣿⠀⡏⠀⠀⠇⠀⠀⠀⠀⠀⠀⠉⠉⠀⢀⡠⠖⠁⠀⠀⠀⣻⠀⠀⠈⢣⡀⠀⠠⣄⣀⣀⣀⣠⠴⠋⠀⠀⢻⡀⠀⢻⡄⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⢸⡏⢠⢀⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⣯⣅⣀⠀⠀⠀⠀⠸⡄⠀⠀⠀⠹⣦⠀⠀⠉⠉⠉⠀⠀⠀⠀⠀⠀⣇⠀⠸⡇⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⢸⠁⢸⣾⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣍⠛⠲⣤⣀⡀⠃⣀⣠⣤⡄⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⠀⠀⡇⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⡎⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠢⣄⡀⠉⠉⣀⡤⠴⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣽⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⢸⠇⠀⢸⠀⢠⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢩⠉⠉⠀⠀⠀⠀⠀⠀⠀⠳⢄⡀⠀⠀⠀⠀⠀⠀⠀⠘⡏⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⡞⠀⣀⡀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⣆⠀⠀⠀⠀⠀⠀⡆⡇⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⢸⠇⠸⠛⠋⠀⣧⠀⠀⠀⠀⠀⠀⠀⠀⢠⡀⠀⠀⠀⠀⠀⣀⠀⠀⠘⠀⠀⢠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⢆⠀⠀⠀⠀⡟⢧⠀⠀⠀");
                System.out.println("⠀⠀⠀⢠⡏⠀⡀⠀⠀⢀⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠛⠒⠀⠀⠈⠓⠦⠤⠤⠤⠀⠙⠛⠛⠋⠀⠀⠛⠦⠄⠀⠀⠀⠙⣆⠀⢠⠁⢸⡆⠀⠀");
                System.out.println("⠀⠀⠀⡞⠀⢸⢧⡀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠤⣀⡀⠀⠀⠀⠀⠀⠙⢠⣼⠀⠀⢳⠀⠀");
                System.out.println("⠀⠀⣼⠇⠀⠀⠀⠀⠀⠸⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠦⣤⣀⣀⠀⠀⠀⠙⠲⠶⠦⠶⠂⠀⠀⠉⢀⠀⠀⠀⠀⢀⠏⡿⠀⠀⢸⡇⠀");
                System.out.println("⠀⢠⡏⠀⠀⠀⠀⠀⠀⠀⢺⡆⠀⠀⠀⠀⠀⠀⠀⠘⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢤⣀⡀⠀⠀⠀⠀⠙⠓⠀⠀⡿⢀⠇⠀⠀⠀⡇⠀");
                System.out.println("⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠀⠀⠀⠀⠻⢤⣄⣀⣠⡤⠀⠀⠀⠀⠉⠀⠀⠀⠀⠂⠀⠀⠁⣼⠀⠟⠛⠀⢳⠀");
                System.out.println("⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣄⠀⠀⠀⠀⡀⠀⠀⠀⠀⣀⠀⠀⠀⢀⡀⠀⠀⠀⣀⠀⠀⠀⠀⠐⠶⠤⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⠀⣼⠀");
                System.out.println("⠀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡿⣄⠀⠀⠀⢳⡀⠀⠀⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣿⠀⠀⠀⣠⢿⡇");
                System.out.println("⠀⠸⡇⠀⠀⠀⠀⠀⠀⡀⠀⠈⣧⠙⣆⠀⠀⠀⠻⡀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠄⠀⠀⢹⡟⡆⠀⡼⠁⢸⠇");
                System.out.println("⠀⠀⠻⡾⡆⡀⠀⠀⠀⡟⢦⣠⠇⠀⠘⢧⡀⠀⠀⠉⠉⣧⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡄⠀⣼⣠⣿⠞⠁⣰⠏⠀");
                System.out.println("⠀⠀⠀⠳⣷⡱⡆⠀⠀⢷⡀⠀⠀⢆⣰⢀⠙⣄⠀⠀⠀⠀⠉⠳⠶⢦⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠾⠋⠀⢸⠻⠭⠤⠔⠊⠁⠀⠀");
                System.out.println("⠀⠀⠀⠀⠈⠓⠻⣦⣤⣤⡟⠀⠀⠸⠛⢺⡀⠈⢧⡀⠀⠀⠀⠀⠀⠀⠉⠉⠒⠒⠉⠀⠀⠀⠀⠀⠀⠀⣠⡴⠋⠁⠀⠀⢀⣼⢐⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⡀⠀⠃⠀⠀⠀⠀⠀⠙⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⡤⠖⠛⠁⠀⢠⣀⣤⣄⣺⣿⠸⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⡀⠀⠀⣦⣀⡀⠀⠀⠀⠈⠙⠲⠶⠶⠶⠶⠶⠶⠛⠛⢩⡉⡀⠀⠀⠀⠀⠈⠛⠃⠀⣴⡿⠉⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⣄⠀⠉⠁⠀⠀⠀⠀⢀⡼⠂⠀⠀⠀⠀⠀⠀⠀⠀⠈⢹⣷⢦⣤⣀⠀⣀⣀⣰⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠦⣴⠶⠶⢲⡚⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣠⡴⠉⠈⢻⣁⣉⣋⣀⣤⣤⣤⣄⣀⡀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠤⢖⣖⡦⠼⠴⢤⣀⣷⣲⣤⡀⠀⠀⠀⠀⠀⢠⠞⢁⢤⡙⡟⣇⠀⢶⠟⡾⣷⣆⡈⢉⢳⣇⣬⠛⣿⡄⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠥⢽⡑⣠⢔⣒⡀⢀⡇⠀⢩⠉⢹⡇⠀⠀⠀⠀⠈⠛⠾⠟⠛⠛⠛⠷⠦⠤⣼⣃⣋⣼⣁⣀⡿⠭⠶⠿⠃⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠒⠒⠛⠙⠶⠤⠿⠟⠑⠶⠿⠽⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");

                // normal endings
        }   else if (score >= 100) {
                System.out.println("Congratulations! You had a successful shopping trip at Best Buy!");
            } else if (score >= 50) {
                System.out.println("Not bad, but you could’ve picked up more items.");
            } else {
                System.out.println("It seems like your trip didn’t go very well. Better luck next time!");
        }
    }
}