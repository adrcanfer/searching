package aiss.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.google.drive.DriveProducto;
import aiss.model.google.drive.FileItem;
import aiss.model.google.drive.Files;
import aiss.model.resource.GoogleDriveResource;

public class DriveFileListController extends HttpServlet {
	private static final Logger log = Logger.getLogger(DriveFileListController.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		String accessToken=(String)req.getSession().getAttribute("GoogleDrive-token");
		
		if(accessToken!=null && !"".equals(accessToken)){
			GoogleDriveResource gdResource=new GoogleDriveResource(accessToken);
			Files files= gdResource.getFiles();//Obtengo todos los ficheros, lista de FileItem
			
			if(files!=null){
			
			//Lista que vamos a pasar a la pagina favoritos.jsp
			List<DriveProducto> lista= new ArrayList<DriveProducto>();
			
			for (FileItem f : files.getItems()) {
				if (f.getTitle().contains("Searching")){
					
					String[] cadena= f.getTitle().split("#");
					
					if(cadena.length == 3){
						DriveProducto dr = new DriveProducto(cadena[1], cadena[2], f.getId());
						//cadena[1] contiene en titulo.
						//cadena[2] contiene la url del producto.
						//El id nos va a servir para borrar el producto.
						lista.add(dr);
					}
				}
			}
			//Le pasamos a la pagina jsp los productos con el nuevo titulo
				req.setAttribute("files", lista);
				req.getRequestDispatcher("/favoritos.jsp").forward(req,resp);
				
			//Files == null	
			}else{
				log.info("The files returned are null... probably your token has experied. Redirecting to OAuth servlet.");
				req.getRequestDispatcher("/AuthController/GoogleDrive").forward(req,resp);
			}
			//clave de acceso == null
		}else{
			log.info("Trying to acces to google drive without an acces token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/GoogleDrive").forward(req,resp);
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req,resp);
	}
}
