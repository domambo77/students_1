package entity;

import java.sql.Date;
import java.util.Objects;

public class Student {
    private int id;
    private String surname;
    private String name;
    private Group group;
    private Date date;

    public Student() {
    }

    public Student(int id, String surname, String name, Group group, Date date) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && Objects.equals(getSurname(), student.getSurname()) && Objects.equals(getName(), student.getName()) && Objects.equals(getGroup(), student.getGroup()) && Objects.equals(getDate(), student.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSurname(), getName(), getGroup(), getDate());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", group=" + group +
                ", date=" + date +
                '}';
    }
}
