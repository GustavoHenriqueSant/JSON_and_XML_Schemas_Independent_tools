package com.mycompany.xml_portability_test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "project")
@XmlType(propOrder = {"id", "name", "description", "created_at", "updated_at", "URL", "type", "actuators", "assumption",
    "controlledProcess", "controller", "hazards", "loss", "mission", "sensor", "system_goal", "system_safety_constraint",
    "connection"})
public class Project {
    private List<Actuator> actuators = new ArrayList<Actuator>();
    private String updated_at;
    private String name;
    private String description;
    private String created_at;
    private String id;
    private String type;
    private List<Assumption> assumption = new ArrayList<Assumption>();
    private Controlled_process controlledProcess;
    private String URL;
    private List<Controller> controller = new ArrayList<Controller>();
    private List<Hazards> hazards = new ArrayList<Hazards>();
    private List<Loss> loss = new ArrayList<Loss>();
    private List<Mission> mission = new ArrayList<Mission>();
    private List<Sensor> sensor = new ArrayList<Sensor>();
    private List<System_goal> system_goal = new ArrayList<System_goal>();
    private List<System_safety_constraint> system_safety_constraint = new ArrayList<System_safety_constraint>();
    private List<Connection> connection = new ArrayList<Connection>();

    public List<Controller> getController() {
        return controller;
    }

    @XmlElementWrapper(name = "controllers")
    @XmlElement(name = "controller")
    public void setController(List<Controller> controller) {
        this.controller = controller;
    }

    public List<Connection> getConnection() {
        return connection;
    }

    @XmlElementWrapper(name = "connections")
    @XmlElement(name = "connection")
    public void setConnection(List<Connection> connection) {
        this.connection = connection;
    }

    public List<System_safety_constraint> getSystem_safety_constraint() {
        return system_safety_constraint;
    }

    @XmlElementWrapper(name = "system_safety_constraints")
    @XmlElement(name = "system_safety_constraint")
    public void setSystem_safety_constraint(List<System_safety_constraint> system_safety_constraint) {
        this.system_safety_constraint = system_safety_constraint;
    }

    public List<System_goal> getSystem_goal() {
        return system_goal;
    }

    @XmlElementWrapper(name = "system_goals")
    @XmlElement(name = "system_goal")
    public void setSystem_goal(List<System_goal> system_goal) {
        this.system_goal = system_goal;
    }

    public List<Sensor> getSensor() {
        return sensor;
    }

    @XmlElementWrapper(name = "sensors")
    @XmlElement(name = "sensor")
    public void setSensor(List<Sensor> sensor) {
        this.sensor = sensor;
    }

    public List<Mission> getMission() {
        return mission;
    }

    @XmlElementWrapper(name = "missions")
    @XmlElement(name = "mission")
    public void setMission(List<Mission> mission) {
        this.mission = mission;
    }

    public List<Loss> getLoss() {
        return loss;
    }

    @XmlElementWrapper(name = "losses")
    @XmlElement(name = "loss")
    public void setLoss(List<Loss> loss) {
        this.loss = loss;
    }

    public List<Hazards> getHazards() {
        return hazards;
    }

    @XmlElementWrapper(name = "hazards")
    @XmlElement(name = "hazard")
    public void setHazards(List<Hazards> hazards) {
        this.hazards = hazards;
    }

    public Controlled_process getControlledProcess() {
        return controlledProcess;
    }

    @XmlElement(name = "controlled_process")
    public void setControlledProcess(Controlled_process controlledProcess) {
        this.controlledProcess = controlledProcess;
    }

    public List<Assumption> getAssumption() {
        return assumption;
    }

    @XmlElementWrapper(name = "assumptions")
    @XmlElement(name = "assumption")
    public void setAssumption(List<Assumption> assumption) {
        this.assumption = assumption;
    }

    @XmlElementWrapper(name = "actuators")
    @XmlElement(name = "actuator")
    public List<Actuator> getActuators()
    {
        return this.actuators;
    }

    public void setActuators (List<Actuator> actuators)
    {
        this.actuators = actuators;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getURL ()
    {
        return URL;
    }

    public void setURL (String URL)
    {
        this.URL = URL;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [actuators = "+actuators+", updated_at = "+updated_at+", name = "+name+", description = "+description+", created_at = "+created_at+", id = "+id+", type = "+type+", URL = "+URL+"]";
    }
}