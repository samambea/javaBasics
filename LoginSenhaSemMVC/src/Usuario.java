public class Usuario {
    private String login;
    private String senha;
    
    public void SetLogin(String log){
        this.login = log;
    }
    public void SetSenha(String sen){
        this.senha = sen;
    }
    public boolean Validar(){
        if(this.login.equals("bea") && this.senha.equals("2711")){
            return true;
        }
        else return false;
 
    }
}
