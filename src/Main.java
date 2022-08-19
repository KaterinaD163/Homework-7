import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Задание 2
        String FullName = "Ivanov Ivan Ivanovich";
        String FullName1 = FullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + FullName1);

        //Задание 3
        String fullName1= "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName1 );

        //Задание 4

    }
}
