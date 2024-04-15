package com.mycompany.xml_portability_test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "connection")
@XmlType(propOrder = {"id", "output_component_id", "type_output", "input_component_id", "type_input", "created_at", "updated_at"})
public class Connection {
    private int id;
    private int output_component_id;
    private String type_output;
    private int input_component_id;
    private String type_input;
    private String created_at;
    private String updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOutput_component_id() {
        return output_component_id;
    }

    public void setOutput_component_id(int output_component_id) {
        this.output_component_id = output_component_id;
    }

    public String getType_output() {
        return type_output;
    }

    public void setType_output(String type_output) {
        this.type_output = type_output;
    }

    public int getInput_component_id() {
        return input_component_id;
    }

    public void setInput_component_id(int input_component_id) {
        this.input_component_id = input_component_id;
    }

    public String getType_input() {
        return type_input;
    }

    public void setType_input(String type_input) {
        this.type_input = type_input;
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