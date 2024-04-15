package com.mycompany.xml_portability_test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "system_safety_constraint")
@XmlType(propOrder = {"id", "name", "description", "project_id", "created_at", "updated_at", "system_safety_constraint_hazards_relations"})
public class System_safety_constraint {
    private int id;
    private String name;
    private String description;
    private int project_id;
    private String created_at;
    private String updated_at;
    private List<System_safety_constraint_hazards_relation> system_safety_constraint_hazards_relations = new ArrayList<System_safety_constraint_hazards_relation>();

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

    public List<System_safety_constraint_hazards_relation> getSystem_safety_constraint_hazards_relations() {
        return system_safety_constraint_hazards_relations;
    }

    @XmlElementWrapper(name = "system_safety_constraint_hazards_relations")
    @XmlElement(name = "system_safety_constraint_hazards_relation")
    public void setSystem_safety_constraint_hazards_relations(List<System_safety_constraint_hazards_relation> system_safety_constraint_hazards) {
        this.system_safety_constraint_hazards_relations = system_safety_constraint_hazards;
    }
}