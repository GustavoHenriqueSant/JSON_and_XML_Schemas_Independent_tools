package com.mycompany.json_portability_test;

/**
 *
 * @author Gustavo
 */
public class Variable_state_relation {
    private int rule_id;
    private int variable_id;
    private int state_id;
    private String created_at;
    private String updated_at;

    public Variable_state_relation(int rule_id, int variable_id, int state_id, String created_at, String updated_at) {
        this.rule_id = rule_id;
        this.variable_id = variable_id;
        this.state_id = state_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getRule_id() {
        return rule_id;
    }

    public void setRule_id(int rule_id) {
        this.rule_id = rule_id;
    }

    public int getVariable_id() {
        return variable_id;
    }

    public void setVariable_id(int variable_id) {
        this.variable_id = variable_id;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
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