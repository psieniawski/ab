# ab


## run from source
`gradle :dummy-a:boot-app:bootRun --args='--server.port=8081'`

`gradle :dummy-b:boot-app:bootRun --args='--server.port=8082'`

`gradle :dummy-ab:boot-app:bootRun --args='--server.port=8080 --dummy-a.serviceUri=http://localhost:8081 --dummy-b.serviceUri=http://localhost:8082'`

## run from jar
`gradle buildImages`

`java -jar dummy-a/boot-app/build/libs/dummy-a_boot-app-0.0.1-SNAPSHOT.jar --server.port=8081`

`java -jar dummy-b/boot-app/build/libs/dummy-b_boot-app-0.0.1-SNAPSHOT.jar --server.port=8082`

`java -jar dummy-ab/boot-app/build/libs/dummy-ab_boot-app-0.0.1-SNAPSHOT.jar --server.port=8080 --dummy-a.serviceUri=http://localhost:8081 --dummy-b.serviceUri=http://localhost:8082`


## debug
 `gradle <project>:bootRun --debug-jvm`
 
attach remote debug to the process