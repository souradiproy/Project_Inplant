package hibernate.pojo;
// Generated 5 Apr, 2015 5:42:46 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TblDriver generated by hbm2java
 */
public class TblDriver  implements java.io.Serializable {


     private BigDecimal IDriverId;
     private TblPlant tblPlant;
     private TblTransporter tblTransporter;
     private String TDriverName;
     private String TDriverAddr1;
     private String TDriverAddr2;
     private String TDriverCity;
     private String TStateId;
     private String IDriverPin;
     private String TCountryId;
     private String TDriverEmailId;
     private String TLicenceNo;
     private Boolean BIsActive;
     private String TCreatedBy;
     private Date dtCreated;
     private String TModifiedBy;
     private Date dtModified;
     private Boolean BIsDeleted;
     private Set<TblMapping> tblMappings = new HashSet<TblMapping>(0);

    public TblDriver() {
    }

	
    public TblDriver(BigDecimal IDriverId, TblPlant tblPlant, TblTransporter tblTransporter, String TLicenceNo) {
        this.IDriverId = IDriverId;
        this.tblPlant = tblPlant;
        this.tblTransporter = tblTransporter;
        this.TLicenceNo = TLicenceNo;
    }
    public TblDriver(BigDecimal IDriverId, TblPlant tblPlant, TblTransporter tblTransporter, String TDriverName, String TDriverAddr1, String TDriverAddr2, String TDriverCity, String TStateId, String IDriverPin, String TCountryId, String TDriverEmailId, String TLicenceNo, Boolean BIsActive, String TCreatedBy, Date dtCreated, String TModifiedBy, Date dtModified, Boolean BIsDeleted, Set<TblMapping> tblMappings) {
       this.IDriverId = IDriverId;
       this.tblPlant = tblPlant;
       this.tblTransporter = tblTransporter;
       this.TDriverName = TDriverName;
       this.TDriverAddr1 = TDriverAddr1;
       this.TDriverAddr2 = TDriverAddr2;
       this.TDriverCity = TDriverCity;
       this.TStateId = TStateId;
       this.IDriverPin = IDriverPin;
       this.TCountryId = TCountryId;
       this.TDriverEmailId = TDriverEmailId;
       this.TLicenceNo = TLicenceNo;
       this.BIsActive = BIsActive;
       this.TCreatedBy = TCreatedBy;
       this.dtCreated = dtCreated;
       this.TModifiedBy = TModifiedBy;
       this.dtModified = dtModified;
       this.BIsDeleted = BIsDeleted;
       this.tblMappings = tblMappings;
    }
   
    public BigDecimal getIDriverId() {
        return this.IDriverId;
    }
    
    public void setIDriverId(BigDecimal IDriverId) {
        this.IDriverId = IDriverId;
    }
    public TblPlant getTblPlant() {
        return this.tblPlant;
    }
    
    public void setTblPlant(TblPlant tblPlant) {
        this.tblPlant = tblPlant;
    }
    public TblTransporter getTblTransporter() {
        return this.tblTransporter;
    }
    
    public void setTblTransporter(TblTransporter tblTransporter) {
        this.tblTransporter = tblTransporter;
    }
    public String getTDriverName() {
        return this.TDriverName;
    }
    
    public void setTDriverName(String TDriverName) {
        this.TDriverName = TDriverName;
    }
    public String getTDriverAddr1() {
        return this.TDriverAddr1;
    }
    
    public void setTDriverAddr1(String TDriverAddr1) {
        this.TDriverAddr1 = TDriverAddr1;
    }
    public String getTDriverAddr2() {
        return this.TDriverAddr2;
    }
    
    public void setTDriverAddr2(String TDriverAddr2) {
        this.TDriverAddr2 = TDriverAddr2;
    }
    public String getTDriverCity() {
        return this.TDriverCity;
    }
    
    public void setTDriverCity(String TDriverCity) {
        this.TDriverCity = TDriverCity;
    }
    public String getTStateId() {
        return this.TStateId;
    }
    
    public void setTStateId(String TStateId) {
        this.TStateId = TStateId;
    }
    public String getIDriverPin() {
        return this.IDriverPin;
    }
    
    public void setIDriverPin(String IDriverPin) {
        this.IDriverPin = IDriverPin;
    }
    public String getTCountryId() {
        return this.TCountryId;
    }
    
    public void setTCountryId(String TCountryId) {
        this.TCountryId = TCountryId;
    }
    public String getTDriverEmailId() {
        return this.TDriverEmailId;
    }
    
    public void setTDriverEmailId(String TDriverEmailId) {
        this.TDriverEmailId = TDriverEmailId;
    }
    public String getTLicenceNo() {
        return this.TLicenceNo;
    }
    
    public void setTLicenceNo(String TLicenceNo) {
        this.TLicenceNo = TLicenceNo;
    }
    public Boolean getBIsActive() {
        return this.BIsActive;
    }
    
    public void setBIsActive(Boolean BIsActive) {
        this.BIsActive = BIsActive;
    }
    public String getTCreatedBy() {
        return this.TCreatedBy;
    }
    
    public void setTCreatedBy(String TCreatedBy) {
        this.TCreatedBy = TCreatedBy;
    }
    public Date getDtCreated() {
        return this.dtCreated;
    }
    
    public void setDtCreated(Date dtCreated) {
        this.dtCreated = dtCreated;
    }
    public String getTModifiedBy() {
        return this.TModifiedBy;
    }
    
    public void setTModifiedBy(String TModifiedBy) {
        this.TModifiedBy = TModifiedBy;
    }
    public Date getDtModified() {
        return this.dtModified;
    }
    
    public void setDtModified(Date dtModified) {
        this.dtModified = dtModified;
    }
    public Boolean getBIsDeleted() {
        return this.BIsDeleted;
    }
    
    public void setBIsDeleted(Boolean BIsDeleted) {
        this.BIsDeleted = BIsDeleted;
    }
    public Set<TblMapping> getTblMappings() {
        return this.tblMappings;
    }
    
    public void setTblMappings(Set<TblMapping> tblMappings) {
        this.tblMappings = tblMappings;
    }




}


