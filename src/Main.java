import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> dataInput = new ArrayList<>();
        int k; // обозначает элемент вводимой последовательности
        int Hmax = 0; // обозначает высоту подъема
        int h = 0;
        int startIndex = 0;
        // вводим элементы в лист
        while (true) {
            k = Integer.parseInt(scan.nextLine());
            if (k == 0) break;
            dataInput.add(k);
        }
        for (int i = 0; i < dataInput.size() - 1; i++) {
            if (dataInput.get(i + 1) > dataInput.get(i)) {
                continue;
            } else {
                h = dataInput.get(i) - dataInput.get(startIndex);
                if (Hmax < h) {
                    Hmax = h;
                }
                startIndex = i + 1;
            }
}
        h = dataInput.get(dataInput.size()-1) - dataInput.get(startIndex);
        if (Hmax < h) {
            Hmax = h;
            //System.out.println("h = " + h + " Hmax = " + Hmax);
        }
        System.out.println("Получено: " + dataInput.size() + " чисел " + "Hmax = " + Hmax);
    }
}