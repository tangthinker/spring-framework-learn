/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker
 * Description: demo
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-25 09:48:09:48
 */
package work.tangthinker.servlet;

import work.tangthinker.service.DemoService;
import work.tangthinker.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description: demo
 * ClassPath: work.tangthinker.servlet.DemoServlet
 *
 * @author Jon Snow
 * @since 2023/6/25 09:48
 */
@WebServlet(urlPatterns = "/hello")
public class DemoServlet extends HttpServlet {

    DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println(demoService.findAll().toString());
    }
}
