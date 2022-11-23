public class Main {
    public static void main(String[] args) {
        System.out.println("  Задание - 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String spacing = " ";
        String fullName = lastName + spacing + firstName + spacing + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("  Задание - 2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);
        System.out.println("  Задание - 3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName2);
        System.out.println();
        System.out.println("ДЗ Выполнено");

    }
}