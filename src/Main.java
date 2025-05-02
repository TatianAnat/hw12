public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        //task 2
        System.out.println("Task 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //task 3
        System.out.println("Task 3");
        String firstName3 = "Семён";
        String middleName3 = "Семёнович";
        String lastName3 = "Иванов";
        String fullName3 = lastName3 + " " + firstName3 + " " + middleName3;
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName3.replace("ё","е"));

    }
}