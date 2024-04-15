package com.mycompany.xml_portability_test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "variable")
@XmlType(propOrder = {"id", "name", "project_id", "controller_id", "created_at", "updated_at", "state"})
public class Variable {
    private int id;
    private String name;
    private int project_id;
    private int controller_id;
    private String created_at;
    private String updated_at;
    List<State> state = new ArrayList<State>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getController_id() {
        return controller_id;
    }

    public void setController_id(int controller_id) {
        this.controller_id = controller_id;
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

    public List<State> getState() {
        return state;
    }

    @XmlElementWrapper(name = "states")
    @XmlElement(name = "state")
    public void setState(List<State> state) {
        this.state = state;
    }
}