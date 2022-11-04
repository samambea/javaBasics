import javax.swing.JOptionPane;

public class ControleUsuario {
    Usuario user = new Usuario();
    public void logar(String log, String sen){
        user.SetLogin(log);
        user.SetSenha(sen);
        boolean status = user.Validar();
        if(status == true) {
            new MenuSistema().setVisible(true);
        }
        else JOptionPane.showMessageDialog(null, "Acesso ao sistema negado.\nLogin ou senha incoretos");
    }
}
