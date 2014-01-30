# ROADDesigner 1.0

ROAD Designer is built as an Eclipse plugin using Eclipse GMF (Graphical Modeling Framework). It allows users to design ROAD composites using a graphical interface with all elements are either selectable from the pallette tool or editable through widgets. Graphically designed ROAD composite will be transformed to XML description which is then deployed on ROADFactory to produce runtime ROAD composite.

ROAD Designer is one of three components of the ROAD framework toolchain. Other components are:
 * ROADfactory (https://github.com/road-framework/ROADFactory)
 * ROAD4WS (https://github.com/road-framework/ROAD4WS)
  
More information about ROAD framework (Role-Oriented Adaptive Design) can be found from http://www.swinburne.edu.au/ict/success/research-projects-and-grants/role-oriented-adaptive-design/

For questions or comments please contact Tuan Nguyen (tmnguyen at swin dot edu dot au).

## Repository structure
This repository comprises of the following 5 projects:
 1. au.edu.swin.ict.road.designer
 2. au.edu.swin.ict.road.¬designer.diagram
 3. au.edu.swin.ict.road.designer.edit
 4. jars
 5. ROAD4RaaS

The first three projects are the source code for ROAD Designer. The jars project contains ROAD Designer binaries which are deployable Eclipse plugins. And the ROAD4RaaS project is a sample ROAD composite based on RaaS (Repository as a Service) case study.

## Prerequisites
 * Eclipse Galileo 3.5 with Eclipse Modeling Tool: http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/galileo/SR2/eclipse-modeling-galileo-SR2-incubation-win32.zip
 * Drools 5.1.0: http://download.jboss.org/drools/release/5.1.0.34406.FINAL/

## How to use ROAD Designer
ROAD Designer can be used either as deployable Eclipse plugins or Java projects launched as an Eclipse application.

### Using ROAD Designer as Eclipse plugins
 * Copy three plugin jar files (found under jars project) to the dropins folder of Eclipse

### Using ROAD Designer as Java projects
 * Open plugin.xml of any of three projects (au.edu.swin.ict.road.designer, au.edu.swin.ict.road.¬designer.diagram, au.edu.swin.ict.road.designer.edit) & select “Launch an Eclipse application”

### Create a ROAD composite from scratch
 * After starting Eclipse, create a new Drools project.
 * Within created project, create a new folder, called "ROAD4RaaS", for storing all diagram & xml files
 * Within this folder, create a new "Smc diagram" by clicking "File > New > Other..." & search for "Smc diagram"
 * Choose a file name & click "Finish"
 * From here, start modeling and configuring the Composite. Some properties can be edited from Properties view, others are by double-clicking elements in the Canvas. In particular, Role, Contract have additional UIs by double-clicking
 * Note that the editor has two tabs. The first tab displays the diagram, the second tab displays Composite XML which conforms to the ROAD XML Schema supported by the ROADFactory.

### Import ROAD4RaaS project
 * This project is under the ROAD Designer repository
 * Import the project into Eclipse
 * ROAD4RaaS composite is available under ROAD4RaaS\ROADDesigner\ROAD4RaaS.road_diagram 

## Screenshots from the ROAD4RaaS project
 * Screenshots are available on the wiki page (https://github.com/road-framework/ROADDesigner/wiki)

## Bug report
 * Tuan Nguyen <tmnguyen at swin dot edu dot au>
 * Make sure to provide as much details as possible.
  
## Acknowledgement
This project has been researched & developed by Swinburne University of Technology partly with the support of Smart Services CRC. To find out more about Smart Services please visit www.smartservicescrc.com.au. 
