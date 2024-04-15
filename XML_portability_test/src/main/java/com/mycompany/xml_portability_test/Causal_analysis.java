package com.mycompany.xml_portability_test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "causal_analysis_")
@XmlType(propOrder = {"id", "scenario", "associated_causal_factor", "requirement", "role", "rationale", "guideword_id",
    "safety_constraint_id", "created_at", "updated_at"})
public class Causal_analysis {
    private int id;
    private String scenario;
    private String associated_causal_factor;
    private String requirement;
    private String role;
    private String rationale;
    private int guideword_id;
    private int safety_constraint_id;
    private String created_at;
    private String updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public String getAssociated_causal_factor() {
        return associated_causal_factor;
    }

    public void setAssociated_causal_factor(String associated_causal_factor) {
        this.associated_causal_factor = associated_causal_factor;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRationale() {
        return rationale;
    }

    public void setRationale(String rationale) {
        this.rationale = rationale;
    }

    public int getGuideword_id() {
        return guideword_id;
    }

    public void setGuideword_id(int guideword_id) {
        this.guideword_id = guideword_id;
    }

    public int getSafety_constraint_id() {
        return safety_constraint_id;
    }

    public void setSafety_constraint_id(int safety_constraint_id) {
        this.safety_constraint_id = safety_constraint_id;
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