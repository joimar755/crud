package Controlador;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TripleAAAController {

    @FXML
    private MenuItem Txt_B_Mu;

    @FXML
    private MenuItem Txt_B_c;

    @FXML
    private MenuItem Txt_B_n;

    @FXML
    private MenuItem Txt_registro;

    @FXML
    private MenuItem txt_codigo;

    @FXML
    private MenuItem txt_nombre;

    @FXML
    void Registro(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Formulario1.fxml"));
        try {
            Parent root = loader.load();

            FormularioController controlador = loader.getController();
            Scene sc = new Scene(root);
            Stage sg = new Stage();
            sg.initModality(Modality.APPLICATION_MODAL);
            sg.setScene(sc);
            sg.showAndWait();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    @FXML
    void Txt_B_Mu(ActionEvent event) {

    }

    @FXML
    void Txt_B_c(ActionEvent event) {

    }

    @FXML
    void Txt_B_n(ActionEvent event) {

    }

    @FXML
    void btn_codigo(ActionEvent event) {

    }

}
