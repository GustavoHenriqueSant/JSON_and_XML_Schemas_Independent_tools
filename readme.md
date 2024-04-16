# **Independent tools**

## Prerequisities

To execute the independent tools, you need to have [Maven (latest version)](https://maven.apache.org/download.cgi) and [JDK 16 (or higher)](https://www.oracle.com/java/technologies/javase/jdk16-archive-downloads.html) installed.

## Instalation

This project was developed in the NetBeans IDE. To use it in NetBeans, simply open the Maven projects `./JSON_portability_validation` and `./XML_portability_validation` in NetBeans and perform the 'build' operation on each of them. If you prefer to use another IDE, you can install the dependencies using the commands described below.

### I. JSON portability validation

Within the directory `./JSON_portability_validation`, execute the following command:

``` bash
mvn clean install
```

All dependencies for "JSON_portability_validation" independent toll will be properly installed.

### II. XML portability validation

Similarly, within the directory `./XML_portability_validation`, execute the command:

```bash
mvn clean install
```

All dependencies for "XML_portability_validation" independent toll will be properly installed.

# JSON and XML Schemas validation

## I. JSON portability validation

In the `./JSON_portability_validation/assets` directory, you will find an example of an analysis exported from WebSTAMP in JSON format, named `TrainDoorSystem.json`. This JSON file is read in line 24 of the 'Main.java' class located in `./JSON_portability_validation/src/main/java/com/mycompany/json_portability_test`, and the analysis is imported into the independent tool at line 26, using the [Gson library](https://github.com/google/gson). Subsequently, the imported analysis is modified in the subsequent lines, changing the project's name and adding a new 'system goal'. Finally, the modified analysis is exported from the independent tool using the Gson library and stored in the `./JSON_portability_validation/assets` directory with the name `AttJSON_TrainDoorSystem.json`.

## II. XML portability validation

In the `./XML_portability_validation/assets` directory, you will find an example of an analysis exported from WebSTAMP in XML format, named `TrainDoorSystem.xml`. This XML file is read and the analysis is imported into the independent tool in line 29 of the 'Main.java' class located in `./XML_portability_validation/src/main/java/com/mycompany/xml_portability_test`, using the [JAXB library](https://javaee.github.io/jaxb-v2/). Subsequently, the imported analysis is modified in the subsequent lines, changing the project's name and adding a new 'system goal'. Finally, the modified analysis is exported from the independent tool using the JAXB library and stored in the `./XML_portability_validation/assets` directory with the name `AttXML_TrainDoorSystem.xml`.
