package com.mycompany.xml_portability_test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "controller")
@XmlType(propOrder = {"id", "name", "type", "project_id", "created_at", "updated_at", "controlaction", "variable"})
public class Controller {
    private int id;
    private String name;
    private String type;
    private int project_id;
    private String created_at;
    private String updated_at;
    List<Controlaction> controlaction = new ArrayList<Controlaction>();
    List<Variable> variable = new ArrayList<Variable>();

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
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

    public List<Controlaction> getControlaction() {
        return controlaction;
    }

    @XmlElementWrapper(name = "controlactions")
    @XmlElement(name = "controlaction")
    public void setControlaction(List<Controlaction> controlaction) {
        this.controlaction = controlaction;
    }

    public List<Variable> getVariable() {
        return variable;
    }

    @XmlElementWrapper(name = "variables")
    @XmlElement(name = "variable")
    public void setVariable(List<Variable> variable) {
        this.variable = variable;
    }
}