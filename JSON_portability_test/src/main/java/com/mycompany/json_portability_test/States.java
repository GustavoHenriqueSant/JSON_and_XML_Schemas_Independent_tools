package com.mycompany.json_portability_test;

/**
 *
 * @author Gustavo
 */
public class States {
    private int id;
    private String name;
    private int variable_id;
    private String created_at;
    private String updated_at;

    public States(int id, String name, int variable_id, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.variable_id = variable_id;
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

    public int getVariable_id() {
        return variable_id;
    }

    public void setVariable_id(int variable_id) {
        this.variable_id = variable_id;
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
}