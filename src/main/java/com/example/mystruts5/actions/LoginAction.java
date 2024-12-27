package com.example.mystruts5.actions;

import com.example.mystruts5.forms.LoginForm;
import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends DispatchAction {
    @Override
    public ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LoginForm loginForm = (LoginForm) form;
        loginForm.setUserName("jafar");
        loginForm.setUserPassword("741020");
        return mapping.findForward("nshow");


    }

    public ActionForward checkLogin(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LoginForm loginForm = (LoginForm) form;
        String userName = loginForm.getUserName();
        String userPassword = loginForm.getUserPassword();
        if (isValid(userName,userPassword))
        {
            request.setAttribute("userName",userName);
            request.setAttribute("isValid","true");
            return mapping.findForward("show");
        }
        else
        {
            request.setAttribute("userName",userName);
            ActionErrors actionErrors = new ActionErrors();
            actionErrors.add("noAccess.message",new ActionError("noAccess.message"));
            saveErrors(request,actionErrors);
            request.setAttribute("isValid","false");
            return mapping.findForward("show");
//            return mapping.findForward("error");
        }

    }

    private boolean isValid(String userName, String userPassword) {
        //TODO
        return false;
    }
}
