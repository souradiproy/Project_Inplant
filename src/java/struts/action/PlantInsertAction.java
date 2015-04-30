/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts.action;

import hibernate.helper.InsertPlant;
import hibernate.helper.Plant_handler;
import hibernate.pojo.TblPlant;
import java.math.BigDecimal;

/**
 *
 * @author Raj-HP
 */
public class PlantInsertAction
{

    private String TPlantName;
    private String TPlantOwner;

    public PlantInsertAction()
    {
    }

    public PlantInsertAction(String testing, String tester)
    {
        TPlantName = "testing";
        TPlantOwner = "tester";
    }

    public String getTPlantName()
    {
        return TPlantName;
    }

    public void setTPlantName(String TPlantName)
    {
        this.TPlantName = TPlantName;
    }

    public String getTPlantOwner()
    {
        return TPlantOwner;
    }

    public void setTPlantOwner(String TPlantOwner)
    {
        this.TPlantOwner = TPlantOwner;
    }

    public String execute() throws Exception
    {
        Plant_handler i = new Plant_handler();
        String result = i.insert_into_table(TPlantName, TPlantOwner);
        return result;
    }

    public static void main(String args[])
    {
        PlantInsertAction p = new PlantInsertAction("a", "b");
        try
        {
            p.execute();
        }
        catch (Exception e)
        {

        }
    }
}
