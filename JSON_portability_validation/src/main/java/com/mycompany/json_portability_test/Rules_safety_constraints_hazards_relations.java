package com.mycompany.json_portability_test;

/**
 *
 * @author Gustavo
 */
public class Rules_safety_constraints_hazards_relations {
    private int rule_id;
    private int sc_id;
    private int hazard_id;
    private String created_at;
    private String updated_at;

    public Rules_safety_constraints_hazards_relations(int rule_id, int sc_id, int hazard_id, String created_at, String updated_at) {
        this.rule_id = rule_id;
        this.sc_id = sc_id;
        this.hazard_id = hazard_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    
    public int getRule_id() {
        return rule_id;
    }

    public void setRule_id(int rule_id) {
        this.rule_id = rule_id;
    }

    public int getSc_id() {
        return sc_id;
    }

    public void setSc_id(int sc_id) {
        this.sc_id = sc_id;
    }

    public int getHazard_id() {
        return hazard_id;
    }

    public void setHazard_id(int hazard_id) {
        this.hazard_id = hazard_id;
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