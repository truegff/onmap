package ge.lanmaster.onmap.root.client.entity;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.annotation.Entity;

import javax.persistence.Id;
import java.util.Date;

@Entity
public class Visit implements IsSerializable {
    @Id
    private Long id;
    private Date date;
    private String ip;
    private String email;
    private Boolean loggedIn;
    private Boolean admin;

    private Visit() {}

    public Long getId() {
        return id;
    }

    public Boolean getLoggedIn() {

        return loggedIn;
    }

    public void setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * Visit constructor.
     * @param email
     * @param ip
     * @param loggedIn
     * @param admin
     * @param date
     */
    public Visit(String email, String ip, Boolean loggedIn, Boolean admin, Date date)
    {
        this.email = email;
        this.ip = ip;
        this.loggedIn = loggedIn;
        this.admin = admin;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
