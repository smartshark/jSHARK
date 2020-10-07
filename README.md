About
=====
jSHARK is a library that provides models and tools that makes working with the SmartSHARK environment more comfortable
for the Java programming language.


How To Use
==========

At first, the library needs to be installed in your local maven repository via 

```bash
mvn install
```

Then you need to integrate the installed library and morphia as a dependency to your project
```xml
<dependencies>
    <dependency>
        <groupId>io.github.smartshark</groupId>
        <artifactId>jSHARK</artifactId>
        <version>2.0.4</version>
    </dependency>
    <dependency>
        <groupId>org.mongodb.morphia</groupId>
        <artifactId>morphia</artifactId>
        <version>1.3.2</version>
    </dependency>
</dependencies>
```

Afterwards, the models (used for working with the database) can be used in the following way

```java
// Telling morphia where to find the models
final Morphia morphia = new Morphia();
morphia.mapPackage("de.ugoe.cs.smartshark.model");

// Creating a connection to the database
MongoClientURI uri = new MongoClientURI("mongodb://<user>:<password>@<host>:<port>/?authSource=<authentication>");
MongoClient mongoClient = new MongoClient(uri);
final Datastore datastore = morphia.createDatastore(mongoClient, "<database_name>");
```


Limitations
===========
Currently, as Morphia does not support GridFS, we do not provide access to the Mynbou Data files via Models.
