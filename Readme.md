# RMI demo
## 需求
JDK8+

## 运行方式一
1. `mvn clean install package`
1. `rmiregistry -J-Djava.rmi.server.useCodebaseOnly=false`
1. `java -cp rmi1-server/target/rmi1-server-1.0.jar:rmi1-api/target/rmi1-api-1.0.jar -Djava.rmi.server.useCodebaseOnly=false -Djava.rmi.server.codebase=file:./rmi1-api/target/rmi1-api-1.0.jar rmi1.server.App`
1. `java -cp rmi1-client/target/rmi1-client-1.0.jar:rmi1-api/target/rmi1-api-1.0.jar rmi1.client.App`

## 运行方式二
1. `mvn clean install package`
1. `rmiregistry -J-Djava.rmi.server.codebase=file:./rmi1-api/target/rmi1-api-1.0.jar`
1. `java -cp rmi1-server/target/rmi1-server-1.0.jar:rmi1-api/target/rmi1-api-1.0.jar rmi1.server.App`
1. `java -cp rmi1-client/target/rmi1-client-1.0.jar:rmi1-api/target/rmi1-api-1.0.jar rmi1.client.App`


## 参考
http://docs.oracle.com/javase/8/docs/technotes/guides/rmi/hello/hello-world.html
