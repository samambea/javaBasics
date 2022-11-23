
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ControleNota {
    public void Conexao(){
        String servername="localhost:3306";
        String mydatabase="bd_notas_aluno";
        String username="root";
        String password="";
        
        String drivername="com.mysql.cj.jdbc.Driver";
        Class.forName(drivername);
        
        String url="jdbc:mysql://"+ servername+"/"mydatabase+"?useTimezone=true&server=UTC";
        conexao = DriverManager.getConnetion(url, username, password);
        comando = conexao.createStatement();
           
    }
    catch(ClassNotFoundException e){
    System.out.println("Driver não encontrado");
}
    catch (Exception e){
            System.out.println("Erro de conexão ao Banco de Dados");
            }
}

