package Controlador;

import java.net.URL;

import java.util.ResourceBundle;

import Metodos.Metodo;
import Modelo.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import javax.swing.*;

public class FormularioController implements Initializable {
    @FXML
    private ToggleGroup Sexo;
    Cliente cliente = new Cliente();
    Metodo m = new Metodo();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton R_Fe;

    @FXML
    private RadioButton R_masc;

    @FXML
    private TextField Txt_Apellidos;

    @FXML
    private ComboBox<String> Txt_Barrio;
    private String[] B = { "", "Robles", "Las cayenas" };

    @FXML
    private ComboBox<String> Txt_Muni;
    private String[] C = { "", "Barranquilla", "soledad" };

    @FXML
    private TextField Txt_cedula;

    @FXML
    private ComboBox<String> Txt_estra;
    private String[] estra = { "", "1", "2", "3", "4", "5", "6" };

    @FXML
    private TextField Txt_nombres;

    @FXML
    private TextField Txt_referencia;

    @FXML
    private Button btn_Save;

    @FXML
    private Button btn_nu;

    @FXML
    void R_Fem(ActionEvent event) {

    }

    @FXML
    void R_ma(ActionEvent event) {

    }




    @FXML
    void btn_Guardar(ActionEvent event) {
        int referencia = Integer.parseInt(this.Txt_referencia.getText());
        int cedula = Integer.parseInt(this.Txt_cedula.getText());
        String nombre = this.Txt_nombres.getText();
        String apellidos = this.Txt_Apellidos.getText();
        String muni = Txt_Muni.getSelectionModel().getSelectedItem();
        String barrio = Txt_Barrio.getSelectionModel().getSelectedItem();
        String estrato = Txt_estra.getSelectionModel().getSelectedItem();
        String sexo1 = eventoRadio();

        cliente.setReferencia(String.valueOf(referencia));
        cliente.setCedula(String.valueOf(cedula));
        cliente.setNombres(nombre);
        cliente.setApellidos(apellidos);
        cliente.setMunicipio(muni);
        cliente.setBarrio(barrio);
        cliente.setEstrato(estrato);
        cliente.setSexo(sexo1);

        m.guardarTXT(cliente);
        limpiarCampos();

    }

    @FXML
    void btn_nuevo(ActionEvent event) {

    }

    @FXML
    void cmb_Barrio(ActionEvent event) {

    }

    @FXML
    void cmb_estrato(ActionEvent event) {

    }

    @FXML
    void cmb_muni(ActionEvent event) {

    }

    @FXML
    void eventoRadio(ActionEvent event) {

    }

    @FXML

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // asociar raddio buttons
        ToggleGroup tg = new ToggleGroup();
        this.R_masc.setToggleGroup(tg);
        this.R_Fe.setToggleGroup(tg);

        Txt_Muni.getItems().addAll(C);
        Txt_estra.getItems().addAll(estra);
        Txt_Barrio.getItems().addAll(B);
    }

    @FXML
    public String eventoRadio() {
        String sexo = "";
        if (R_masc.isSelected()) {
            sexo = R_masc.getText();
        } else if (R_Fe.isSelected()) {
            sexo = R_Fe.getText();
        } else {
            JOptionPane.showMessageDialog(null, "algo salio mal");
        }
        return sexo;

    }

    public void limpiarCampos() {

        Txt_referencia.setText("");
        Txt_cedula.setText("");
        Txt_nombres.setText("");
        Txt_Apellidos.setText("");
        Txt_nombres.setText("");
        //Txt_estra.setSelected Index(0);
    }

}
