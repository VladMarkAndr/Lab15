package org.example;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private String teacher;
    private int duration;
    private double price;
    private int maxStudents;
    private List<String> enrolledStudents;

    public Course(String name, String teacher, int duration, double price, int maxStudents) {

        if (duration <= 0) {
            throw new InvalidCourseDataException("Ошибка: длительность курса должна быть больше 0.");
        }
        if (price < 0) {
            throw new InvalidCourseDataException("Ошибка: цена курса не может быть отрицательной.");
        }
        if (maxStudents <= 0) {
            throw new InvalidCourseDataException("Ошибка: максимальное количество студентов должно быть больше 0.");
        }

        this.name = name;
        this.teacher = teacher;
        this.duration = duration;
        this.price = price;
        this.maxStudents = maxStudents;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enroll(String student) throws EnrollmentException {
        if (student == null || student.trim().isEmpty()) {
            throw new EnrollmentException("Имя студента не может быть пустым.");
        }
        if (enrolledStudents.contains(student)) {
            throw new EnrollmentException("Студент '" + student + "' уже записан на курс '" + name + "'.");
        }
        if (enrolledStudents.size() >= maxStudents) {
            throw new EnrollmentException("Невозможно записать студента '" + student + "': на курс '" + name + "' нет свободных мест (максимум: " + maxStudents + ").");
        }

        enrolledStudents.add(student);
        System.out.println("Успешно: студент '" + student + "' записан на курс '" + name + "'.");
    }

    public void cancelEnrollment(String student) throws EnrollmentException {
        if (!enrolledStudents.contains(student)) {
            throw new EnrollmentException("Ошибка отмены: студент '" + student + "' не найден в списке участников курса '" + name + "'.");
        }

        enrolledStudents.remove(student);
        System.out.println("Успешно: запись студента '" + student + "' на курс '" + name + "' отменена.");
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', teacher='" + teacher + "', duration=" + duration +
                " ч., price=" + price + ", maxStudents=" + maxStudents +
                ", enrolledCount=" + enrolledStudents.size() + "}";
    }
}
