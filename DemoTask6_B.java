public class DemoTask6_B {
    public static void main(String[] args) {
        final String PURPLE_COLOR = "\033[35m";
        final String WHITE_COLOR = "\033[37m";
        final String BLUE_COLOR_BOLD = "\033[34;1m";
        final String RED_COLOR = "\033[31m";
        final String RESET = "\033[0m";

        System.out.printf("%s+%s+%s+%s \n", RED_COLOR,"-".repeat(10), "-".repeat(5),RESET);
        System.out.printf("%s|%s %s%s%s%s%s|%s %s%s%s%s%s|%s \n",RED_COLOR,RESET,BLUE_COLOR_BOLD, "Name",RESET," ".repeat(5),RED_COLOR,RESET,BLUE_COLOR_BOLD,"Age",RESET,RED_COLOR ," ".repeat(1),RESET);
        System.out.printf("%s+%s+%s+%s \n", RED_COLOR,"-".repeat(10), "-".repeat(5),RESET);
        System.out.printf("%s|%s %s%s%s%s%s|%s %s%s%s%s%s|%s \n",RED_COLOR,RESET,WHITE_COLOR, "Alice",RESET, " ".repeat(4),RED_COLOR,RESET, PURPLE_COLOR,"24",RESET, " ".repeat(2),RED_COLOR,RESET);
        System.out.printf("%s|%s %s%s%s%s%s|%s %s%s%s%s%s|%s \n",RED_COLOR,RESET,WHITE_COLOR, "Bob",RESET," ".repeat(6),RED_COLOR,RESET,PURPLE_COLOR,"30", RESET," ".repeat(2),RED_COLOR,RESET);
        System.out.printf("%s+%s+%s+%s \n", RED_COLOR,"-".repeat(10), "-".repeat(5),RESET);
    }
}
