/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.helper;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.hibernate.Session;

/**
 *
 * @author Jonty
 */
public class InsertPlant 
{
    private Session session;
    public InsertPlant()
    {
        session=NewHibernateUtil.getSessionFactory().openSession();
    }
    public void insertIntoPlant()
    {
        try
        {
            org.hibernate.Transaction tx=session.beginTransaction();
            hibernate.pojo.TblPlant plantA= new hibernate.pojo.TblPlant(new BigDecimal(14));
            session.save(plantA);
            tx.commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            session.close();
        }
    }
}
