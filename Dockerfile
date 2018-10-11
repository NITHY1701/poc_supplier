From openjdk:8
copy ./target/poc_supplier-0.0.1-SNAPSHOT.jar poc_supplier-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","poc_supplier-0.0.1-SNAPSHOT.jar"]