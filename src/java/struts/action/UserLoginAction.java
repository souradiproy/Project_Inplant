/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import hibernate.helper.InsertPlant;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author rahul
 */
public class UserLoginAction {
    private String loginName;
    private String password;
    
    
    public String execute() throws Exception 
    {   
        ValueStack stack = ActionContext.getContext().getValueStack();
        Map<String, Object> context = new HashMap<String, Object>();
        
        hibernate.pojo.TblUsers user;
    
        Session s=hibernate.helper.NewHibernateUtil.getSessionFactory().openSession();
        user=(hibernate.pojo.TblUsers)s.get(hibernate.pojo.TblUsers.class, loginName);
        
        //Hibernate.initialize(user.getTblPlant().getIPlantId());
        
        Map session = (Map) ActionContext.getContext().get("session");
        session.put("user", user);
        
        if(user == null)
        {
            // wrong username
            return "invalid_username";
        }
        
        if(user.getSPassword().equals(password)) // valid user
        {
            context.put("user", user); // put user id in the valuestack
            stack.push(context); //push the object that is to be accessed
            return "success";
        }
        else // wrong password
        {
            return "invalid_password";
        }
    }
    
    
    public UserLoginAction() {
    }
    
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
