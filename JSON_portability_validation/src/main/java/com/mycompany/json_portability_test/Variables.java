package com.mycompany.json_portability_test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Variables {
    private int id;
    private String name;
    private int project_id;
    private int controller_id;
    private String created_at;
    private String updated_at;
    List<States> states = new ArrayList<States>();

    public Variables(int id, String name, int project_id, int controller_id, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.project_id = project_id;
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

    public List<States> getState() {
        return states;
    }

    public void setState(List<States> state) {
        this.states = state;
    } 
}