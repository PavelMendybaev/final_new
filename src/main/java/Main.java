
import dao.UserDao;
import dao.UserDaoHibernateImpl;
import service.UserService;
import service.UserServiceImpl;

import java.sql.SQLException;




public class Main {

    private static UserService service = new UserServiceImpl();




    public static void main(String[] args) throws SQLException
    {



        service.createUsersTable();
        service.saveUser("name" , "lastname" , (byte)18);
        service.removeUserById(1);
        service.cleanUsersTable();
        service.dropUsersTable();
        System.out.println("Успешно");
    }

}
