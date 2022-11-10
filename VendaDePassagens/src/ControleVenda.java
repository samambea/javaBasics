import javax.swing.*;

public class ControleVenda {    
    Venda v = new Venda();
    public void SubmitPassagem(String dest, int pass,  double peso){
        v.setDestino(dest);
        v.setNpassagem(pass);
        v.setPeso(peso);
    }
    // ok
    public double CalcPassagem(){
        if(v.getDestino().equalsIgnoreCase("MG")){
            v.totPassagem = 300 * v.getNpassagem();
        }
        else if (v.getDestino().equalsIgnoreCase("RJ")) {
            v.totPassagem = 250 * v.getNpassagem();
        }
        else if (v.getDestino().equalsIgnoreCase("ES")) {
            v.totPassagem = 450 * v.getNpassagem();
        }
        else {
            JOptionPane.showMessageDialog(null,"Destino inválido.\nInsira uma das seguintes UFs:\nMG (Minas Gerais)\nRJ (Rio de Janeiro)\nES (Espírito Santo)");
        }
        return v.totPassagem;
    }
    public double CalcBagagem(){
        if (v.getPeso() <= 5.00){
            v.totCusto = 0;
        }
        else if (v.getPeso() > 5.00){
            v.totCusto = v.getPeso() * 1.00;
        }
        return v.totCusto;
    }
    public double CalcTotal(){
        v.total = v.totCusto + v.totPassagem;
        return v.total;
    }
    public void ConfirmarPassagem(){
        JOptionPane.showMessageDialog(null,"Orçamento confirmado! Sua viagem para "+v.getDestino()+" custará:\nNúmero de Passagens: "
                                        +v.getNpassagem()+"\nCusto total das passagens: R$"+v.totPassagem+"\nPeso total das bagagens: "+v.getPeso()
                                        +"kg\nCusto total das bagagens: R$"+v.totCusto+"\nCusto total da viagem: R$"+v.total+"\nBoa Viagem!");

    }
    public void CancelarPassagem(){
        JOptionPane.showMessageDialog(null,"Orçamento cancelado!");
    }
}
