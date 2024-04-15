package com.mycompany.xml_portability_test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "losseshazards_relation")
@XmlType(propOrder = {"id", "loss_id", "hazard_id", "created_at", "updated_at"})
public class Losseshazards_relation {
    private int id;
    private int loss_id;
    private int hazard_id;
    private String created_at;
    private String updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLoss_id() {
        return loss_id;
    }

    public void setLoss_id(int loss_id) {
        this.loss_id = loss_id;
    }

    public int getHazard_id() {
        return hazard_id;
    }

    public void setHazard_id(int hazard_id) {
        this.hazard_id = hazard_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}