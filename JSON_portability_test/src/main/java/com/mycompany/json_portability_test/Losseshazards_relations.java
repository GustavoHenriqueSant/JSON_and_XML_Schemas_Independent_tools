package com.mycompany.json_portability_test;

/**
 *
 * @author Gustavo
 */
public class Losseshazards_relations {
    private int id;
    private int loss_id;
    private int hazard_id;
    private String created_at;
    private String updated_at;

    public Losseshazards_relations(int id, int loss_id, int hazard_id, String created_at, String updated_at) {
        this.id = id;
        this.loss_id = loss_id;
        this.hazard_id = hazard_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLoss_id() {
        return loss_id;
    }

    public void setLoss_id(int loss_id) {
        this.loss_id = loss_id;
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