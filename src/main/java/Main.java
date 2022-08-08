public class Main {
    public static void main(String[] args) {
        int countComp = 600; // кол-во компьютеров
        int countStep = countComp - 2;
        int tempResult = 0;
        int count = 0;

        for (int i = 0; i < countStep; i++) {
            tempResult = tempResult + i;
            count = i;
        }

        int result = tempResult + count + countComp;
        System.out.println("соединений между " + countComp + " компьютерами = " + result);
    }
}

