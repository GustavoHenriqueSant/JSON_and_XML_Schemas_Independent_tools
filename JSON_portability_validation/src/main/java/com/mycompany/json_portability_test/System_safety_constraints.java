package com.mycompany.json_portability_test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class System_safety_constraints {
    private int id;
    private String name;
    private String description;
    private int project_id;
    private String created_at;
    private String updated_at;
    List<System_safety_constraint_hazards_relations> system_safety_constraint_hazards_relations = new ArrayList<System_safety_constraint_hazards_relations>();

    public System_safety_constraints(int id, String name, String description, int project_id, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.project_id = project_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    
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

    public List<System_safety_constraint_hazards_relations> getSystem_safety_constraint_hazards() {
        return system_safety_constraint_hazards_relations;
    }

    public void setSystem_safety_constraint_hazards(List<System_safety_constraint_hazards_relations> system_safety_constraint_hazards) {
        this.system_safety_constraint_hazards_relations = system_safety_constraint_hazards;
    }   
}