LOMBOK TASK

Files:
  src/Car.java  - Car model with Lombok annotations and fields only
  src/Main.java - creates and compares two separate Car objects
  lib/          - place the downloaded lombok.jar in this folder

IMPORTANT: No Maven or pom.xml is used in this project.

SETUP
1. Download the Lombok JAR from the official site:
   https://projectlombok.org/downloads/lombok.jar

2. Save the downloaded file as:
   lib/lombok.jar

3. Open IntelliJ IDEA and create a regular Java project (not Maven).
   Copy the src folder from this package into the project.

4. Add Lombok as a project library:
   - File > Project Structure > Libraries
   - Click +, choose Java, and select lib/lombok.jar
   - Ensure it is added as a dependency of your project/module.

5. Enable annotation processing:
   - Settings > Build, Execution, Deployment > Compiler > Annotation Processors
   - Check Enable annotation processing.
   - If necessary, choose Processor path and add the path to lib/lombok.jar.

6. For better editor support, open Settings > Plugins, search for Lombok,
   install/enable the Lombok plugin, and restart IntelliJ if prompted.

7. Open Main.java and click the green Run icon next to main().


