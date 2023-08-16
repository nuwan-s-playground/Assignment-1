public class DemoTask5 {
    public static void main(String[] args) {
        final String RED_COLOR = "\033[31;1m";
        final String YELLOW_COLOR = "\033[33;1m";
        final String GREEN_COLOR = "\033[32;1m";
        final String PURPLE_COLOR = "\033[35;1m";
        final String BLUE_COLOR = "\033[36;1m";
        final String WHITE_COLOR = "\033[37;1m";
        final String RESET = "\033[0m";

        int firstCode = 978;
        int secondCode = 3;
        int thirdCode = 16;
        int fourthCode = 1484100;
        System.out.printf("%s%d%s-%s%d%s-%s%d%s-%s%d%s \n",RED_COLOR,firstCode,RESET,GREEN_COLOR,secondCode,RESET,BLUE_COLOR,thirdCode,RESET,YELLOW_COLOR,fourthCode,RED_COLOR);
        
        
    }
}
