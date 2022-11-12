import javax.swing.*;
public class ControleCarga {
    
        Carga c = new Carga();
        public void SubmitCarga(String origem, String dest, String descri,  String peso){
        c.setOrigem(origem);
        c.setDestino(dest);
        c.setDescricao(descri);
        c.setPeso(peso);
     
    
    }
      public String CalcTransporteCusto(){
        if(c.getDestino().equalsIgnoreCase("MG")){
            c.custo = "50";
        }
        else if (c.getDestino().equalsIgnoreCase("RJ")) {
            c.custo = "25";
        }
        else if (c.getDestino().equalsIgnoreCase("ES")) {
            c.custo = "40";
        }
        else {
            JOptionPane.showMessageDialog(null,"Destino inválido.\nInsira uma das seguintes UFs:\nMG (Minas Gerais)\nRJ (Rio de Janeiro)\nES (Espírito Santo)");
        }
        return c.custo;
      }

    public String CalcTransporteTempo(){
        if(c.getDestino().equalsIgnoreCase("MG")){
            c.tempo = "9 dias úteis";
        }
        else if (c.getDestino().equalsIgnoreCase("RJ")) {
            c.tempo = "3 dias úteis";
        }
        else if (c.getDestino().equalsIgnoreCase("ES")) {
            c.tempo = "6 dias úteis";
        }
        else {
            JOptionPane.showMessageDialog(null,"Destino inválido.\nInsira uma das seguintes UFs:\nMG (Minas Gerais)\nRJ (Rio de Janeiro)\nES (Espírito Santo)");
        }
        return c.tempo;
    }
    public String CalcTotal(){
        c.total = c.custo;
        return c.total;
    }
        
        
    public void ConfirmarTransporte(){
        JOptionPane.showMessageDialog(null,"Orçamento confirmado!");

    }
    public void CancelarTransporte(){
        JOptionPane.showMessageDialog(null,"Orçamento cancelado!");
    }
}
