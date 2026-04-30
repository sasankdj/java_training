public class loaders {

    public static void main(String[] args) throws Exception {

        simpleSpinner();
        progressBar();
        welcomeBanner();
        hackerBoot();
        typingEffect();
        colorLoader();
    }

    // ==================================================
    static void simpleSpinner() throws InterruptedException {
        String animation = "|/-\\";
        System.out.println("\n===== SIMPLE SPINNER =====");

        for (int i = 0; i < 40; i++) {
            System.out.print("\rLoading " + animation.charAt(i % animation.length()));
            System.out.flush();
            Thread.sleep(100);
        }

        System.out.println("\rLoading Complete!");
    }

    // ==================================================
    static void progressBar() throws InterruptedException {
        int total = 30;
        System.out.println("\n===== PROGRESS BAR =====");

        for (int i = 0; i <= total; i++) {

            int percent = (i * 100) / total;

            StringBuilder bar = new StringBuilder("[");
            for (int j = 0; j < total; j++) {
                if (j < i) bar.append("=");
                else bar.append(" ");
            }
            bar.append("]");

            System.out.print("\r" + bar + " " + percent + "%");
            System.out.flush();

            Thread.sleep(100);
        }

        System.out.println("\nCompleted!");
    }

    // ==================================================
    static void welcomeBanner() throws InterruptedException {

        System.out.println("\n===== WELCOME BANNER =====");

        String[] banner = {
            "**************************************************",
            "*                                                *",
            "*         WELCOME TO CVCORP PROJECT              *",
            "*                                                *",
            "**************************************************"
        };

        for (String line : banner) {
            System.out.println(line);
            Thread.sleep(200);
        }
    }

    // ==================================================
    static void hackerBoot() throws InterruptedException {

        System.out.println("\n===== HACKER BOOT =====");

        String[] boot = {
            "Initializing system",
            "Loading modules",
            "Connecting database",
            "Decrypting access",
            "Access Granted",
            "Launching project"
        };

        for (String line : boot) {
            System.out.print(line);

            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                System.out.flush();
                Thread.sleep(300);
            }

            System.out.println(" OK");
        }
    }

    // ==================================================
    static void typingEffect() throws InterruptedException {

        System.out.println("\n===== TYPING EFFECT =====");

        String text = "Welcome to CVCorp Console Project";

        for (char ch : text.toCharArray()) {
            System.out.print(ch);
            System.out.flush();
            Thread.sleep(80);
        }

        System.out.println();
    }

    // ==================================================
    static void colorLoader() throws InterruptedException {

        final String GREEN = "\u001B[32m";
        final String CYAN = "\u001B[36m";
        final String RESET = "\u001B[0m";

        System.out.println("\n===== COLOR LOADER =====");

        for (int i = 0; i <= 20; i++) {

            int percent = (i * 100) / 20;

            StringBuilder bar = new StringBuilder("[");
            for (int j = 0; j < 20; j++) {
                if (j < i) bar.append("#");
                else bar.append(" ");
            }
            bar.append("]");

            System.out.print("\r" + CYAN + "System Loading: " +
                    GREEN + bar + " " + percent + "%" + RESET);

            System.out.flush();
            Thread.sleep(150);
        }

        System.out.println("\nSystem Ready!");
    }
}