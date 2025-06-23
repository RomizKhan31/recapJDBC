package JavaPrograms;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class CRUD extends MyDB{

    public boolean InsetDB(String name ) {
        this.getConnection();

        String sql = "INSERT INTO recapJDBC(NAME) VALUES(?)";

        try
        {
            ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            //rs = ps.executeQuery();
            ps.executeUpdate();

            ps.close();
            //rs.close();
            connection.close();
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }


    public List<Student> ReadFromDB() {
        List<Student> list = new ArrayList<Student>();
        Student std = null;
        this.getConnection();
        String sql ="select * from recapJDBC";
        try
        {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next())
            {
                std = new Student();
                std.setId(rs.getInt(1));
                std.setName(rs.getString(2));
                list.add(std);
            }
            ps.close();
            rs.close();
            connection.close();
            return list;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public void UpdateStudent(int studentSerial, String newname) {

        this.getConnection();
        String sql = "update recapJDBC set name=? where id=?";

        try
        {
            ps = connection.prepareStatement(sql);
            ps.setString(1, newname);
            ps.setInt(2, studentSerial);
            ps.executeUpdate();
            ps.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int studentSerial) {
        this.getConnection();
        String sql ="delete from recapJDBC where id=?";

        try
        {
            ps = connection.prepareStatement(sql);
            ps.setInt(1,studentSerial);
            ps.executeUpdate();
            ps.close();
            connection.close();

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public List<Student> searchStudentByName(String nameKeyword) {
        List<Student> list = new ArrayList<>();
        Student std = null;
        this.getConnection();
        String sql = "SELECT * FROM recapJDBC WHERE name LIKE ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + nameKeyword + "%"); // partial match using LIKE
            rs = ps.executeQuery();

            while (rs.next()) {
                std = new Student();
                std.setId(rs.getInt("id"));
                std.setName(rs.getString("name"));
                list.add(std);
            }

            ps.close();
            rs.close();
            connection.close();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
