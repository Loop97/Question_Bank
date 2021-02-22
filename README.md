# Question_Bank
A web app to allow user to enter a question according to their choosing. This webapp is using Vue.js for it's front end and is suppose to intergrate Spring Boot framework to handle the API, service and application layers. Postgresql is supposedly used for this project.

# Installation
For Vue.js
1. Enter the client folder and run command "npm install"
2. If, no errors from dependencies, run commnad "npm start"

For Spring Boot
1. Enter the server folder and run command "mvn clean install"
2. If build is succesful run "./mvnw spring-boot:run"

REMARK: \
This project is unsuccesful in intergarting the Spring Boot Framework with the postgresql db.\
An error appears whenever the project is build.\
It's narrowed down that the issue is coming from the JPA dependency of Spring Boot but I am yet to solve this issue. {build is succeful when dependancy is commented out,however it is need to pass data from the front end to the back end}\
A version of Spring Boot with that error has been labeled as the "demo"folder. Foolow the isntallation steps for Spring Boot to view the error.

A form validation can be conducted by adding the VUE FORMULATE dependency as well to the client folder.\
However it is not shown here as that version of the code has been deleted when too many errors where present after trying to intergrate Spring Boot. In hindsigt a push to the repo was required.

# Database Schema
  ![](assests/db_schema.png) \
  The question content will depend on the selection made in the question type input this will reference to the question type table accordingly.
  A head on method would be to persisted reference every single field in the single, multiple and open_ended table fields accroding to the question type input.
 
# Future Improvements
The first issue would be to tackle the dependency issue and if it cannot be solved, abanddoning the dependency to find a different method would have been better. However due to limited knowledge with Sprin Boot I was not sure if this was the best method to retreive data and due to the interest in time as well.

A test page would be created for users to test if the questions they have created is working or to their desire.\
I would also implement the grading system for the questions as well, where users are required to enter answers to their questions as well. They may do so for creating and editign the page as well. The grading scheme would be as follows: (number of selected option = correct answer)/total correct answers. 

For Open ended questions, the grading scheme would be according to the number of keywords or key phrases entered by the user. However the author of the question would require to input the keywords/phrases when creating the question.

Authentication would be next to ensure that users are only allowed to edit the questions that they created too.

