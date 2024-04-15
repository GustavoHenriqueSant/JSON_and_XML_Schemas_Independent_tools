package com.mycompany.json_portability_test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Controlactions {
    private int id;
    private String name;
    private String description;
    private int controller_id;
    private String created_at;
    private String updated_at;
    List<Rules> rules = new ArrayList<Rules>();
    List<ContextTables> context_tables = new ArrayList<ContextTables>();
    List<Safety_constraints> safety_constraints = new ArrayList<Safety_constraints>();

    public Controlactions(int id, String name, String description, int controller_id, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.controller_id = controller_id;
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

    public List<Rules> getRules() {
        return rules;
    }

    public void setRules(List<Rules> rules) {
        this.rules = rules;
    }

    public List<ContextTables> getContext_table() {
        return context_tables;
    }

    public void setContext_table(List<ContextTables> context_table) {
        this.context_tables = context_table;
    }

    public List<Safety_constraints> getSafety_constraint() {
        return safety_constraints;
    }

    public void setSafety_constraint(List<Safety_constraints> safety_constraint) {
        this.safety_constraints = safety_constraint;
    }   
}