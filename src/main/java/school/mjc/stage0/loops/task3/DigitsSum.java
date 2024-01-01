package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void main(String[] args) {

    }
    public void printDigitsSum(int t){
    int sum = 0;
    int counter = 1;
    while (t > 0){
        sum += t % 10;
        t = t / 10;
    }System.out.println(sum);
    }
}
