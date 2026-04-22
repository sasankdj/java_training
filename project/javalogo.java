class Javalogo {

    // ANSI Colors (standalone)
    static final String RED = "\033[1;91m";
    static final String BLUE = "\033[1;94m";
    static final String RESET = "\033[0m";

    // Clear screen method (more reliable)
    static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void javaAnimation() {

        String[] frames = {

            // Frame 1
            RED +
            "          (  )   (   )\n" +
            "           ) (   ) ( \n" +
            "          (   ) (   )\n" +
            BLUE +
            "        <___________>\n" +
            "        |           |\n" +
            "        |   JAVA    |\n" +
            "        |___________|\n",

            // Frame 2
            RED +
            "           ) (   ) ( \n" +
            "          (   ) (   )\n" +
            "           ) (   ) ( \n" +
            BLUE +
            "        <___________>\n" +
            "        |           |\n" +
            "        |   JAVA    |\n" +
            "        |___________|\n",

            // Frame 3
            RED +
            "          (   ) (   )\n" +
            "           ) (   ) ( \n" +
            "          (   ) (   )\n" +
            BLUE +
            "        <___________>\n" +
            "        |           |\n" +
            "        |   JAVA    |\n" +
            "        |___________|\n"
        };

        for (int i = 0; i < 10; i++) {  // smoother loop
            for (String frame : frames) {
                clear();

                System.out.println("\n\n\t\t" + frame + RESET);
                System.out.println("\t\t   JAVA LOADING... ☕\n");

                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        javaAnimation();
    }
}