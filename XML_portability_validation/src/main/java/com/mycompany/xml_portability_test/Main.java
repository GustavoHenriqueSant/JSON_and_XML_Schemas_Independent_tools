/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.xml_portability_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Gustavo
 */
public class Main {
    public static void main(String[] args) {
        try{
            //Reading the STPA analysis from the XML file and transforming it into a Project object including all relationships between entities, with JAXB lib.
            JAXBContext jaxbContext = JAXBContext.newInstance(Project.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Project que= (Project) jaxbUnmarshaller.unmarshal(new InputStreamReader(new FileInputStream(System.getProperty("user.dir") + "\\assets\\TrainDoorSystem.xml"), StandardCharsets.UTF_8));
            
            //Modification of the original analysis: addition of a new system goal, and change in the project name
            que.setName("ATT Train Door System Import XML");
            System_goal newgoal = new System_goal(999, "Test", "Test description", 1, "2021-09-21 17:27:12", "2021-09-21 17:27:12");
            que.getSystem_goal().add(newgoal);
            
            //Saving the modified analysis to be imported later by WebSTAMP
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // Formata a saída XML
            marshaller.marshal(que, new File(System.getProperty("user.dir") + "\\assets\\ATTrainDoorSystem.xml"));
            
            for(int i = 0; i < que.getActuators().size(); i++){
                System.out.println("Actuator " + Integer.toString(i) + ":");
                System.out.println("\t id: " + que.getActuators().get(i).getId());
                System.out.println("\t name: " + que.getActuators().get(i).getName());
                System.out.println("\t project_id: " + que.getActuators().get(i).getProject_id());
            }

            System.out.println();

            for(int i = 0; i < que.getAssumption().size(); i++){
                System.out.println("Assumption " + i);
                System.out.println("\t id: " + que.getAssumption().get(i).getId());
                System.out.println("\t name: " + que.getAssumption().get(i).getName());
                System.out.println("\t description " + que.getAssumption().get(i).getDescription());
                System.out.println("\t project_id : " + que.getAssumption().get(i).getProject_id());
                System.out.println("\t created_at: " + que.getAssumption().get(i).getCreated_at());
                System.out.println("\t updated_at: " + que.getAssumption().get(i).getUpdated_at());
            }

            System.out.println();

            System.out.println("Controled_process");
            System.out.println("\t id: " +  que.getControlledProcess().getId());
            System.out.println("\t name: " + que.getControlledProcess().getName());
            System.out.println("\t Project_id: " + que.getControlledProcess().getProject_id());

            System.out.println();

            for(int i = 0; i < que.getController().size(); i++) {
                System.out.println("Controller " + i);
                System.out.println("\t id: " + que.getController().get(i).getId());
                System.out.println("\t name: " + que.getController().get(i).getName());
                System.out.println("\t type: " + que.getController().get(i).getType());
                System.out.println("\t Project_id: " + que.getController().get(i).getProject_id());

                for(int j = 0; j < que.getController().get(i).getControlaction().size(); j++){
                    System.out.println("\tControlAction " + j);
                    System.out.println("\t\t id: " + que.getController().get(i).getControlaction().get(j).getId());
                    System.out.println("\t\t name: " + que.getController().get(i).getControlaction().get(j).getName());
                    System.out.println("\t\t descrption: " + que.getController().get(i).getControlaction().get(j).getDescription());
                    System.out.println("\t\t controller_id: " + que.getController().get(i).getControlaction().get(j).getController_id());

                    for(int k = 0; k < que.getController().get(i).getControlaction().get(j).getRule().size(); k++){
                        System.out.println("\t\tRule " + k);
                        System.out.println("\t\t\t id: " + que.getController().get(i).getControlaction().get(j).getRule().get(k).getId());
                        System.out.println("\t\t\t contronlacton_id " + que.getController().get(i).getControlaction().get(j).getRule().get(k).getControlaction_id());
                        System.out.println("\t\t\t column " + que.getController().get(i).getControlaction().get(j).getRule().get(k).getColumn());
                        System.out.println("\t\t\t varialbe_state_reltion ");
                        System.out.println("\t\t\t\t rule_id: " + que.getController().get(i).getControlaction().get(j).getRule().get(k).getVariable_state_relations().getRule_id());
                        System.out.println("\t\t\t\t varialbe_id: " + que.getController().get(i).getControlaction().get(j).getRule().get(k).getVariable_state_relations().getVariable_id());
                        System.out.println("\t\t\t\t state_id: " + que.getController().get(i).getControlaction().get(j).getRule().get(k).getVariable_state_relations().getState_id());
                    }

                    for(int k = 0; k < que.getController().get(i).getControlaction().get(j).getContext_table().size(); k++){
                        System.out.println("\t\t Context_table " + k);
                        System.out.println("\t\t\t id:" + que.getController().get(i).getControlaction().get(j).getContext_table().get(k).getId());
                        System.out.println("\t\t\t controlacton_id: " + que.getController().get(i).getControlaction().get(j).getContext_table().get(k).getControlaction_id());
                        System.out.println("\t\t\t context: " + que.getController().get(i).getControlaction().get(j).getContext_table().get(k).getContext());
                        System.out.println("\t\t\t ca_provided: " + que.getController().get(i).getControlaction().get(j).getContext_table().get(k).getCa_provided());
                        System.out.println("\t\t\t ca_not_provided:" + que.getController().get(i).getControlaction().get(j).getContext_table().get(k).getCa_not_provided());
                        System.out.println("\t\t\t wrong_time_order: " + que.getController().get(i).getControlaction().get(j).getContext_table().get(k).getWrong_time_order());
                        System.out.println("\t\t\t ca_too_early: " + que.getController().get(i).getControlaction().get(j).getContext_table().get(k).getCa_too_early());
                        System.out.println("\t\t\t ca_too_late: " + que.getController().get(i).getControlaction().get(j).getContext_table().get(k).getCa_too_late());
                        System.out.println("\t\t\t ca_too_soon: " + que.getController().get(i).getControlaction().get(j).getContext_table().get(k).getCa_too_soon());
                        System.out.println("\t\t\t ca_too_long: " + que.getController().get(i).getControlaction().get(j).getContext_table().get(k).getCa_too_long());
                    }

                    for(int k = 0; k < que.getController().get(i).getControlaction().get(j).getSafety_constraint().size(); k++){
                        System.out.println("\t\t Safety_constraint " + k);
                        System.out.println("\t\t\t id: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getId());
                        System.out.println("\t\t\t unsafe_cntrol_action: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getUnsafe_control_action());
                        System.out.println("\t\t\t safety_constraints: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getSafety_constraint());
                        System.out.println("\t\t\t type: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getType());
                        System.out.println("\t\t\t context: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getContext());
                        System.out.println("\t\t\t controlaction_id: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getControlaction_id());
                        System.out.println("\t\t\t rule_id: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRule_id());
                        System.out.println("\t\t\t flag: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getFlag());

                        for(int l = 0; l < que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().size(); l++){
                            System.out.println("\t\t Causal analysis " + l);
                            System.out.println("\t\t\t id: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getId());
                            System.out.println("\t\t\t scenario: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getScenario());
                            System.out.println("\t\t\t associates_causal_factor: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getAssociated_causal_factor());
                            System.out.println("\t\t\t requirement: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getRequirement());
                            System.out.println("\t\t\t role: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getRole());
                            System.out.println("\t\t\t rationale: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getRationale());
                            System.out.println("\t\t\t guideword_id: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getGuideword_id());
                            System.out.println("\t\t\t safety_consraints_id: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getCausal_analysis().get(l).getSafety_constraint_id());
                        }

                        for(int l = 0; l < que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRules_safety_constraints_hazards().size(); l++){
                            System.out.println("\t\t rules_safety_constraint_hazard_relation " + l);
                            System.out.println("\t\t\t rule_id: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRules_safety_constraints_hazards().get(l).getRule_id());
                            System.out.println("\t\t\t sc_id: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRules_safety_constraints_hazards().get(l).getSc_id());
                            System.out.println("\t\t\t hazard_id: " + que.getController().get(i).getControlaction().get(j).getSafety_constraint().get(k).getRules_safety_constraints_hazards().get(l).getHazard_id());
                        }
                    }
                }

                for(int j = 0; j < que.getController().get(i).getVariable().size(); j++){
                    System.out.println("\tVariable " + j);
                    System.out.println("\t\t id: " + que.getController().get(i).getVariable().get(j).getId());
                    System.out.println("\t\t name: " + que.getController().get(i).getVariable().get(j).getName());
                    System.out.println("\t\t project_id: " + que.getController().get(i).getVariable().get(j).getProject_id());
                    System.out.println("\t\t controller_id " + que.getController().get(i).getVariable().get(j).getController_id());

                    for(int k = 0; k < que.getController().get(i).getVariable().get(j).getState().size(); k++){
                        System.out.println("\t\tState " + k);
                        System.out.println("\t\t\t id: " + que.getController().get(i).getVariable().get(j).getState().get(k).getId());
                        System.out.println("\t\t\t name: " + que.getController().get(i).getVariable().get(j).getState().get(k).getName());
                        System.out.println("\t\t\t variable_id: " + que.getController().get(i).getVariable().get(j).getState().get(k).getVariable_id());
                    }
                }
            }

            System.out.println();

            for(int i = 0; i < que.getHazards().size(); i++){
                System.out.println("Hazard " + i);
                System.out.println("\tnome: " + que.getHazards().get(i).getName());
                System.out.println("\tDescription: " + que.getHazards().get(i).getDescription());
                for(int j = 0; j < que.getHazards().get(i).getLosseshazards_relations().size(); j++){
                    System.out.println("\tLosses Hazards Relations " + j);
                    System.out.println("\t\tloss_id: " + que.getHazards().get(i).getLosseshazards_relations().get(j).getLoss_id());
                    System.out.println("\t\tHazard_id: " + que.getHazards().get(i).getLosseshazards_relations().get(j).getHazard_id());
                }
            }

            System.out.println();

            for(int i = 0; i < que.getLoss().size(); i++){
                System.out.println("loss " + i);
                System.out.println("\tname: " + que.getLoss().get(i).getName());
                System.out.println("\tdescription: " + que.getLoss().get(i).getDescription());
            }

            System.out.println();

            for(int i = 0; i < que.getSensor().size(); i++){
                System.out.println("Sensor: " + i);
                System.out.println("\tname: " + que.getSensor().get(i).getName());
            }

            System.out.println();

            for(int i = 0; i < que.getSystem_goal().size(); i++){
                System.out.println("System goal " + i);
                System.out.println("\tname: " + que.getSystem_goal().get(i).getName());
                System.out.println("\tdescription: " + que.getSystem_goal().get(i).getDescription());
            }

            System.out.println();

            for(int i = 0; i < que.getSystem_safety_constraint().size(); i++){
                System.out.println("System safety constraint " + i);
                System.out.println("\tname: " + que.getSystem_safety_constraint().get(i).getName());
                System.out.println("\tdescription: " + que.getSystem_safety_constraint().get(i).getDescription());
                for(int j = 0; j < que.getSystem_safety_constraint().get(i).getSystem_safety_constraint_hazards_relations().size(); j++){
                    System.out.println("\tSystem safety constraint" + j);
                    System.out.println("\t\trule_id: " + que.getSystem_safety_constraint().get(i).getSystem_safety_constraint_hazards_relations().get(j).getCreated_at());
                    System.out.println("\t\tsc_id: " + que.getSystem_safety_constraint().get(i).getSystem_safety_constraint_hazards_relations().get(j).getSsc_id());
                    System.out.println("\t\thazards_id: " + que.getSystem_safety_constraint().get(i).getSystem_safety_constraint_hazards_relations().get(j).getHazard_id());
                }
            }

            System.out.println();

            for(int i = 0; i < que.getConnection().size(); i++){
                System.out.println("connection " + i);
                System.out.println("\toutput_component_id: " + que.getConnection().get(i).getOutput_component_id());
                System.out.println("\ttype_output: " + que.getConnection().get(i).getType_output());
                System.out.println("\tinput_component_id: " + que.getConnection().get(i).getInput_component_id());
                System.out.println("\ttype_input: " + que.getConnection().get(i).getType_input());
            }

        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
