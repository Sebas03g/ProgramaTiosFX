package Controlador;

import Modelo.Inventario;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.util.Map;

public class ControladorElementoInventario {
    private Inventario objeto;
    private String titulo;

    @FXML
    private TableView<Map<String, String>> tablaTransacciones;

    public void inicializarDatos(String titulo, Inventario objeto) {
        this.objeto = objeto;
        this.titulo = titulo;
        // lógica para poblar la tabla con columnas, usando `mapa`...
    }

}
