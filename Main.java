import java.util.Scanner;

class User {
    String username;
    String password;
    boolean attempted;
    int score;

    User(String u, String p) {
        username = u;
        password = p;
        attempted = false;
        score = 0;
    }
}

class QuizSystem {

    static Scanner sc = new Scanner(System.in);

    static User users[] = new User[10];
    static int userCount = 0;
    static int currentUser = -1;

    // Questions: Question, A, B, C, D, Answer
    static String questions[][] = {
            {"What is Java?", "Language", "OS", "Browser", "Hardware", "A"},
            {"Size of int?", "2", "4", "8", "16", "B"},
            {"OOP stands for?", "Object Oriented Programming", "Only One Program", "Old Program", "None", "A"},
            {"Which keyword is used for inheritance?", "this", "super", "extends", "final", "C"},
            {"Which is not primitive?", "int", "float", "String", "char", "C"}
    };

    static int totalQ = questions.length;

    // ---------------- AUTH ----------------

    static void signup() {
        System.out.print("Enter Username: ");
        String u = sc.next();
        System.out.print("Enter Password: ");
        String p = sc.next();

        users[userCount] = new User(u, p);
        userCount++;

        System.out.println("Signup Successful!\n");
    }

    static boolean login() {
        System.out.print("Enter Username: ");
        String u = sc.next();
        System.out.print("Enter Password: ");
        String p = sc.next();

        for (int i = 0; i < userCount; i++) {
            if (users[i].username.equals(u) && users[i].password.equals(p)) {
                currentUser = i;
                System.out.println("Login Successful!\n");
                return true;
            }
        }

        System.out.println("Invalid Credentials!\n");
        return false;
    }

    // ---------------- QUIZ ----------------

    static void startQuiz() {
        if (users[currentUser].attempted) {
            System.out.println("You already attempted the quiz!\n");
            return;
        }

        int score = 0;

        for (int i = 0; i < totalQ; i++) {
            System.out.println("\nQ" + (i + 1) + ": " + questions[i][0]);
            System.out.println("A. " + questions[i][1]);
            System.out.println("B. " + questions[i][2]);
            System.out.println("C. " + questions[i][3]);
            System.out.println("D. " + questions[i][4]);

            System.out.print("Your Answer: ");
            String ans = sc.next().toUpperCase();

            if (ans.equals(questions[i][5])) {
                score++;
            }
        }

        users[currentUser].score = score;
        users[currentUser].attempted = true;

        System.out.println("\nQuiz Completed!");
        showResult();
    }

    // ---------------- RESULT ----------------

    static void showResult() {
        int score = users[currentUser].score;
        System.out.println("Score: " + score + "/" + totalQ);

        double percent = (score * 100.0) / totalQ;
        System.out.println("Percentage: " + percent + "%");

        if (percent >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        System.out.println();
    }

    // ---------------- LEADERBOARD ----------------

    static void leaderboard() {
        System.out.println("\n--- Leaderboard ---");

        for (int i = 0; i < userCount; i++) {
            System.out.println(users[i].username + " : " + users[i].score);
        }
        System.out.println();
    }

    // ---------------- ADMIN ----------------

    static void admin() {
        System.out.print("Enter Admin Password: ");
        String pass = sc.next();

        if (!pass.equals("admin123")) {
            System.out.println("Wrong Admin Password!\n");
            return;
        }

        while (true) {
            System.out.println("\n--- ADMIN MENU ---");
            System.out.println("1. View Questions");
            System.out.println("2. Add Question");
            System.out.println("3. Exit");

            int ch = sc.nextInt();

            if (ch == 1) {
                for (int i = 0; i < totalQ; i++) {
                    System.out.println((i + 1) + ". " + questions[i][0]);
                }
            }

            else if (ch == 2) {
                if (totalQ >= questions.length) {
                    System.out.println("No space to add more questions!\n");
                    continue;
                }

                System.out.print("Enter Question: ");
                sc.nextLine();
                questions[totalQ][0] = sc.nextLine();

                System.out.print("A: ");
                questions[totalQ][1] = sc.nextLine();
                System.out.print("B: ");
                questions[totalQ][2] = sc.nextLine();
                System.out.print("C: ");
                questions[totalQ][3] = sc.nextLine();
                System.out.print("D: ");
                questions[totalQ][4] = sc.nextLine();

                System.out.print("Correct Answer (A/B/C/D): ");
                questions[totalQ][5] = sc.nextLine().toUpperCase();

                totalQ++;
                System.out.println("Question Added!\n");
            }

            else {
                break;
            }
        }
    }

    // ---------------- MENU ----------------

    static void userMenu() {
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Take Quiz");
            System.out.println("2. View Result");
            System.out.println("3. Leaderboard");
            System.out.println("4. Logout");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    startQuiz();
                    break;
                case 2:
                    showResult();
                    break;
                case 3:
                    leaderboard();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // ---------------- MAIN ----------------

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== QUIZ SYSTEM =====");
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Admin");
            System.out.println("4. Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    signup();
                    break;
                case 2:
                    if (login()) {
                        userMenu();
                    }
                    break;
                case 3:
                    admin();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}