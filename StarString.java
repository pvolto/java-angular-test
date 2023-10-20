public class StarString {
    public static String starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer.");
        }
        if (n == 0) {
            return "*";
        } else {
            String smallerStarString = starString(n - 1);
            return smallerStarString + smallerStarString;
        }
    }

    public static void main(String[] args) {
        int n;
        try{
            n = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException ex){
            throw new IllegalArgumentException("Input should be an integer.");
        }
        String result = starString(n);
        System.out.println(result);
    }
}
