package application;


import javafx.stage.Stage;

public class ProxyDownloadController implements GenericController{

	private Stage stage;
	
	public Stage launch(Stage s) throws Exception  {
		this.stage = s;
		EffectiveDownloadController ps = new EffectiveDownloadController();
		preload();
		stage = ps.launch(stage);
		return stage;
	}
	
	private void preload() throws InterruptedException {
		System.out.println("Caricamento dell'alert download");
		Thread.sleep(3);
	}

}