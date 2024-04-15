package com.mycompany.json_portability_test;

/**
 *
 * @author Gustavo
 */
public class ContextTables {
    private int id;
    private int controlaction_id;
    private String context;
    private String ca_provided;
    private String ca_not_provided;
    private String wrong_time_order;
    private String ca_too_early;
    private String ca_too_late;
    private String ca_too_soon;
    private String ca_too_long;
    private String created_at;
    private String updated_at;

    public ContextTables(int id, int controlaction_id, String context, String ca_provided, String ca_not_provided,
            String wrong_time_order, String ca_too_early, String ca_too_late, String ca_too_soon, String ca_too_long,
            String created_at, String updated_at) {
        this.id = id;
        this.controlaction_id = controlaction_id;
        this.context = context;
        this.ca_provided = ca_provided;
        this.ca_not_provided = ca_not_provided;
        this.wrong_time_order = wrong_time_order;
        this.ca_too_early = ca_too_early;
        this.ca_too_late = ca_too_late;
        this.ca_too_soon = ca_too_soon;
        this.ca_too_long = ca_too_long;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCa_provided() {
        return ca_provided;
    }

    public void setCa_provided(String ca_provided) {
        this.ca_provided = ca_provided;
    }

    public String getCa_not_provided() {
        return ca_not_provided;
    }

    public void setCa_not_provided(String ca_not_provided) {
        this.ca_not_provided = ca_not_provided;
    }

    public String getWrong_time_order() {
        return wrong_time_order;
    }

    public void setWrong_time_order(String wrong_time_order) {
        this.wrong_time_order = wrong_time_order;
    }

    public String getCa_too_early() {
        return ca_too_early;
    }

    public void setCa_too_early(String ca_too_early) {
        this.ca_too_early = ca_too_early;
    }

    public String getCa_too_late() {
        return ca_too_late;
    }

    public void setCa_too_late(String ca_too_late) {
        this.ca_too_late = ca_too_late;
    }

    public String getCa_too_soon() {
        return ca_too_soon;
    }

    public void setCa_too_soon(String ca_too_soon) {
        this.ca_too_soon = ca_too_soon;
    }

    public String getCa_too_long() {
        return ca_too_long;
    }

    public void setCa_too_long(String ca_too_long) {
        this.ca_too_long = ca_too_long;
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