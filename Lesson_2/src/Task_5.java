//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task_5 {
    private static Logger logger = Log.log(Task_5.class.getName());
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFileNamesInDir(".")));
        writeFileNamesToFIle(".","task_5.txt");

    }

    //Напишите метод, который вернет содержимое текущей папки в виде массива строк.
    public static String[] getFileNamesInDir(String path) {
        File dir = new File(path);
        String[] res = new String[0];
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                res = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    File f = files[i];
                    String name = f.getName();
                    res[i] = name;
                }
            }
        }else {
            System.out.println(dir.getName() + " не является папкой.");
        }
        return res;
    }

    //Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
    public static void writeFileNamesToFIle(String outpath, String inpath){
        String [] arr = getFileNamesInDir(outpath);
        try {
            FileWriter fw = new FileWriter(inpath, true); // если указываем true, то будет дозаписывать, если без true, то будт перезаписываться
            for (int i = 0; i < arr.length; i++) {
                fw.write(arr[i] + "\n");
            }
            fw.flush();
            if(isThrow()){
                throw new IOException("Фатальная ошибка записи");
            }


        } catch (IOException e) {
            System.out.println("Ошибка записи");
            logger.log(Level.INFO, "ОШИБКА");
        }
        //Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.


    }
    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }





}

