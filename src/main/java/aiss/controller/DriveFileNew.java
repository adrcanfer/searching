package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.google.drive.FileItem;
import aiss.model.resource.GoogleDriveResource;

public class DriveFileNew extends HttpServlet {
	private static final Logger log = Logger.getLogger(DriveFileDelete.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {	
			String accessToken=(String)req.getSession().getAttribute("GoogleDrive-token");
			
			String title=req.getParameter("title");//Titulo producto
			String content=req.getParameter("url");//URL
			
			String titulo = "Searching#"+title+"#"+content;
			
			if(accessToken!=null && !"".equals(accessToken)){
				
				if(title!=null && !"".equals(title)){
					System.out.println("1");
					GoogleDriveResource gdResource=new GoogleDriveResource(accessToken);
					System.out.println("2");
					FileItem file = new FileItem();
					System.out.println("3");
					file.setTitle(titulo);//Cambiamos el titulo al nuevo creado
					System.out.println("4");
					file.setMimeType("text/plain");
					System.out.println("5");
					gdResource.insertFile(file, content);//Llamamos a la operacion de insertar un archivo
					System.out.println("6");
					req.setAttribute("message", "File '"+title+"' added to your Drive!");
					System.out.println("7");
					req.getRequestDispatcher("/googleDriveListing").forward(req,resp);
					
				
				}else{
					req.setAttribute("message", "You must provide a valid title for file");
					req.setAttribute("content", content);
					req.getRequestDispatcher("productos.jsp").forward(req,resp);
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
