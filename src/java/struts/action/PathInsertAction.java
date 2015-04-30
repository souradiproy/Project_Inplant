/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts.action;
import hibernate.helper.Path_handler;
/**
 *
 * @author Raj-HP
 */
public class PathInsertAction {
    private String TName;
    private String addepos;
    private String Id;
    private int[] path;
    
    public String execute() throws Exception{
        String temp=new String();
        int k=0;
        for(int i=0 ; i < addepos.length() ; i++)
        {
            if(addepos.charAt(i) != '#')
            {
                temp+=addepos.charAt(i);
            }
            else
            {
                path[k]=Integer.parseInt(temp);
                temp="";
            }
        }
        Path_handler p = new Path_handler();
        String result = p.insert_into_table(Integer.parseInt(Id),TName,path);
        return result;
    }
            
    
    public String getTName() {
        return TName;
    }

    public void setTName(String TName) {
        this.TName = TName;
    }

    public String getAddepos() {
        return addepos;
    }

    public void setAddepos(String addepos) {
        this.addepos = addepos;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    
}
