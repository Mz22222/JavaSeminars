//Task_1
//Напишите метод, который принимает на вход строку (String) и
//определяет является ли строка палиндромом (возвращает boolean значение).

public class Task_1_Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom(" а роза УПАЛА на лапу АзорА "));
    }

    public static boolean isPalindrom(String str) {
        str = str.replace(" ", "").trim().toLowerCase();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length/2; i++) {
            int length = charArray.length;
            if (str.charAt(i) != str.charAt(length-i-1)) {
                System.out.println("Это не палиндром");

                return false;
            }

        }
        System.out.println("Это палиндром");
        return true;

    }
}
