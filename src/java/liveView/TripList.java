/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveView;

import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Jonty
 */
public class TripList 
{
    Session session = null;
    private List<hibernate.pojo.TblVehicleFlight> TripList = null;
    public TripList() 
    {
        this.session = hibernate.helper.NewHibernateUtil.getSessionFactory().openSession();
    }

    /**
     * @return the TripDataList
     */
    public List<hibernate.pojo.TblVehicleFlight> getTripList() 
    {
        List<hibernate.pojo.TblMapping> tripList = null;
        try 
        {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery ("FROM hibernate.pojo.TblMapping");
            tripList = (List<hibernate.pojo.TblMapping>) q.list();
            for(hibernate.pojo.TblMapping i: tripList)
            {
                //Hibernate.initialize(i.getTblLivePath());
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            this.session.close();
        }
        return TripList;
    }
    
    
}
