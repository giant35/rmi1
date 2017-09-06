#!/bin/bash
#java -verbose -cp ./target/rmi1-server-1.0.jar:./target/lib/rmi1-api-1.0.jar -Djava.rmi.server.codebase=file://./target/ rmi1.server.App

#mvn clean install package


#not work java -cp ./target/rmi1-server-1.0.jar:./target/lib/rmi1-api-1.0.jar \
# -Djava.rmi.server.codebase=file:/Users/sihai/Documents/demo/java/rmi1/rmi1-api/target/classes/ \
# rmi1.server.App

# rmiregistry -J-Djava.rmi.server.useCodebaseOnly=false

java -cp rmi1-server/target/rmi1-server-1.0.jar:rmi1-api/target/rmi1-api-1.0.jar -Djava.rmi.server.useCodebaseOnly=false -Djava.rmi.server.codebase=file:./rmi1-api/target/rmi1-api-1.0.jar rmi1.server.App

##test ok
#rmiregistry -J-Djava.rmi.server.codebase=file:./rmi1-api/target/rmi1-api-1.0.jar
#java -cp rmi1-server/target/rmi1-server-1.0.jar:rmi1-api/target/rmi1-api-1.0.jar rmi1.server.App
