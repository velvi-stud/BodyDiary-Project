package application;


import javafx.stage.Stage;

public class HomeController implements GenericController{

	private Stage stage;
	
	public Stage launch(Stage s) throws Exception  {
		this.stage = s;
		GenericController ps = new EffectiveHomeController();
		preload();
		stage = ps.launch(stage);
		return stage;
	}
	
	private void preload() throws InterruptedException {
		System.out.println("Caricamento della pagina home");
		Thread.sleep(3);
	}

}