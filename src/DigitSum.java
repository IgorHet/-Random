import java.util.Random;

public class DigitSum {
    public static void main(String[] args) {
        Random random = new Random();

        // Генеруємо випадкове число в діапазоні від 11 до 100011
        int number = random.nextInt(100001 - 11) + 11;

        System.out.println("Випадкове число: " + number);

        // Перетворюємо число в рядок для зручності операцій зі строками
        String numberAsString = String.valueOf(number);

        int digitSum = 0;

        // Обходимо всі символи (цифри) рядка та додаємо їх до суми
        for (int i = 0; i < numberAsString.length(); i++) {
            // Конвертуємо символ в цифру, віднімаючи код символа '0'
            int digit = numberAsString.charAt(i) - '0';
            digitSum += digit;
        }

        System.out.println("Сума цифр числа " + number + ": " + digitSum);
    }
}