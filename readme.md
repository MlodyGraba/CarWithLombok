# Lombok in Java class

## Description:
Example of using Lombok library in Java project to simplify code

## Installation:
1. **Clone the repository:**
```bash
git clone https://github.com/MlodyGraba/CarWithLombok.git
cd CarWithLombok
```
2. **Set up the environment:**
* Ensure you have JDK 8 or later intalled
* Install IntelliJ IDEA: [Download IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
3. **Import the project into IntelliJ IDEA:**
* Open IntelliJ IDEA.
* Click on `File` > `New` > `Project from Existing Sources...`.
* Select the cloned repository directory.
* Choose `Import project from external model` and select `Maven`.
* Follow the prompts to complete the project import.
4. **Add Lombok to the project:**
* Add Lombok to your `pom.xml` file:
```xml 
 <dependencies>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.34</version>
        <scope>provided</scope>
    </dependency>
    </dependencies>
```
* Enable annotation processing in IntelliJ IDEA:
- Go to `File` > `Settings` > `Build, Execution, Deployment` > `Compiler` > `Annotation Processors`.
- Check `Enable annotation processing`.
5. **Build the project:**
- In IntelliJ IDEA, open the `Maven` tool window.
- Click on the `Reimport All Maven Projects` icon to sync the dependencies.
- Build the project by clicking `Run` > `Build Project` or by pressing `Ctrl`+`F9`.
## System Requirements
- JDK 8 or later
- IntelliJ IDEA

## Author:
### Name:
Adrian Grabowski