package taxi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import taxi.exception.AuthenticationException;
import taxi.lib.Injector;
import taxi.model.Driver;
import taxi.service.AuthenticationService;

public class LoginController extends HttpServlet {
    private static final String SESSION_DRIVER_ID_ATTRIBUTE = "driver_id";
    private static final Injector injector = Injector.getInstance("taxi");
    private final AuthenticationService authenticationService =
            (AuthenticationService) injector.getInstance(AuthenticationService.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String driverName = req.getParameter("login");
        String password = req.getParameter("password");
        try {
            Driver driver = authenticationService.login(driverName, password);
            HttpSession session = req.getSession();
            session.setAttribute(SESSION_DRIVER_ID_ATTRIBUTE, driver.getId());
            resp.sendRedirect("/index");
        } catch (AuthenticationException e) {
            req.setAttribute("errorMsg", e.getMessage());
            req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req,resp);
        }
    }
}
