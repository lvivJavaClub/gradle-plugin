# Gradle plugin
Project contains 2 modules the plugin and project where created plugin is applied.

## Setup gradle
If you do not have gradle - use sdkman to setup any version of gradle you need http://sdkman.io

```bash
curl -s get.sdkman.io | bash
```
or use gradle wrapper (gradlew.bat for windows | ./gradlew for unix)

## Build plugin
```bash
gradle install
```
## Build project
```bash
gradle clean build
```


## TODO Items
- [x] Create base plugin implementation
- [x] Publish plugin artifact
- [x] Create project to use plugin
- [ ] Add git service for reading avg of git users and form basic stat
- [ ] Add configuration of output (1.file 2.console)
- [ ] Add dependent tasks
- [ ] generate and inject commiters txt file into artifact jar of project