package org.example;
import java.util.*;

public class Main {
    private static Map<String, Course> courseDatabase = new HashMap<>();

    public static Course getCourse(String courseName) throws CourseNotFoundException {
        Course course = courseDatabase.get(courseName);
        if (course == null) {
            throw new CourseNotFoundException("Курс с названием '" + courseName + "' не найден в системе.");
        }
        return course;
    }

    public static void main(String[] args) {
        System.out.println("1. Тестирование создания курсов и проверки данных");

        try {
            Course javaCourse = new Course("Java Developer", "Иван Иванов", 48, 25000.0, 3);
            Course pythonCourse = new Course("Python Basics", "Петр Петров", 36, 15000.0, 2);

            courseDatabase.put(javaCourse.getName(), javaCourse);
            courseDatabase.put(pythonCourse.getName(), pythonCourse);

            System.out.println("Курсы успешно созданы и добавлены в систему.");
        } catch (InvalidCourseDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nПопытка создать курс с неверной ценой (-500):");
            Course badCourse = new Course("Bad Course", "Алексей Смирнов", 20, -500.0, 10);
        } catch (InvalidCourseDataException e) {
            System.out.println("Перехвачено исключение данных: " + e.getMessage());
        }

        System.out.println("2. Тестирование операций записи на курсы (enroll)");
        try {
            Course javaCourse = getCourse("Java Developer");

            javaCourse.enroll("Алексей");
            javaCourse.enroll("Мария");
            javaCourse.enroll("Дмитрий");


            javaCourse.enroll("Алексей");

        } catch (CourseNotFoundException | EnrollmentException e) {
            System.out.println("Ошибка операции: " + e.getMessage());
        }

        System.out.println("3. Тестирование лимита мест на курсе ");
        try {
            Course javaCourse = getCourse("Java Developer");

            javaCourse.enroll("Елена");
        } catch (CourseNotFoundException | EnrollmentException e) {
            System.out.println("Ошибка операции: " + e.getMessage());
        }

        System.out.println("\n 4. Тестирование отмены записи и несуществующего курса ");
        try {
            Course javaCourse = getCourse("Java Developer");

            javaCourse.cancelEnrollment("Мария");

            javaCourse.cancelEnrollment("Ольга");

        } catch (CourseNotFoundException | EnrollmentException e) {
            System.out.println("Ошибка операции: " + e.getMessage());
        }

        try {
            System.out.println("\nПоиск несуществующего курса 'Data Science':");
            getCourse("Data Science");
        } catch (CourseNotFoundException e) {
            System.out.println("Перехвачено исключение поиска: " + e.getMessage());
        }
    }
}