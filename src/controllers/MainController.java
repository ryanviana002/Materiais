package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {
	

	 @FXML
	    private TextField txtcodproduto;

	    @FXML
	    private TextField txtnumeropedido;

	    @FXML
	    private TextField txtvalortotalpedido;

	    @FXML
	    private TextField txtvalortroco;

	    @FXML
	    private TextField txtformapagamento;

	    @FXML
	    private DatePicker datentregapedido;

	    @FXML
	    private TextField txtquantidadeprodutopedido;

	    @FXML
	    private TextField txtcodclientepedido;

	    @FXML
	    private TextField txtnomeprodutopedido;

	    @FXML
	    private TextField txtnomeclientepedido;

	    @FXML
	    private Button btncadastrarpedido;

	    @FXML
	    private Button btnlimparpedido;

	    @FXML
	    private TextField txtcodfuncionariopedido;

	    @FXML
	    private TextField txtvalorpago;

	    @FXML
	    private TextField txtnomefuncionariopedido;

	    @FXML
	    void setpedido(ActionEvent event) {
	    	
	    }
	    
	    @FXML
	    void limparpedido(MouseEvent event) {
	    	txtnumeropedido.setText("");
	    }


}
