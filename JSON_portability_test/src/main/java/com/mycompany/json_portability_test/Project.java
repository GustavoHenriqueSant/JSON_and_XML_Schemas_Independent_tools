package com.mycompany.json_portability_test;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Gustavo
 */
public class Project {
    private int id;
    private String name;
    private String description;
    private String created_at;
    private String updated_at;
    private String URL;
    private String type;
    private List<Connections> connections = new ArrayList<Connections>();
    private List<Actuators> actuators = new ArrayList<Actuators>();
    private List<Assumptions> assumptions = new ArrayList<Assumptions>();
    private Controlled_process controlled_process;
    private List<Controllers> controllers = new ArrayList<Controllers>();
    private List<Hazards> hazards = new ArrayList<Hazards>();
    private List<Losses> losses = new ArrayList<Losses>();
    private List<Missions> missions = new ArrayList<Missions>();
    private List<Sensors> sensors = new ArrayList<Sensors>();
    private List<System_goals> system_goals = new ArrayList<System_goals>();
    private List<System_safety_constraints> system_safety_constraints = new ArrayList<System_safety_constraints>();

    public Project(int id, String name, String description, String created_at, String updated_at, String URL, String type,
            Controlled_process Controlled_process) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.URL = URL;
        this.type = type;
        this.controlled_process = Controlled_process;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Connections> getConnections() {
        return connections;
    }

    public void setConnections(List<Connections> connections) {
        this.connections = connections;
    }
    
    public List<Actuators> getActuators() {
        return actuators;
    }

    public void setActuators(List<Actuators> actuators) {
        this.actuators = actuators;
    }

    public List<Assumptions> getAssumptions() {
        return assumptions;
    }

    public void setAssumptions(List<Assumptions> assumptions) {
        this.assumptions = assumptions;
    }

    public Controlled_process getControlled_process() {
        return controlled_process;
    }

    public void setControlled_process(Controlled_process Controlled_process) {
        this.controlled_process = Controlled_process;
    }

    public List<Controllers> getControllers() {
        return controllers;
    }

    public void setControllers(List<Controllers> controllers) {
        this.controllers = controllers;
    }

    public List<Hazards> getHazards() {
        return hazards;
    }

    public void setHazards(List<Hazards> hazards) {
        this.hazards = hazards;
    }

    public List<Losses> getLosses() {
        return losses;
    }

    public void setLosses(List<Losses> losses) {
        this.losses = losses;
    }

    public List<Missions> getMissions() {
        return missions;
    }

    public void setMissions(List<Missions> missions) {
        this.missions = missions;
    }

    public List<Sensors> getSensor() {
        return sensors;
    }

    public void setSensor(List<Sensors> sensor) {
        this.sensors = sensor;
    }

    public List<System_goals> getSystem_goals() {
        return system_goals;
    }

    public void setSystem_goals(List<System_goals> system_goals) {
        this.system_goals = system_goals;
    }

    public List<System_safety_constraints> getSsc() {
        return system_safety_constraints;
    }

    public void setSsc(List<System_safety_constraints> ssc) {
        this.system_safety_constraints = ssc;
    }   
}