/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import java.util.ArrayList;

/**
 *
 * @author nivi-
 */
public class ControlaFuncionario {
     private ArrayList<Funcionario> funcionario = new ArrayList<>();
     
     public boolean salvar (Funcionario f) {
     if (f != null) {
        funcionario.add(f);
        return true;
     } else {
         return false;
     }
     }
     public ArrayList<Funcionario> retornarTodos () {
         return funcionario;
             
       
     }
     public void TelaLogin () {
         
        new Principal().setVisible(true);
     }
     }

