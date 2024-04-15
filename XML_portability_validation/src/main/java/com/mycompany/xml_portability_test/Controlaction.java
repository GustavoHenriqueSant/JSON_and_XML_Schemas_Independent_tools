package com.mycompany.xml_portability_test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "controlaction")
@XmlType(propOrder = {"id", "name", "description", "controller_id", "created_at", "updated_at", "rule", "context_table",
    "safety_constraint"})
public class Controlaction {
    private int id;
    private String name;
    private String description;
    private int controller_id;
    private String created_at;
    private String updated_at;
    List<Rule> rule = new ArrayList<Rule>();
    List<ContextTables> context_table = new ArrayList<ContextTables>();
    List<Safety_constraints> safety_constraint = new ArrayList<Safety_constraints>();

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<Rule> getRule() {
        return rule;
    }

    @XmlElementWrapper(name = "rules")
    @XmlElement(name = "rule")
    public void setRule(List<Rule> rule) {
        this.rule = rule;
    }

    public List<ContextTables> getContext_table() {
        return context_table;
    }

    @XmlElementWrapper(name = "context_tables")
    @XmlElement(name = "context_table")
    public void setContext_table(List<ContextTables> context_table) {
        this.context_table = context_table;
    }

    public List<Safety_constraints> getSafety_constraint() {
        return safety_constraint;
    }

    @XmlElementWrapper(name = "safety_constraints")
    @XmlElement(name = "safety_constraint")
    public void setSafety_constraint(List<Safety_constraints> safety_constraint) {
        this.safety_constraint = safety_constraint;
    }
}