package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aliens") // This is optional, but you can specify a table name here
public class Alien {
    @Id
    private int aid;
    private String aname;
    private int aage;
    private String acolor;
    private String aplanet;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAage() {
        return aage;
    }

    public void setAage(int aage) {
        this.aage = aage;
    }

    public String getAcolor() {
        return acolor;
    }

    public void setAcolor(String acolor) {
        this.acolor = acolor;
    }

    public String getAplanet() {
        return aplanet;
    }

    public void setAplanet(String aplanet) {
        this.aplanet = aplanet;
    }
}
