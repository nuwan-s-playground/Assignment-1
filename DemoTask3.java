public class DemoTask3 {
    public static void main(String[] args) {
        int numberOne = 123;
        int numberTwo = 456;
        int numberThree = 7890;
        final String RED_COLOR = "\033[35;1m";
        final String RESET = "\033[0m";
        System.out.printf("\n%s(%s)%s%s-%s \n\n",RED_COLOR,numberOne,RESET,numberTwo,numberThree);
    }
}
