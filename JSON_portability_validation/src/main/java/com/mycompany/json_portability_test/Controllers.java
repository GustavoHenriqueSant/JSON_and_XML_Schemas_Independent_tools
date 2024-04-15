package com.mycompany.json_portability_test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Controllers {
    private int id;
    private String name;
    private String type;
    private int project_id;
    private String created_at;
    private String updated_at;
    List<Controlactions> controlactions = new ArrayList<Controlactions>();
    List<Variables> variables = new ArrayList<Variables>();

    public Controllers(int id, String name, String type, int project_id, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.type = type;
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

    public List<Controlactions> getControlaction() {
        return controlactions;
    }

    public void setControlaction(List<Controlactions> controlaction) {
        this.controlactions = controlaction;
    }

    public List<Variables> getVariables() {
        return variables;
    }

    public void setVariables(List<Variables> variables) {
        this.variables = variables;
    }   
}