ROADDesigner
============

ROAD Designer is built as an Eclipse plugin using Eclipse GMF (Graphical Modeling Framework). It allows users to design ROAD composites using a graphical interface with all elements are either selectable from the pallette tool or editable through widgets. 

ROAD Designer is one component of the ROAD framework toolchain. Graphically designed ROAD composite will be transformed to XML description which is then deployed on ROADFactory to produce runtime ROAD composite.

This repository comprises of the following 5 projects:
 1. au.edu.swin.ict.road.designer
 2. au.edu.swin.ict.road.¬designer.diagram
 3. au.edu.swin.ict.road.designer.edit
 4. jars
 5. ROAD4RaaS

The first three projects are the source code for ROAD Designer. The jars project contains ROAD Designer binaries which are deployable Eclipse plugins. And the ROAD4RaaS project is a sample ROAD composite based on RaaS (Repository as a Service) case study.

Prerequisites
 * Eclipse Galileo 3.5 with Eclipse Modeling Tool: http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/galileo/SR2/eclipse-modeling-galileo-SR2-incubation-win32.zip
 * Drools 5.1.0: http://download.jboss.org/drools/release/5.1.0.34406.FINAL/
 
ROAD Designer can be used either as deployable Eclipse plugins or Java projects launched as an Eclipse application.

Using ROAD Designer as Eclipse plugins
 * Copy three plugin jar files (found under jars project) to the dropins folder of Eclipse

Using ROAD Designer as Java projects
 * Open plugin.xml of any of three projects (au.edu.swin.ict.road.designer, au.edu.swin.ict.road.¬designer.diagram, au.edu.swin.ict.road.designer.edit) & select “Launch an Eclipse application”

Create a ROAD composite from scratch
 * After starting Eclipse, create a new Drools project.
 * Within created project, create a new folder, called "ROAD4RaaS", for storing all diagram & xml files
 * Within this folder, create a new "Smc diagram" by clicking "File > New > Other..." & search for "Smc diagram"
 * Choose a file name & click "Finish"
 * From here, start modeling and configuring the Composite. Some properties can be edited from Properties view, others are by double-clicking elements in the Canvas. In particular, Role, Contract have additional UIs by double-clicking
 * Note that the editor has two tabs. The first tab displays the diagram, the second tab displays Composite XML which conforms to the ROAD XML Schema supported by the ROADFactory.

Import ROAD4RaaS project
 * This project is under the ROAD Designer repository
 * Import the project into Eclipse
 * ROAD4RaaS composite is available under ROAD4RaaS\ROADDesigner\ROAD4RaaS.road_diagram 

Screenshots from the ROAD4RaaS project

Contact
 * Tuan Nguyen <tmnguyen@swin.edu.au>
