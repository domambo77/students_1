package db;

import entity.Group;
import entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static Statement statement;
    private static final String ID = "id";
    private static final String SURNAME = "surname";
    private static final String NAME = "name";
    private static final String GROUP_NAME = "group";
    private static final String DATE = "date";

    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students?user=root&password=password");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static List<Student> getAllStudents(){

        List<Student> result = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery("select student.id, surname, name, date, groupp.group " +
                    "from student left join groupp on student.id_group = groupp.id where status = '1';");
            while ( resultSet.next()){
Student student = new Student();
student.setId(resultSet.getInt(ID));
student.setSurname(resultSet.getString(SURNAME));
student.setName(resultSet.getString(NAME));
student.setDate(resultSet.getDate(DATE));
Group group = new Group();
group.setName(resultSet.getString(GROUP_NAME));
student.setGroup(group);
result.add(student);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
