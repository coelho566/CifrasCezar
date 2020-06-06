package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public TextField numero;

    @FXML
    private TextArea encode;

    @FXML
    private TextArea resultado;



    @FXML
    public void encode(ActionEvent event){

        CesarCifras cesarCifras = new CesarCifras();

        String texto = encode.getText();
        int casas = Integer.parseInt(numero.getText());

        String novoTexto = cesarCifras.encode(texto, casas);


       resultado.setText(novoTexto);


    }

    @FXML
    public void decode(ActionEvent event){

        CesarCifras cesarCifras = new CesarCifras();

        String texto = encode.getText();
        int casas = Integer.parseInt(numero.getText());

        String novoTexto = cesarCifras.decode(texto, casas);


        resultado.setText(novoTexto);


    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
