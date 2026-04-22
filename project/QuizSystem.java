import java.util.*;

class User {
    String username;
    String password;
    int score;
    boolean attempted;

    User(String u, String p) {
        username = u;
        password = p;
        score = 0;
        attempted = false;
    }
}
class Question {
    String question;
    String options;
    String correct;

    Question(String q, String o, String c) {
        question = q;
        options = o;
        correct = c;
    }
}

class Attempt {
    String answer = "";
    boolean visited = false;
    boolean marked = false;
}
public class QuizSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    static User currentUser = null;

    // ---------------- SIGNUP ----------------
    static void signup() {
        System.out.print("Enter Username: ");
        String u = sc.next();

        System.out.print("Enter Password: ");
        String p = sc.next();

        users.add(new User(u, p));
        System.out.println("Signup Successful!\n");
    }

    // ---------------- LOGIN ----------------
    static boolean login() {
        System.out.print("Enter Username: ");
        String u = sc.next();

        System.out.print("Enter Password: ");
        String p = sc.next();

        for (User user : users) {
            if (user.username.equals(u) && user.password.equals(p)) {
                currentUser = user;
                System.out.println("Login Successful!\n");
                return true;
            }
        }

        System.out.println("Invalid Credentials!\n");
        return false;
    }

    // ---------------- OTP ----------------
    static boolean otp() {
        int otp = 1000 + (int)(Math.random() * 9000);
        System.out.println("OTP: " + otp);

        System.out.print("Enter OTP: ");
        int uotp = sc.nextInt();

        return otp == uotp;
    }
static int askWithTimer(String question, String options, String correct) {

    try {
        System.out.println("\n" + question);

        if (!options.equals(""))
            System.out.println(options);

        System.out.println(" You have 5 seconds (answer quickly!)");

        long start = System.currentTimeMillis();

        String ans = sc.next();   // user can type immediately

        long end = System.currentTimeMillis();

        long timeTaken = (end - start) / 1000;

        if (timeTaken > 5) {
            System.out.println(" Time's up!");
            return 0;
        }

        if (ans.equalsIgnoreCase(correct)) {
            return 1;
        }

    } catch (Exception e) {}

    return 0;
}
    // ---------------- QUIZ ----------------
static void startQuiz() {

    if (currentUser.attempted) {
        System.out.println("You already attempted!\n");
        return;
    }

    if (!otp()) {
        System.out.println("Wrong OTP!\n");
        return;
    }

    ArrayList<Question> questions = new ArrayList<>();

    System.out.println("\nChoose Category:");
    System.out.println("1. Java 2. C 3. Aptitude");
    int ch = sc.nextInt();

    // -------- JAVA --------
    if (ch == 1) {
        questions.add(new Question("What is Java?", "A.Language B.OS C.Browser D.Hardware", "A"));
        questions.add(new Question("Size of int?", "A.2 B.4 C.8 D.16", "B"));
        questions.add(new Question("OOP stands for?", "A.Object Oriented Programming B.Other", "A"));
    }

    // -------- C --------
    else if (ch == 2) {
        questions.add(new Question("Who developed C?", "A.Dennis B.Gosling", "A"));
        questions.add(new Question("C is?", "A.Low B.Middle C.High", "B"));
        questions.add(new Question("Extension of C?", "A..java B..c C..py", "B"));
    }

    // -------- APTITUDE --------
    else if (ch == 3) {
        questions.add(new Question("2+2=?", "", "4"));
        questions.add(new Question("5*3=?", "", "15"));
        questions.add(new Question("10/2=?", "", "5"));
    }

   
    Collections.shuffle(questions);

    int n = questions.size();

    // Attempt tracking
    ArrayList<Attempt> attempts = new ArrayList<>();
    for (int i = 0; i < n; i++) attempts.add(new Attempt());

    int current = 0;

    while (true) {
        Question q = questions.get(current);
        Attempt a = attempts.get(current);

        a.visited = true;

        System.out.println("\nQ" + (current + 1) + ": " + q.question);
        if (!q.options.equals("")) System.out.println(q.options);

        System.out.print("Answer (or 0 skip): ");
        String ans = sc.next();

        if (!ans.equals("0")) {
            a.answer = ans;
            a.marked = false;
        }

        System.out.println("\n1.Next 2.Previous 3.Jump 4.Mark 5.Palette 6.Submit");
        int choice = sc.nextInt();

        if (choice == 1) current++;
        else if (choice == 2) current--;
        else if (choice == 3) {
            System.out.print("Enter question number: ");
            current = sc.nextInt() - 1;
        }
        else if (choice == 4) a.marked = true;
        else if (choice == 5) showPalette(attempts);
        else if (choice == 6) break;

        if (current < 0) current = 0;
        if (current >= n) current = n - 1;
    }

    evaluate(questions, attempts);
    currentUser.attempted = true;
}

static void showPalette(ArrayList<Attempt> attempts) {
    System.out.println("\n--- Question Palette ---");

    for (int i = 0; i < attempts.size(); i++) {
        Attempt a = attempts.get(i);

        if (!a.visited) System.out.print("Q" + (i+1) + "[NA] ");
        else if (a.marked) System.out.print("Q" + (i+1) + "[M] ");
        else if (a.answer.equals("")) System.out.print("Q" + (i+1) + "[N] ");
        else System.out.print("Q" + (i+1) + "[A] ");
    }
    System.out.println();
}
    // ---------------- RESULT ----------------
    static void showResult() {
        System.out.println("\nScore: " + currentUser.score + "/3");

        if (currentUser.score >= 2) {
            System.out.println("PASS 🎉");
            System.out.println("Congratulations " + currentUser.username + "!");
        } else {
            System.out.println("FAIL ");
        }
    }

    static void evaluate(ArrayList<Question> questions, ArrayList<Attempt> attempts) {

    int correct = 0, wrong = 0;

    for (int i = 0; i < questions.size(); i++) {
        if (attempts.get(i).answer.equalsIgnoreCase(questions.get(i).correct)) {
            correct++;
        } else if (!attempts.get(i).answer.equals("")) {
            wrong++;
        }
    }

    int total = questions.size();
    double percent = (correct * 100.0) / total;

    currentUser.score = correct;

    System.out.println("\n--- Result ---");
    System.out.println("Score: " + correct + "/" + total);
    System.out.println("Correct: " + correct);
    System.out.println("Wrong: " + wrong);
    System.out.println("Percentage: " + percent + "%");

    if (percent >= 40) {
        System.out.println("PASS 🎉");
    } else {
        System.out.println("FAIL ");
    }
}
    // ---------------- LEADERBOARD ----------------
    static void leaderboard() {
        System.out.println("\n--- Leaderboard ---");

        for (User u : users) {
            System.out.println(u.username + " : " + u.score);
        }
    }

    // ---------------- MENU ----------------
    static void menu() {
        while (true) {
           System.out.println("\n1.Take Quiz 2.Result 3.Leaderboard 4.Notes 5.Logout");
            int ch = sc.nextInt();

            if (ch == 1) startQuiz();
else if (ch == 2) showResult();
else if (ch == 3) leaderboard();
else if (ch == 4) showNotes();
else return;
        }
    }

    static void showNotes() {
    System.out.println("\n--- Study Notes ---");
    System.out.println("1. Java");
    System.out.println("2. C");
    System.out.println("3. Aptitude");

    int ch = sc.nextInt();

    if (ch == 1) {
        System.out.println("\nJava Notes:");
        System.out.println("- OOP: Encapsulation, Inheritance, Polymorphism");
        System.out.println("- JVM: Java Virtual Machine");
        System.out.println("- int size = 4 bytes");
    }

    else if (ch == 2) {
        System.out.println("\nC Notes:");
        System.out.println("- Developed by Dennis Ritchie");
        System.out.println("- Middle level language");
        System.out.println("- File extension: .c");
    }

    else if (ch == 3) {
        System.out.println("\nAptitude Notes:");
        System.out.println("- Practice basic arithmetic");
        System.out.println("- Focus on speed & accuracy");
    }
}
    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Signup 2.Login 3.Exit");
            int ch = sc.nextInt();

            if (ch == 1) signup();
            else if (ch == 2 && login()) menu();
            else if (ch == 3) break;
        }
    }
}