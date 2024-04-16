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
import java.nio.file.NoSuchFileException;
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
            Project que= (Project) jaxbUnmarshaller.unmarshal(new InputStreamReader(new FileInputStream(System.getProperty("user.dir") + "/assets/TrainDoorSystem.xml"), StandardCharsets.UTF_8));
            
            //Modification of the original analysis: addition of a new system goal, and change in the project name
            que.setName("ATT Train Door System Import XML");
            System_goal newgoal = new System_goal(999, "Test", "Test description", 1, "2021-09-21 17:27:12", "2021-09-21 17:27:12");
            que.getSystem_goal().add(newgoal);
            
            //Saving the modified analysis to be imported later by WebSTAMP
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // Formata a saída XML
            marshaller.marshal(que, new File(System.getProperty("user.dir") + "/assets/ATTXML_TrainDoorSystem.xml"));

        } catch(JAXBException | FileNotFoundException  e) {
            System.out.println("File not found.");
        } catch(Exception e){
            System.out.println("An error occurred while processing the file.");
        }
    }
}