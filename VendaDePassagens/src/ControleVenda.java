import javax.swing.*;

public class ControleVenda {
    public double totPassagem;
    public double totCusto;
    public double total;
    Venda v = new Venda();
    public void SubmitPassagem(String dest, int pass,  double peso){
        v.setDestino(dest);
        v.setNpassagem(pass);
        v.setPeso(peso);
    }
    // ok
    public double CalcPassagem(){
        if(v.getDestino().equalsIgnoreCase("MG")){
            totPassagem = 300 * v.getNpassagem();
        }
        else if (v.getDestino().equalsIgnoreCase("RJ")) {
            totPassagem = 250 * v.getNpassagem();
        }
        else if (v.getDestino().equalsIgnoreCase("ES")) {
            totPassagem = 450 * v.getNpassagem();
        }
        else {
            JOptionPane.showMessageDialog(null,"Destino inválido.\nInsira uma das seguintes UFs:\nMG (Minas Gerais)\nRJ (Rio de Janeiro)\nES (Espírito Santo)");
        }
        return totPassagem;
    }
    public double CalcBagagem(){
        if (v.getPeso() <= 5.00){
            totCusto = 0;
        }
        else if (v.getPeso() > 5.00){
            totCusto = v.getPeso() * 1.00;
        }
        return totCusto;
    }
    public double CalcTotal(){
        total = totCusto + totPassagem;
        return total;
    }
    public void ConfirmarPassagem(){
        JOptionPane.showMessageDialog(null,"Orçamento confirmado! Sua viagem para "+v.getDestino()+" custará:\nNúmero de Passagens: "
                                        +v.getNpassagem()+"\nCusto total das passagens: R$"+totPassagem+"\nPeso total das bagagens: "+v.getPeso()
                                        +"kg\nCusto total das bagagens: R$"+totCusto+"\nCusto total da viagem: R$"+total+"\nBoa Viagem!");

    }
    public void CancelarPassagem(){
        JOptionPane.showMessageDialog(null,"Orçamento cancelado!");
    }
}
