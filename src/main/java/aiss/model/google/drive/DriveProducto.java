package aiss.model.google.drive;

public class DriveProducto {
	
	private String titulo;
	private String url;
	private String id;

	
	public DriveProducto(String tit, String ur, String i){
		titulo= tit;
		url= ur;
		id=i;
	}
	
	
	public  String getTitulo(){
		return titulo;
	}
	public String getUrl(){
		return url;
	}
	public String getId(){
		return id;
	}

}
