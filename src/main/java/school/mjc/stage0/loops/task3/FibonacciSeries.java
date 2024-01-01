package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void main(String[] args) {

    }
    public  void printFibonacci(int lastFibonacci) {

        int firstNum = 0;
        int secondNum = 1;
        int serie = 0;
        System.out.println(firstNum);
        System.out.println(secondNum);
        while(secondNum < lastFibonacci){
            serie = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = serie;
            System.out.println(serie);
        }



    }
}
