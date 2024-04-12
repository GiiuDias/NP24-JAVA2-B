package br.com.senaisp.bauru.giulia.app;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Button;

public class MinhaAppController {

	@FXML MenuItem mnItTela01;
	@FXML Button btnSalvar;
	@FXML Button btnCancelar;
	@FXML public void mnItTela01Act() {
		System.out.println("Chamando Tela01");
	}
	@FXML public void btnSalvarAct() {
		System.out.println("Salvando dados");
	}
	@FXML public void btnCancelarAct() {
		System.out.println("Cancelando dados");
	}
	
}
