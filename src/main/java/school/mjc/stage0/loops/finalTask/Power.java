package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int mul=1;
        for(int i=1;i<=power;i++){
            mul*=numberToPrint;
        }
        System.out.println(mul);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
