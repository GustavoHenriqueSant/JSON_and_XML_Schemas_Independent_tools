package com.mycompany.xml_portability_test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "actuator")
@XmlType(propOrder = {"id", "name", "project_id", "created_at", "updated_at"})
public class Actuator {
    private String updated_at;
    private String project_id;
    private String name;
    private String created_at;
    private String id;

    public String getUpdated_at () {
        return updated_at;
    }

    public void setUpdated_at (String updated_at) {
        this.updated_at = updated_at;
    }

    public String getProject_id () {
        return project_id;
    }

    public void setProject_id (String project_id) {
        this.project_id = project_id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getCreated_at () {
        return created_at;
    }

    public void setCreated_at (String created_at) {
        this.created_at = created_at;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ClassPojo [updated_at = "+updated_at+", project_id = "+project_id+", name = "+name+", created_at = "+created_at+", id = "+id+"]";
    }
}