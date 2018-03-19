# lets_hangout
A dynamic web application for your indecisive friends. 
The application allows user to create hangouts, a hangout is a page containing:
  * Title - A quick sentence on the goal of the hangout. Ex "Lets go out to eat!"
  * Description - Here you can ramble off more information. Ex "Hey everyone I'm hungry! Wanna eat out!"
  * Poll - Enter options into the poll and allow the group decide where to eat. 

For anyone to see the hangout they have to be invited.

## Project Status
  Currently in development.
   * Properly hash username passwords
   * A sign-up page
   * Form validation
   * Notifiy when a user is added to a hangout, or when a login is incorrect
  
## Screenshots
  

## Prerequisites
  * IDE - I used Eclipse
  * Apache Tomcat Server
  * MySql Community Edition
The instructions will be based off of Eclipse since that is the IDE I used.
  
## Installing
  * Download the zip file and extract (you could clone using git as well)
  * Import the project into Eclipse.
    File->Import->Maven->Existing Maven Projects
  * Import the Database Schema in MySql located in the database schema folder  in the root
  * Make sure to edit the persistance-mysql.properites folder in src/main/resources. Change
    the url of the database, and user/password to what was chosen.
  * Add the Tomcat server to eclipse. You will be notified of this when running the program on the server
    for the first time if there is no server attached. Choose the directory where the server was downloaded.

Switching the persepective to Java EE is recommended. Window->Perspective->Open Perspective...

After all is done. Right clicking on the project, Run as -> Run on server,  will startup the project. You can also enter
the link into other browsers to test.

## Reflection
The purpose of this project is to learn the Java Spring Framework. 

