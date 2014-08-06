package com.wetuo.util.fileupload;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileUpload extends BaseServlet{


	private static final long serialVersionUID = 1L;
	
	public void upload(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<script>alert('hello');history.go(-1);</script>");
		out.flush();
		out.close();
	}
}
