

#Crear el arquetipo localmente


mvn archetype:create-from-project



cd target/generated-sources/archetype


mvn install




# Crear un proyecto usando el arquetipo

mvn archetype:generate \
    -DarchetypeGroupId=com.zenta.archetype \
    -DarchetypeArtifactId=spring-boot-basic \
    -DarchetypeVersion=1.0.0