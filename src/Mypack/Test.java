package Mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*; 					// import list


@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Test() {
        super(); 
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		List<Users> list = ExportUsers.Exportusers();
		
	
		
		out.println("<head>"); 
		out.println("<title>ket qua</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table border ='1' ");
		out.println("<tr");
		
		
		for (Users users : list)                   // User :đối tượng , tv=users : biến, list : lấy list dòng 33,lấy kiểu dữ liệu list dc truy xuất trong ExportUsers.java
		{
			out.println("<td>+users.getName1()+</td>");  // lệnh FOR  để lặp ô tr trong table. khỏi tạo mất công
			out.println("<td>+users.getName2()+</td>");
		}
		
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

}
