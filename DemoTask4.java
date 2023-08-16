public class DemoTask4 {
    public static void main(String[] args) {
        final String RED_COLOR = "\033[31;1m";
        final String YELLOW_COLOR = "\033[33;1m";
        final String GREEN_COLOR = "\033[32;1m";
        final String PURPLE_COLOR = "\033[35;1m";
        final String BLUE_COLOR = "\033[36;1m";
        final String WHITE_COLOR = "\033[37;1m";
        final String RESET = "\033[0m";
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;
        System.out.printf("%s%s%s/%s%s%s/%s%s%s %s%s%s:%s%s%s:%s%s%s \n",RED_COLOR,month,RESET,GREEN_COLOR,day,RESET,BLUE_COLOR,year,RESET,PURPLE_COLOR,hour,RESET,WHITE_COLOR,minute,RESET,YELLOW_COLOR,second,RESET);
    }
}
