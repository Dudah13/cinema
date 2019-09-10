/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoCinema;
import javax.swing.JOptionPane;
import modelo.cinema;
import tela.manutencao.ManutencaoCinema;

/**
 *
 * @author Administrador
 */
public class controladorCinema {

    public static void inserir(ManutencaoCinema man){
        cinema objeto = new cinema();
        objeto.setEndereco(man.jtfEndereco.getText());
        objeto.setCapacidade(Integer.parseInt(man.jtfCapacidade.getText()));
        
        boolean resultado = DaoCinema.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
    
}
