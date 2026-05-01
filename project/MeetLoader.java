public class MeetLoader {

    public static void loadingAnimation() throws InterruptedException {
        int width = 50;

        String leftPerson = "o>";
        String rightPerson = "<o";

        for (int step = 0; step <= width / 2; step++) {

            StringBuilder line = new StringBuilder();

            // Move left person
            for (int i = 0; i < step; i++) {
                line.append(" ");
            }

            // Final meet condition
            if (step == width / 2) {
                line.append("o><o");
            } else {

                // Left person
                line.append(leftPerson);

                // Gap
                for (int i = 0; i < width - (step * 2); i++) {
                    line.append(" ");
                }

                // Right person
                line.append(rightPerson);
            }

            // Extra spaces clear previous longer frame
            line.append("                                                  ");

            System.out.print("\r" + line);

            Thread.sleep(100);
        }

        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        loadingAnimation();
    }
}