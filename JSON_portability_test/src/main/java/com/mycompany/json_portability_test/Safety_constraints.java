package com.mycompany.json_portability_test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Safety_constraints {
    private int id;
    private String unsafe_control_action;
    private String safety_constraint;
    private String type;
    private String context;
    private int controlaction_id;
    private int rule_id;
    private String created_at;
    private String updated_at;
    private int flag;
    List<Causal_analysis> causal_analysis = new ArrayList<Causal_analysis>();
    List<Rules_safety_constraints_hazards_relations> rules_safety_constraints_hazards_relations = new ArrayList<Rules_safety_constraints_hazards_relations>();

    public Safety_constraints(int id, String unsafe_control_action, String safety_constraint, String type, String context,
            int controlaction_id, int rule_id, String created_at, String updated_at, int flag) {
        this.id = id;
        this.unsafe_control_action = unsafe_control_action;
        this.safety_constraint = safety_constraint;
        this.type = type;
        this.context = context;
        this.controlaction_id = controlaction_id;
        this.rule_id = rule_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.flag = flag;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnsafe_control_action() {
        return unsafe_control_action;
    }

    public void setUnsafe_control_action(String unsafe_control_action) {
        this.unsafe_control_action = unsafe_control_action;
    }

    public String getSafety_constraint() {
        return safety_constraint;
    }

    public void setSafety_constraint(String safety_constraint) {
        this.safety_constraint = safety_constraint;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getControlaction_id() {
        return controlaction_id;
    }

    public void setControlaction_id(int controlaction_id) {
        this.controlaction_id = controlaction_id;
    }

    public int getRule_id() {
        return rule_id;
    }

    public void setRule_id(int rule_id) {
        this.rule_id = rule_id;
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

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public List<Causal_analysis> getCausal_analysis() {
        return causal_analysis;
    }

    public void setCausal_analysis(List<Causal_analysis> causal_analysis) {
        this.causal_analysis = causal_analysis;
    }

    public List<Rules_safety_constraints_hazards_relations> getRules_safety_constraints_hazards() {
        return rules_safety_constraints_hazards_relations;
    }

    public void setRules_safety_constraints_hazards(List<Rules_safety_constraints_hazards_relations> rules_safety_constraints_hazards) {
        this.rules_safety_constraints_hazards_relations = rules_safety_constraints_hazards;
    }   
}