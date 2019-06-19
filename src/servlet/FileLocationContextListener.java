package servlet;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FileLocationContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { 
    
    	
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
    
    	String rootPath = System.getProperty("catalina.home");
    	ServletContext ctx = arg0.getServletContext();
    	String pathRiassuntiDaVerificare = ctx.getInitParameter("directory_riassunti_da_verificare.dir");
    	String pathRiassuntiVerificati = ctx.getInitParameter("directory_riassunti.dir");
    	File fileNotCheck = new File(rootPath + File.separator + pathRiassuntiDaVerificare);
    	if(!fileNotCheck.exists()) 
    		fileNotCheck.mkdirs();
    	System.out.println("Cartella creata per inserirci i file da verificare");
    	
    	File CheckedFile = new File(rootPath + File.separator + pathRiassuntiVerificati);
    	if(!CheckedFile.exists()) 
    		CheckedFile.mkdirs();
    	System.out.println("Cartella creata per inserirci i file verificati");
    	
    	ctx.setAttribute("DIR_NOT_CHECKED_FILE", fileNotCheck);
    	ctx.setAttribute("DIR_CHECKED_FILE", CheckedFile);
    	ctx.setAttribute("DIR_NOT_CHECKED", rootPath + File.separator + pathRiassuntiDaVerificare);
    	ctx.setAttribute("DIR_CHECKED", rootPath + File.pathSeparator + pathRiassuntiVerificati);
    }
	
}
