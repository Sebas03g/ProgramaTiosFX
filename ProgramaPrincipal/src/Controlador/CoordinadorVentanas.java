package Controlador;

import Modelo.Inventario;
import Modelo.ObjetoListar;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class CoordinadorVentanas {

    public static void abrirVentanaPrincipal(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(CoordinadorVentanas.class.getResource("../Vista/PaginaPrincipal.fxml"));
        Parent root = loader.load();
        stage.setTitle("Pagina Principal");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }

    public static <T extends ObjetoListar> void abrirVentanaLista(ObjetoListar objetoListar) throws Exception {
        FXMLLoader loader = new FXMLLoader(CoordinadorVentanas.class.getResource("../Vista/VistaListar.fxml"));
        Parent root = loader.load();

        // Obtener el controlador y pasarle los datos
        ControladorLista<T> controlador = loader.getController();
        controlador.inicializarDatos(objetoListar);

        Stage stage = new Stage();
        stage.setTitle(objetoListar.obtenerTitulo());
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static <T extends ObjetoListar> void abrirVentanaInventario(ObjetoListar objeto, String id) throws Exception {
        FXMLLoader loader = new FXMLLoader(CoordinadorVentanas.class.getResource("../Vista/VistaElementoInventario.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }


}
