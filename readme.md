create maven project
mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.nocompany.app -DartifactId=swing-learning


How to run:
mvn clean package
cd ./target
java -cp swing-learning-1.0-SNAPSHOT.jar com.nocompany.app.App