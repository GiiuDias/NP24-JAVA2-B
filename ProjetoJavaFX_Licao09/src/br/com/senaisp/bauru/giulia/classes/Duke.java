package br.com.senaisp.bauru.giulia.classes;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class Duke extends Group {
	private Image dukeImg;
	private ImageView dukeImgVw;
	private Image luvaImg;
	private ImageView luvaImgVw;
	private AudioClip tom;
	
	public Duke() {
		dukeImg = new Image(getClass().getResource("Images/Duke.png").toString());
		dukeImgVw = new ImageView(dukeImg);
		dukeImgVw.setFitWidth(50); //definindo 25 pixels na largura
		dukeImgVw.setPreserveRatio(true);
		dukeImgVw.setY(10);
		
		//Carregando a luva		
		luvaImg = new Image(getClass().getResource("Images/Glove.png").toString());
		luvaImgVw = new ImageView(luvaImg);
		luvaImgVw.setFitWidth(40); //definindo 40 pixels na largura
		luvaImgVw.setPreserveRatio(true);
		luvaImgVw.setX(17);
		
		//Carregando o Audio
		tom = new AudioClip(getClass().getResource("Audios/Note5.wav").toString());
				
		
		//Adicionando componentes ao grupo principal
		getChildren().addAll(dukeImgVw, luvaImgVw);
		//Colocando eventos
		criarEventos();
	}

	private void criarEventos() {
		setOnMouseClicked((me)->{
			tom.play();
			
		});
		
		//Criando o evento de arrastar
		
		setOnMouseDragged((me)->{
			double largura= this.getBoundsInLocal().getWidth() / 2;
			double altura= this.getBoundsInLocal().getWidth() / 2;
			
			//Posicionando o personagem na cena
			setLayoutX(me.getSceneX()-largura);
			setLayoutY(me.getSceneY()-altura);
		});
		}
	}