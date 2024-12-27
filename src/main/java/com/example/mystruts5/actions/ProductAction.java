package com.example.mystruts5.actions;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductAction extends DispatchAction {
   private static List<String> products=new ArrayList<>();
    @Override
    protected ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String myCategory= request.getParameter("myCategories");
        switch (myCategory){
            case "Diary":
                products.add(Arrays.asList("MIlk","Khame").toString());
        break;   case "Snacks":
                products.add(Arrays.asList("Chips","Pofak").toString());
        break;    case "Books":
                products.add(Arrays.asList("JavaPrograming","C++").toString());
        break;   case "Clothing":
                products.add(Arrays.asList("T-Shirt","Jacket").toString());
        break;case "Digital":
                products.add(Arrays.asList("SmartPhone","Laptop").toString());
        break;

        }

        return mapping.findForward("productSuccess");
    }
}
