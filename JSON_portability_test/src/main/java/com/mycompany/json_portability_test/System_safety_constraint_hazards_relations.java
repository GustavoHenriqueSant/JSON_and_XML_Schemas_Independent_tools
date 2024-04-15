package com.mycompany.json_portability_test;

/**
 *
 * @author Gustavo
 */
public class System_safety_constraint_hazards_relations {
    private int ssc_id;
    private int hazard_id;
    private String created_at;
    private String updated_at;

    public System_safety_constraint_hazards_relations(int ssc_id, int hazard_id, String created_at, String updated_at) {
        this.ssc_id = ssc_id;
        this.hazard_id = hazard_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    } 
    
    public int getSsc_id() {
        return ssc_id;
    }

    public void setSsc_id(int ssc_id) {
        this.ssc_id = ssc_id;
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