package entity;

import java.util.Objects;

public class Grade {
    private int id;
    private Student student;
    private Term term;
    private Discipline discipline;
    private int value;

    public Grade() {
    }

    public Grade(int id, Student student, Term term, Discipline discipline, int value) {
        this.id = id;
        this.student = student;
        this.term = term;
        this.discipline = discipline;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grade)) return false;
        Grade grade = (Grade) o;
        return getId() == grade.getId() && getValue() == grade.getValue() && Objects.equals(getStudent(), grade.getStudent()) && Objects.equals(getTerm(), grade.getTerm()) && Objects.equals(getDiscipline(), grade.getDiscipline());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStudent(), getTerm(), getDiscipline(), getValue());
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", student=" + student +
                ", term=" + term +
                ", discipline=" + discipline +
                ", value=" + value +
                '}';
    }
}
