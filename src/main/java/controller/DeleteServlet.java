package controller;

import UserDao.UserDao;
import model.User;
import util.DbUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.applet.Applet;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.Statement;


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/user.jsp";
    private static String LIST_USER = "/listUser.jsp";
    private UserDao dao;

    public DeleteServlet() {
        super();
        dao = new UserDao();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userid = req.getParameter("userid");
        if (userid == "" || userid == null)
            req.getRequestDispatcher(LIST_USER).forward(req, resp);
        else {
            int userId = Integer.parseInt(userid);
            dao.deleteUser(userId);
            resp.sendRedirect("/read");
        }



        }
    }

