import java.util.GregorianCalendar;

public class CalendarExample {
    public static void main(String[] args) {
        GregorianCalendar currentDate = new GregorianCalendar();

        int currentYear = currentDate.get(GregorianCalendar.YEAR);
        int currentMonth = currentDate.get(GregorianCalendar.MONTH) + 1;
        int currentDay = currentDate.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Текущая дата:");
        System.out.println("Год: " + currentYear);
        System.out.println("Месяц: " + currentMonth);
        System.out.println("День: " + currentDay);

        long milliseconds = 1234567898765L;
        currentDate.setTimeInMillis(milliseconds);


        int year = currentDate.get(GregorianCalendar.YEAR);
        int month = currentDate.get(GregorianCalendar.MONTH) + 1;
        int day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("\nДата для времени 1234567898765L:");
        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День: " + day);
    }
}