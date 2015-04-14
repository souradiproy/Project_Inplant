package hibernate.pojo;
// Generated 5 Apr, 2015 5:42:46 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * TblLinks generated by hbm2java
 */
public class TblLinks  implements java.io.Serializable {


     private BigDecimal ILid;
     private TblEpos tblEposByITo;
     private TblEpos tblEposByIFrom;
     private TblPlant tblPlant;
     private Serializable intervalTimediff;
     private BigDecimal ICost;

    public TblLinks() {
    }

	
    public TblLinks(BigDecimal ILid, TblPlant tblPlant) {
        this.ILid = ILid;
        this.tblPlant = tblPlant;
    }
    public TblLinks(BigDecimal ILid, TblEpos tblEposByITo, TblEpos tblEposByIFrom, TblPlant tblPlant, Serializable intervalTimediff, BigDecimal ICost) {
       this.ILid = ILid;
       this.tblEposByITo = tblEposByITo;
       this.tblEposByIFrom = tblEposByIFrom;
       this.tblPlant = tblPlant;
       this.intervalTimediff = intervalTimediff;
       this.ICost = ICost;
    }
   
    public BigDecimal getILid() {
        return this.ILid;
    }
    
    public void setILid(BigDecimal ILid) {
        this.ILid = ILid;
    }
    public TblEpos getTblEposByITo() {
        return this.tblEposByITo;
    }
    
    public void setTblEposByITo(TblEpos tblEposByITo) {
        this.tblEposByITo = tblEposByITo;
    }
    public TblEpos getTblEposByIFrom() {
        return this.tblEposByIFrom;
    }
    
    public void setTblEposByIFrom(TblEpos tblEposByIFrom) {
        this.tblEposByIFrom = tblEposByIFrom;
    }
    public TblPlant getTblPlant() {
        return this.tblPlant;
    }
    
    public void setTblPlant(TblPlant tblPlant) {
        this.tblPlant = tblPlant;
    }
    public Serializable getIntervalTimediff() {
        return this.intervalTimediff;
    }
    
    public void setIntervalTimediff(Serializable intervalTimediff) {
        this.intervalTimediff = intervalTimediff;
    }
    public BigDecimal getICost() {
        return this.ICost;
    }
    
    public void setICost(BigDecimal ICost) {
        this.ICost = ICost;
    }




}


