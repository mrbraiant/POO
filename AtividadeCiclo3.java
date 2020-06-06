/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeciclo3;

import javax.swing.JOptionPane;

/**
 *
 * @author Braioso
 */
public class AtividadeCiclo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String kg, alt;
        float resultado;
        float aa;
                
        kg = JOptionPane.showInputDialog("\nPrograma para Calcular o IMC\nVamos começar!\n...\n\nDigite seu peso: ");
        int kilo = Integer.parseInt(kg);
        alt = JOptionPane.showInputDialog("Ótimo, agora digite sua altura usando (.) para calcularmos: ");
        float altura = Float.parseFloat(alt);
        float AxA = altura * altura;
                
        resultado = (kilo/AxA);
        
        if (resultado < 18.5){
            JOptionPane.showMessageDialog(null, String.format("Seu IMC é de: %.2f \nVocê está abaixo da média, seu perfil é magro.", resultado ));
        }
        if (resultado > 18.5 && resultado <= 24.9){
            JOptionPane.showMessageDialog(null, String.format("Seu IMC é de: %.2f \nParabens!!! \nVocê está na média de peso normal", resultado));
        }
        if (resultado > 25 && resultado <= 29.9){
            JOptionPane.showMessageDialog(null, String.format("Seu IMC é de: %.2f \nVocê está com sobrepeso.", resultado));
        }
        if (resultado > 30 && resultado <= 39.9){
            JOptionPane.showMessageDialog(null, String.format("Seu IMC é de: %.2f \nVocê está com obesidade.", resultado));
        }
        if (resultado > 40){
            JOptionPane.showMessageDialog(null, String.format("Seu IMC é de: %.2f \nVocê está com obesidade grave, recomendamos que marque uma consulta com médico e busque fazer atividades físicas", resultado));
        }
    }
}
