public class UlamVerifier {

    // Method to check if a number eventually reaches 1
    public static boolean reachesOne(long n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean allReachOne = true;

        for (int i = 1; i < 1_000_000; i++) {
            if (!reachesOne(i)) {
                System.out.println("Conjecture failed at: " + i);
                allReachOne = false;
                break;
            }
        }

        if (allReachOne) {
            System.out.println("Verified: Every number under 1 million reaches 1.");
        }
    }
}
