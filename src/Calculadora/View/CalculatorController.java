package Calculadora.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class CalculatorController {

    @FXML
    private Label etiqueta;
  
    private boolean digito = false;
    private boolean punto = false;
    private int numOperandos = 0;
    private double Operando1;
    private double Operando2;
    private char Operador = ' ';

    @FXML
    private void clickCero(ActionEvent e){  
        MostrarPorPantalla("0");
    }

    @FXML
    private void clickUno(ActionEvent e) {
        MostrarPorPantalla("1");
    }

    @FXML
    private void clickDos(ActionEvent e) {
        MostrarPorPantalla("2");
    }

    @FXML
    private void clickTres(ActionEvent e){  
        MostrarPorPantalla("3");
    }

    @FXML
    private void clickCuatro(ActionEvent e) {
        MostrarPorPantalla("4");
    }
    
    @FXML
    private void clickCinco(ActionEvent e) {
        MostrarPorPantalla("5");
    }
    
    @FXML
    private void clickSeis(ActionEvent e) {
        MostrarPorPantalla("6");
    }
    
    @FXML
    private void clickSiete(ActionEvent e) {
        MostrarPorPantalla("7");
    }
    
    @FXML
    private void clickOcho(ActionEvent e) {
        MostrarPorPantalla("8");
    }
    
    @FXML
    private void clickNueve(ActionEvent e) {
        MostrarPorPantalla("9");
    }

    @FXML
    private void clickPunto(ActionEvent e) {
        if(!punto && !digito){
            etiqueta.setText("0.");
            digito = true;
        }
        else if(!punto){
            String valActual = etiqueta.getText();
            etiqueta.setText(valActual + ".");
        }

        punto = true;
    }

    public void MostrarPorPantalla(String numero){

        if(!digito && numero.equals("0")){
            return;
        }

        if(!digito){
            etiqueta.setText("");
            punto = false;
        }

        String valActual = etiqueta.getText();
        etiqueta.setText(valActual + numero);
        digito = true;
    }

}
