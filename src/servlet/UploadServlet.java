package servlet;

import java.io.File;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletFileUpload uploader = null;
	
	@Override
	public void init() throws ServletException {
		DiskFileItemFactory fileFactory = new DiskFileItemFactory();
		File fileDir = (File) getServletContext().getAttribute("DIR_NOT_CHECKED_FILE");
		fileFactory.setRepository(fileDir);
		this.uploader = new ServletFileUpload(fileFactory);
	}
       
    public UploadServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!ServletFileUpload.isMultipartContent(request))
			throw new ServletException("Sbagliato content type");
		try {
			List<FileItem> fileItemList = uploader.parseRequest(request);
			Iterator<FileItem> fileItemIterator = fileItemList.iterator();
			while(fileItemIterator.hasNext()) {
				FileItem item = fileItemIterator.next();
				if(item==null)
					fileItemIterator.next();
				System.out.println(item);
				System.out.println("Content-type = " + item.getContentType());
				File file = new File(request.getServletContext().getAttribute("DIR_NOT_CHECKED")+ File.separator + item.getName());
				System.out.println("Path assoluto = " + file.getAbsolutePath());
				item.write(file);
				request.getSession().setAttribute("caricamento_completato", true);
				response.sendRedirect("upload.jsp");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
