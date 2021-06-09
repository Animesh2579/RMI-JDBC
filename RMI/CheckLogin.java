
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CheckLogin extends UnicastRemoteObject implements LoginInterface 
{
    CheckLogin() throws RemoteException
    {
        super();
    }
    
    @Override
    public boolean check(String userId, String password) throws RemoteException 
    {

//        try
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
//            PreparedStatement st=con.prepareStatement("select * from adminsignin where adminId=? and password=?");
//            st.setString(1,userId);
//            st.setString(2,password);
//            ResultSet rs=st.executeQuery();
//            if(rs.next())
//            {
//              return true;
//            }
//            else
//            {
//              return false;
//            }
//
//        }
//        catch(Exception e)
//        {
//            
//        }
//
        return userId.equals("admin") && password.equals("abc123");
    }
    
}
