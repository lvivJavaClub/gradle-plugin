# Gradle plugin
Project contains 2 modules the plugin and project where created plugin is applied.

## Setup gradle(latest gradle 4.2 was used)
If you do not have gradle - use sdkman to setup any version of gradle you need http://sdkman.io

```bash
curl -s get.sdkman.io | bash

sdk install gradle 4.2
```
or use gradle wrapper that is configured to 4.2 version (gradlew.bat for windows | ./gradlew for unix)

## Build plugin
```bash
cd plugin/
gradle install
```
## Build project
```bash
cd project/
gradle clean build
```
## Expected output with applied plugin
```bash
> Configure project :
The name of the project, plugin applied to is: project 
``` 


## TODO Items
- [x] Create base plugin implementation
- [x] Publish plugin artifact
- [x] Create project to use plugin
- [ ] Add git service for reading avg of git users and form basic stat
- [ ] Add configuration of output (1.file 2.console)
- [ ] Add dependent tasks
- [ ] generate and inject commiters txt file into artifact jar of project