
public class loader {

    public static void main(String[] args) throws InterruptedException {
        showLoader1();
      
    }
     static void showLoader1() throws InterruptedException {

        int total = 40; // 40 steps = 4 seconds
        String animation = "|/-\\";

        for (int i = 0; i <= total; i++) {

            int percent = (i * 100) / total;

            // Progress bar
            StringBuilder bar = new StringBuilder("[");
            for (int j = 0; j < total; j++) {
                if (j < i) {
                    bar.append("=");
                } else {
                    bar.append(" ");
                }
            }
            bar.append("]");

            // \r returns cursor to start of same line
            System.out.print("\rLoading " + animation.charAt(i % animation.length()) +
                    " " + bar + " " + percent + "%");

            System.out.flush(); // Important for updating same line
            Thread.sleep(100);
        }

        System.out.print("\rLoading Complete! [========================================] 100%");
        System.out.flush();
    }
    static void showLoader() throws InterruptedException {
        String animation = "|/-\\";
        System.out.print("Loading ");

        // 4 seconds = 4000 ms
        for (int i = 0; i < 40; i++) {  
            System.out.print("\rLoading " + animation.charAt(i % animation.length()) + " ");
            Thread.sleep(100); // 100 ms × 40 = 4000 ms
        }

        // Progress bar finish
        System.out.print("\rLoading Complete!     ");
    }
}