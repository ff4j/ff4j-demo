package org.ff4j.sample.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.ServletWebRequest;

@Controller
public class SecurityController implements ErrorController {
    
    /** Some Path. */
    private static final String ERROR_PATH = "/error";

    @Autowired
    private ErrorAttributes errorAttributes;
    
    @RequestMapping(ERROR_PATH)
    String error(HttpServletRequest request, Model model) {
        Map<String, Object> errorMap = errorAttributes.getErrorAttributes(new ServletWebRequest(request), false);
        model.addAttribute("errors", errorMap);
        return "error";
    }

    /** {@inheritDoc} */
    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }    

}
