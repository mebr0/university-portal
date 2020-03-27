package com.mebr0.user.entity;

import com.mebr0.user.base.Employee;
import com.mebr0.user.type.Degree;
import com.mebr0.user.type.Faculty;
import com.mebr0.user.type.Position;

/**
 * Entity class for admins
 * Also factory
 */
public class Admin extends Employee {

    private Admin(String name, String lastName) {
        super(name, lastName);
    }

    /**
     * Must called only once for creating very first admin
     * @return first instance of admin
     */
    public static Admin from(String firstName, String lastName) {
        return new Admin(firstName, lastName);
    }

    public Student student(String firstName, String lastName, Faculty faculty, Degree degree) {
        return new Student(firstName, lastName, faculty, degree);
    }

    public Teacher teacher(String firstName, String lastName, Faculty faculty, Position position) {
        return new Teacher(firstName, lastName, faculty, position);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + super.toString() + "]";
    }
}
