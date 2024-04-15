package com.mycompany.json_portability_test;

/**
 *
 * @author Gustavo
 */
public class Rules {
    private int id;
    private int controlaction_id;
    private String column;
    private String created_at;
    private String updated_at;
    private Variable_state_relation variable_state_relations;

    public Rules(int id, int controlaction_id, String column, String created_at, String updated_at, Variable_state_relation variableState) {
        this.id = id;
        this.controlaction_id = controlaction_id;
        this.column = column;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.variable_state_relations = variableState;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getControlaction_id() {
        return controlaction_id;
    }

    public void setControlaction_id(int controlaction_id) {
        this.controlaction_id = controlaction_id;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
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

    public Variable_state_relation getVariableState() {
        return variable_state_relations;
    }

    public void setVariableState(Variable_state_relation variableState) {
        this.variable_state_relations = variableState;
    }   
}