
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        Registry reg=LocateRegistry.createRegistry(2000);
        System.out.println("Server is ready");
        CheckLogin cl=new CheckLogin();
        reg.bind("Auth",cl);//uniqueid=Auth
    }
}
