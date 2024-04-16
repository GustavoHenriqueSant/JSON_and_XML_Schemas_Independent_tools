/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.json_portability_test;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

/**
 *
 * @author Gustavo
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try{
            //Reading the STPA analysis from the JSON file and transforming it into a Project object, including all relationships between entities.
            String json =  new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/assets/TrainDoorSystem.json")));
            Gson gson_object = new Gson();
            Project projeto = gson_object.fromJson(json, Project.class);
            //==================================================================================================================================================================================
            //Modification of the original analysis: addition of a new system goal, and change in the project name
            projeto.setName("ATT Train Door System JSON");
            System_goals sg = new System_goals(999, "Teste", "Description", 1, "2021-09-21 17:27:12", "2021-09-21 17:27:12");
            projeto.getSystem_goals().add(sg);
            //==================================================================================================================================================================================
            //Saving modified analysis in this tool, to be imported later by WebSTAMP
            json = gson_object.toJson(projeto);
            FileWriter fileWriter = new FileWriter(System.getProperty("user.dir") + "/assets/AttJSON_TrainDoorSystem.json");
            fileWriter.write(json);
            fileWriter.close();
        } catch (FileNotFoundException | NoSuchFileException e){
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("An error occurred while processing the file.");
        }
    }
}
