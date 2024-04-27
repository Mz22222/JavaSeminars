//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import help.Helper;

public class Main {

    public static void main(String[] args) {

        System.out.println(Helper.getCurrentDateTime());
        Helper.getUserDataFromConsole();


        int[][] array = new int[][]{

                {2, 3},
                {1, 2, 3, 4}
        };

        String toReverse = "Добро пожаловать на курс по Java";
        System.out.println(Helper.reverse(toReverse));
//        int[] arr = new int[]{1,2,4,76,89,5,-100};
//        System.out.println(Helper.getSumElemsFromArray(array));


    }
}









