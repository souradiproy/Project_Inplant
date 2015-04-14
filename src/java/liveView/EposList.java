/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveView;

import java.util.Collections;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Jonty
 */
public class EposList 
{
    Session session = null;
    private List<hibernate.pojo.TblEpos> eposList = null;

    public EposList() 
    {
        this.session = hibernate.helper.NewHibernateUtil.getSessionFactory().openSession();
    }

    /**List<etrans.TblVehicleFlight> TripDataList = null;
        
     * @return the eposList
     */
    
    
    public List<hibernate.pojo.TblEpos> getEposList() 
    {
        try 
        {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery ("FROM hibernate.pojo.TblEpos");
            eposList = (List<hibernate.pojo.TblEpos>) q.list();
            Collections.sort(eposList);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            this.session.close();
        }
        return eposList;
    }
    
}
