public class Main {
    public static void main(String[] args) {
        int countComp = 600; // кол-во компьютеров
        int countStep = countComp - 2; // количество шагов
        int tempResult = 0; //переменная для сложения
        int count = 0; //переменная для удвоения

        for (int i = 0; i < countStep; i++) {
            tempResult = tempResult + i; //сложение линий
            count = i;//получение результата для удвоения
        }

        int result = tempResult + count + countComp;
        System.out.println("линий между " + countComp + " компьютерами = " + result);
    }
}
/*
Пример:
КолКомп=10
КоличествоЭлементов = КоличествоКомп - 3
КоличествоЭлементов = 7
Количество Линий = КоличествоКомп + КоличествоЭлементов + 7 + 6 + 5 + 4 + 3 + 2 + 1
Количество Линий = 45


 */
