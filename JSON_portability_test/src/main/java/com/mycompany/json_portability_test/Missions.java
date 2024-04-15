package com.mycompany.json_portability_test;

/**
 *
 * @author Gustavo
 */
public class Missions {
    private int id;
    private String purpose;
    private String method;
    private String goals;
    private int project_id;
    private String created_at;
    private String update_at;

    public Missions(int id, String purpose, String method, String goals, int project_id, String created_at, String update_at) {
        this.id = id;
        this.purpose = purpose;
        this.method = method;
        this.goals = goals;
        this.project_id = project_id;
        this.created_at = created_at;
        this.update_at = update_at;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
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

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }        
}