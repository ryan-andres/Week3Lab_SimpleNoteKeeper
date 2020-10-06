package servlets;

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NoteServlet extends HttpServlet {



  
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");           
               BufferedReader br = new BufferedReader(new FileReader(new File(path)));

              
               Note note = new Note( br.readLine(),  br.readLine() );
               request.setAttribute("note", note);
            
              String edit = request.getParameter("edit");
               if( edit != null ){
               getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
             }else{
               getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
               }  
            
    }
            



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
      
    }
}





