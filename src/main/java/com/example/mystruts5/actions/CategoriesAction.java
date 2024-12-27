package com.example.mystruts5.actions;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class CategoriesAction extends DispatchAction {
    @Override
    protected ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<String> categories= Arrays.asList("Diary","Snacks","Clothing","Digitals");
        request.setAttribute("myCategories",categories);
        return mapping.findForward("categoriesSuccess");
    }
}
