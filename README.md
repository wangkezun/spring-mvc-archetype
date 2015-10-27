## Just for fun!
this is a maven archetype for spring-mvc



Local Install
-------------
clone repository
cd spring-mvc-archetype (or your custom clone location)
mvn install


Use
---

mvn archetype:generate \
  -DarchetypeGroupId=com.wkz \
  -DarchetypeArtifactId=spring-mvc-archetype \
  -DarchetypeVersion=1.0-RELEASE \
  -DgroupId=your_group_id \
  -DartifactId=your_artifact_id \
  -Dpackage=your_package_name