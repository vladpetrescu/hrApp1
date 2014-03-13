package ro.leasing.actions;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import ro.leasing.domain.User;


public class UserAction extends BaseAction {

    public ActionForward login(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        List<User> userList = getCtxHolder().getDaoManager().getUserDao().getUsersList();
        userList.get(0).getRole().getId();
        return mapping.findForward("success");
    }
}
