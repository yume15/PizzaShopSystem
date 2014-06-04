package jp.iwasaki;

import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;

    @Persistent
    private String name;    
    
    @Persistent
    private String maisuu;
     
    @Persistent
    private String address;
     
    @Persistent
    private String tel;
     
    @Persistent
    private Date datetime;
 
    public LinkData(String name, String maisuu, String address, String tel, Date datetime) {
        super();
        this.name = name;
        this.maisuu = maisuu;
        this.address = address;
        this.tel = tel;
        this.datetime = datetime;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }   
    
    public String getMaisuu() {
        return maisuu;
    }
 
    public void setMaisuu(String maisuu) {
        this.maisuu = maisuu;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public String getTel() {
        return tel;
    }
 
    public void setTel(String tel) {
        this.tel = tel;
    }
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
