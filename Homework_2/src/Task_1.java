//Сформируйте SQL-запрос
//Пример: Строка sql-запроса:
//
//select * from students where
//Параметры для фильтрации:
//
//        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//Результат:
//
//select * from students where name='Ivanov' and country='Russia' and city='Moscow'


class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже


        String prepare = PARAMS.replace("{", "").replace("}", "").replace("\"", "");
        String[] params = prepare.split(",");
        StringBuilder result = new StringBuilder(QUERY);

        String name = params[0].split(":")[1].trim();
        if (!name.equals("null")) {
            result.append("name='").append(name).append("'");
        }

        String country = params[1].split(":")[1].trim();
        if (!country.equals("null")) {
            if (result.length() > QUERY.length()) {
                result.append(" and ");
            }
            result.append("country='").append(country).append("'");
        }

        String city = params[2].split(":")[1].trim();
        if (!city.equals("null")) {
            if (result.length() > QUERY.length()) {
                result.append(" and ");
            }
            result.append("city='").append(city).append("'");
        }

        String age = params[3].split(":")[1].trim();
        if (!age.equals("null")) {
            if (result.length() > QUERY.length()) {
                result.append(" and ");
            }
            result.append("age='").append(age).append("'");
        }

        return result;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task_1 { //Printer
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}