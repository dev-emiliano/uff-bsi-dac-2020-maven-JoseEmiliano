/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author viter
 */
@WebServlet("/alomundo")
public class HelloServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"pt-br\">");
            out.println("<head>");
            out.println("   <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
            out.println("    <meta charset=\"utf-8\">");
            out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
            out.println("   <meta name=\"description\" content=\"\">");
            out.println("   <meta name=\"author\" content=\"\">");
            out.println("    <title>Servlet HelloServlet</title>");
            out.println("    <link rel=\"icon\" href=\"https://upload.wikimedia.org/wikipedia/commons/e/ef/Logo_UFF_%28blue%29.svg\">");
            out.println("   <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"css/jj.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"fontawesome/css/all.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"fontawesome/css/fontawesome.min.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"css/jumbotron.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav id=\"navbar\" class=\"navbar navbar-custom navbar-light navbar-expand-lg fixed-top\">");
            out.println("   <div id=\"navbarcont\" class=\"container\">");
            out.println("       <a class=\"navbar-brand\" href=\"index.html\">");
            out.println("           <img src=\"https://upload.wikimedia.org/wikipedia/commons/e/ef/Logo_UFF_%28blue%29.svg\" alt=\"\" width=\"120\" height=\"80\">");
            out.println("       </a>");
            out.println("       <ul class=\"navbar-nav ml-auto\">");
            out.println("           <li class=\"nav-item active\">");
            out.println("               <img src=\"https://sites.google.com/a/ic.uff.br/fernanda/_/rsrc/1489691433727/home/logo-ic-uff.png\" alt=\"\" width=\"120\" height=\"80\">");
            out.println("           </li>");
            out.println("       </ul>");
            out.println("   </div>");
            out.println("</nav>");
            out.println("<main role=\"main\">");
            out.println("    <div class=\"jumbotron\">");
            out.println("       <div class=\"container\">");
            out.println("           <h1 class=\"display-3\">HelloWorld utilizando Servlet!</h1>");
            out.println("           <br>");
            out.println("           <p>" + request.getContextPath() + " Estamos utilizando o Servlet da classe HelloServlet! ");
            out.println("           </p>");
            out.println("       </div>");
            out.println("   </div>");
            out.println("    <div class=\"container\">");
            out.println("       <div class=\"row\">");
            out.println("           <div class=\"col-lg-4\">");
            out.println("               <p>Clique abaixo para voltar para a Página Inicial</p>");
            out.println("               <p><a class=\"btn btn-secondary btn-lg\" href=\".\\index.html\" role=\"button\">Voltar</a></p>");
            out.println("           </div>");
            out.println("       </div>");
            out.println("       <hr>");
            out.println("   </div>");
            out.println("</main>");
            out.println("<footer class=\"container\">");
            out.println("   <p>© Copyright 2021 · José Emiliano Bertholdo Júnior · Instituto de Computação/UFF · Desenvolvimento de Aplicações Corportativas</p>");
            out.println("</footer>");
            out.println("<script src=\"js/jquery-3.4.1.min.js\"></script>");
            out.println("<script src=\"js/popper.min.js\"></script>");
            out.println("<script src=\"js/bootstrap.min.js\"></script>");
            out.println("<script src=\"js/jj.js\"></script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String msg = "";
        
        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        switch(lang){
            case "pt":
                msg = "Alô, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
        }
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "amiguinho";
        
        msg = msg+nome+"!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"pt-br\">");
            out.println("<head>");
            out.println("   <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
            out.println("    <meta charset=\"utf-8\">");
            out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
            out.println("   <meta name=\"description\" content=\"\">");
            out.println("   <meta name=\"author\" content=\"\">");
            out.println("    <title>Servlet HelloServlet</title>");
            out.println("    <link rel=\"icon\" href=\"https://upload.wikimedia.org/wikipedia/commons/e/ef/Logo_UFF_%28blue%29.svg\">");
            out.println("   <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"css/jj.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"fontawesome/css/all.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"fontawesome/css/fontawesome.min.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"css/jumbotron.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav id=\"navbar\" class=\"navbar navbar-custom navbar-light navbar-expand-lg fixed-top\">");
            out.println("   <div id=\"navbarcont\" class=\"container\">");
            out.println("       <a class=\"navbar-brand\" href=\"index.html\">");
            out.println("           <img src=\"https://upload.wikimedia.org/wikipedia/commons/e/ef/Logo_UFF_%28blue%29.svg\" alt=\"\" width=\"120\" height=\"80\">");
            out.println("       </a>");
            out.println("       <ul class=\"navbar-nav ml-auto\">");
            out.println("           <li class=\"nav-item active\">");
            out.println("               <img src=\"https://sites.google.com/a/ic.uff.br/fernanda/_/rsrc/1489691433727/home/logo-ic-uff.png\" alt=\"\" width=\"120\" height=\"80\">");
            out.println("           </li>");
            out.println("       </ul>");
            out.println("   </div>");
            out.println("</nav>");
            out.println("<main role=\"main\">");
            out.println("    <div class=\"jumbotron\">");
            out.println("       <div class=\"container\">");
            out.println("           <h1 class=\"display-3\">HelloWorld utilizando Servlet!</h1>");
            out.println("           <br>");
            out.println("           <p>" + msg + " Estamos utilizando o Servlet da classe HelloServlet!");
            out.println("           </p>");
            out.println("       </div>");
            out.println("   </div>");
            out.println("    <div class=\"container\">");
            out.println("       <div class=\"row\">");
            out.println("           <div class=\"col-lg-4\">");
            out.println("               <p>Clique abaixo para voltar para a Página Inicial</p>");
            out.println("               <p><a class=\"btn btn-secondary btn-lg\" href=\".\\index.html\" role=\"button\">Voltar</a></p>");
            out.println("           </div>");
            out.println("       </div>");
            out.println("       <hr>");
            out.println("   </div>");
            out.println("</main>");
            out.println("<footer class=\"container\">");
            out.println("   <p>© Copyright 2021 · José Emiliano Bertholdo Júnior · Instituto de Computação/UFF · Desenvolvimento de Aplicações Corportativas</p>");
            out.println("</footer>");
            out.println("<script src=\"js/jquery-3.4.1.min.js\"></script>");
            out.println("<script src=\"js/popper.min.js\"></script>");
            out.println("<script src=\"js/bootstrap.min.js\"></script>");
            out.println("<script src=\"js/jj.js\"></script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg = "";
        
        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        switch(lang){
            case "pt":
                msg = "Alô, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
            case "de":
                msg = "Hallo, ";
                break;
        }
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = msg+nome+"!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"pt-br\">");
            out.println("<head>");
            out.println("   <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
            out.println("    <meta charset=\"utf-8\">");
            out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
            out.println("   <meta name=\"description\" content=\"\">");
            out.println("   <meta name=\"description\" content=\"\">");
            out.println("   <meta name=\"author\" content=\"\">");
            out.println("    <title>Servlet HelloServlet</title>");
            out.println("    <link rel=\"icon\" href=\"https://upload.wikimedia.org/wikipedia/commons/e/ef/Logo_UFF_%28blue%29.svg\">");
            out.println("   <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"css/jj.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"fontawesome/css/all.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"fontawesome/css/fontawesome.min.css\">");
            out.println("   <link rel=\"stylesheet\" href=\"css/jumbotron.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav id=\"navbar\" class=\"navbar navbar-custom navbar-light navbar-expand-lg fixed-top\">");
            out.println("   <div id=\"navbarcont\" class=\"container\">");
            out.println("       <a class=\"navbar-brand\" href=\"index.html\">");
            out.println("           <img src=\"https://upload.wikimedia.org/wikipedia/commons/e/ef/Logo_UFF_%28blue%29.svg\" alt=\"\" width=\"120\" height=\"80\">");
            out.println("       </a>");
            out.println("       <ul class=\"navbar-nav ml-auto\">");
            out.println("           <li class=\"nav-item active\">");
            out.println("               <img src=\"https://sites.google.com/a/ic.uff.br/fernanda/_/rsrc/1489691433727/home/logo-ic-uff.png\" alt=\"\" width=\"120\" height=\"80\">");
            out.println("           </li>");
            out.println("       </ul>");
            out.println("   </div>");
            out.println("</nav>");
            out.println("<main role=\"main\">");
            out.println("    <div class=\"jumbotron\">");
            out.println("       <div class=\"container\">");
            out.println("           <h1 class=\"display-3\">HelloWorld utilizando Servlet!</h1>");
            out.println("           <br>");
            out.println("           <p>" + msg + " Estamos utilizando o Servlet da classe HelloServlet! ");
            out.println("           </p>");
            out.println("       </div>");
            out.println("   </div>");
            out.println("    <div class=\"container\">");
            out.println("       <div class=\"row\">");
            out.println("           <div class=\"col-lg-4\">");
            out.println("               <p>Clique abaixo para voltar para a Página Inicial</p>");
            out.println("               <p><a class=\"btn btn-secondary btn-lg\" href=\".\\index.html\" role=\"button\">Voltar</a></p>");
            out.println("           </div>");
            out.println("       </div>");
            out.println("       <hr>");
            out.println("   </div>");
            out.println("</main>");
            out.println("<footer class=\"container\">");
            out.println("   <p>© Copyright 2021 · José Emiliano Bertholdo Júnior · Instituto de Computação/UFF · Desenvolvimento de Aplicações Corportativas</p>");
            out.println("</footer>");
            out.println("<script src=\"js/jquery-3.4.1.min.js\"></script>");
            out.println("<script src=\"js/popper.min.js\"></script>");
            out.println("<script src=\"js/bootstrap.min.js\"></script>");
            out.println("<script src=\"js/jj.js\"></script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
