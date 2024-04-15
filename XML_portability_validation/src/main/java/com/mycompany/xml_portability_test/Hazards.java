package com.mycompany.xml_portability_test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "hazard")
@XmlType(propOrder = {"id", "name", "description", "project_id", "created_at", "updated_at", "losseshazards_relations"})
public class Hazards {
    private int id;
    private String name;
    private String description;
    private int project_id;
    private String created_at;
    private String updated_at;
    private List<Losseshazards_relation> losseshazards_relations = new ArrayList<Losseshazards_relation>();

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

    public List<Losseshazards_relation> getLosseshazards_relations() {
        return losseshazards_relations;
    }

    @XmlElementWrapper(name = "losseshazards_relations")
    @XmlElement(name = "losseshazards_relation")
    public void setLosseshazards_relations(List<Losseshazards_relation> losseshazards) {
        this.losseshazards_relations = losseshazards;
    }
}