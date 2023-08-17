public class DemoTask6_A {
    public static void main(String[] args) {
        final String GREEN_BACK_COLOR_BOLT = "\033[42;1m";
        final String RED_BACK_COLOR_BOLD = "\033[41;1m";
        final String RESET = "\033[0m";

        System.out.printf("%s[%s%s%s%s%s%s]%s \n", RED_BACK_COLOR_BOLD, " ".repeat(15),"5", RESET,GREEN_BACK_COLOR_BOLT, "0%"," ".repeat(15),RESET);
    }
}
