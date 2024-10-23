# SOFTWARE PERSONNEL MANAGEMENT SYSTEM 

<img src="https://squeezegrowth.com/wp-content/uploads/2022/12/1549-Best-School-Management-Software-rev.png" alt="Logo of the project" align="center">

The Software Personnel Management System (Employee Management System) is a software, that helps your employees to give their best efforts every day to achieve the goals of your organization. It guides and manages employees efforts in the right direction. It also securely stores and manages personal and other work-related details for your employees.

[jdk19]: https://download.oracle.com/java/19/archive/jdk-19_windows-x64_bin.exe

# Installing / Getting started
## Developing


## Built With
1. Eclipse IDE
2. jdk-18.0.2.1
3. mysql-connector.jar
4. xampp-windows-x64-8.0.9-0-VS16
5. mysql


## Prerequisites
What is needed to set up the dev environment. For instance, global dependencies or any other tools. include download links.
1. https://www.eclipse.org/downloads/
2. https://www.apachefriends.org/download.html


## Setting up Dev
Here's a brief intro about what a developer must do in order to start developing
the project further:

```bash
    > git clone https://github.com/ramprasathmk/Software-Personnel-Management-System.git
    > cd Software-Personnel-Management-System
```

- **Step 1:** Deployee Database
    - Goto __`XAMPP Control Panel`__ , open __`Apache`__ and __`MySQL`__ server
    - Open __`Chrome`__ or your fav browser and serach:  _http://localhost/phpmyadmin/_
    - Create new __`Database`__ and name it as __`project3`__ 
    - Then goto __`import`__ navigater
    - Choose your Database file __`project3`__ and upload there, Then click __`Go`__

- **Step 2:** Install JDK & Eclipse step by step
    - Download [Java JDK-19][jdk19]
    - no need Additional features

- **Step 3 :** open Project Folder in Eclipse
    - Run `Front_Page.java` by clicking the play button

## Note
- For __Testing__ the `test cases`, you've to install the __JUnit Tools 4 Spring 1.2.4__ plugin in __Eclipse__ from the __Eclipse Marketplace__.
- __JUnit Tools 4 Spring__ `1.2.4` plugin with any version.


## Building
Now, you need to change some line as per your connecton :
#### JDBC Connecter 
##### open .classpath file and change
```xml
	<classpathentry kind="lib" path="./Software-Personnel-Management-System/mysql-connecter/mysql-connector.jar"/>
		<!-- path="D:/College/Employee_Project/Employee-Management-System/mysql-connecter/mysql-connector.jar"  --> 
		<!-- set the path of where your mysql connecter location. like my current location
		D:\College\Employee_Project\Employee-Management-System\mysql-connecter -->
	<classpathentry kind="output" path="bin"/>

```
##### JDK connecter
###### open conn.java file and change
```xml
	<classpathentry kind="lib" path="./Software-Personnel-Management-System/mysql-connecter/mysql-connector.jar"/>
		<!-- path="D:/College/Employee_Project/Employee-Management-System/mysql-connecter/mysql-connector.jar"  --> 
		<!-- set the path of where your mysql connecter location. like my current location
		D:\College\Employee_Project\Employee-Management-System\mysql-connecter -->
	<classpathentry kind="output" path="bin"/>

```

you can change you code as per your Requirement.


## Deploying / Publishing
- Goto `Front_Page.java` and simply run the file.


## Style guide / Testing
Run Step by Step As per your Requirements. 
We have provided Output images for you Understanding
See in Output_images Folder.

How to work Our Application .

1. Welcome page
2. Login page
    - Login with Username or Employee ID & Password
    - Signup & Forgot Password 
3. Home page 
    - Employee 
    - Salary
    - Attendance
    - About US
4. Employee Panel
    - Add Employee
    - Update Employee
    - View Employee
    - Remove Employee
5. Attendance Panel
    - Fill Attendance
    - View Attendance
6. salary Panel
    - Add Salary
    - Update Salary
    - Generate Payment slips 
7. About US Panel


## Database
- Goto Xampp Control panel , Start the **Apache** and **MySQL** server
- Goto Chrome or your convinent browser and Type:  **http://localhost/phpmyadmin**
- Create  new database name **project3** 
- Then goto **import** navigater
- Choose your Database file **"project3"** and upload there and click to **Go**


## Collaborators
- [Ramprasath M K](https://github.com/ramprasathmk/)
- [Sailesh Babu C](https://github.com/Sailesh1200/)
- [Santhosh R](https://github.com/SanthoshRavichandran07/)


## License
- This project is licensed under <a href="./LICENSE"> Apache License 2.0 </a> 2024.


## Show your support

Give a ⭐ if you like this repository!

<a href="https://www.buymeacoffee.com/ramprasathmk" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-red.png" alt="Buy Me A Coffee" height= "60px" width= "217px" ></a>
