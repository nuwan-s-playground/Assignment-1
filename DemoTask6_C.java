public class DemoTask6_C {
    public static void main(String[] args) {
        
        final String PURPLE_COLOR = "\033[35m";
        final String WHITE_COLOR = "\033[37m";
        final String BLUE_COLOR_BOLD = "\033[34;1m";
        final String RED_COLOR = "\033[31m";
        final String LIGHT_BLUE_COLOR_BOLD = "\033[36;1m";
        final String PURPLE_COLOR_BOLD = "\033[35;1m";
        final String GREEN_COLOR = "\033[32m";
        final String WHITE_COLOR_BOLD = "\033[37;1m";
        final String YELLOW_COLOR_BOLD = "\033[33;1m";
        final String RED_COLOR_BOLD = "\033[31;1m";
        final String LIGHT_BLUE_BACK_COLOR_BOLT = "\033[46;1m";
        final String PURPLE_BACK_COLOR_BOLT = "\033[45;1m";
        final String GREEN_BACK_COLOR_BOLT = "\033[42;1m";
        final String WHITE__BACK_COLOR_BOLT = "\033[47;1m";
        final String BLUE_BACK_COLOR_BOLD = "\033[44;1m";
        final String YELLOW_BACK_COLOR_BOLT = "\033[43;1m";
        final String RED_BACK_COLOR_BOLD = "\033[41;1m";

        final String RESET = "\033[0m";

        System.out.printf("%s+%s+%s+%s+%s \n", RED_COLOR,"-".repeat(18), "-".repeat(12),"-".repeat(12),RESET);
        System.out.printf("%s|%s %s%s%s%s%s|%s %s%s%s%s%s| %s%s%s%s%s%s%s%s|%s \n",RED_COLOR,RESET,WHITE_COLOR_BOLD, "City",RESET," ".repeat(13),RED_COLOR,RESET,WHITE_COLOR_BOLD,"State",RESET,RED_COLOR ," ".repeat(6),RESET,RED_COLOR,RESET,WHITE_COLOR_BOLD,"Population",RESET,RED_COLOR ," ".repeat(1),RESET);
        System.out.printf("%s+%s+%s+%s+%s \n", RED_COLOR,"-".repeat(18), "-".repeat(12),"-".repeat(12),RESET);
        System.out.printf("%s|%s %s%s%s%s%s|%s %s%s%s%s%s| %s%s%s%s%,d%s%s%s|%s \n",RED_COLOR,RESET,WHITE_COLOR, "Los Angeles",RESET," ".repeat(6),RED_COLOR,RESET,WHITE_COLOR,"California",RESET,RED_COLOR ," ".repeat(1),RESET,RED_COLOR,RESET,PURPLE_COLOR,3966936,RESET,RED_COLOR ," ".repeat(2),RESET);
        System.out.printf("%s|%s %s%s%s%s%s%s%s%s|%s %s%s%s%s%s%s%s%s%s| %s%s%s%s%,d%s%s%s|%s \n",RED_COLOR,RESET,GREEN_COLOR,"New ",RESET,WHITE_COLOR, "York",RESET," ".repeat(9),RED_COLOR,RESET,WHITE_COLOR_BOLD,GREEN_COLOR,"New ",RESET,WHITE_COLOR,"York",RESET,RED_COLOR ," ".repeat(3),RESET,RED_COLOR,RESET,PURPLE_COLOR,8336817,RESET,RED_COLOR ," ".repeat(2),RESET);
        System.out.printf("%s+%s+%s+%s+%s \n", RED_COLOR,"-".repeat(18), "-".repeat(12),"-".repeat(12),RESET);
    }
}
