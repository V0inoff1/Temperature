import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner=new Scanner(System.in);

        int [] temps = new int[30];// создаем массив, куда будут складываться температура по дням
        boolean [] isFilled = new boolean[30];// проверяет, заполнел ли пользователь день в массиве или нет
        while (true){
            System.out.println("Введите два числа : дата и температура");
            String input= scanner.nextLine();
            if ("end".equals(input)) { // сравнение введенных данных на содержание в них слова end
                break;
            }
            //input.substring(0, input.indexOf(" ")); // вырезать текст из введенного через сканер текста от индекса 0 (первого знака) до пробела
            String[] parts = input.split(" ");// разделение строки по знаку пробел, после чего куски собираются в массив и создается новый масив parts
            int day= Integer.parseInt(parts[0]) - 1;// создаем переменную day класса int, преобразуем текс в число, после чего передаем в ячейку day значение индекса 0 ( первое значение) набора parts
            int t = Integer.parseInt(parts[1]);// передаем так же и температуру
            temps [day] = t;// присваеваем в список temps для нужного дня нужную температуру
            isFilled[day]=true;

            double sum =0;
            for (int tt: temps) { sum+=tt;}

            int cnt =0;
            for (boolean f: isFilled) {
                if (f){
                    cnt++;
                }
            }
            System.out.println("Средняя температура: " + (sum/ cnt));
        }
    }
}
