# About

A simple Java API for re-projecting coordinates based on datums using GDAL.

# Developing

First clone the repository:

```bash
$ git clone https://github.com/VertNet/reproject.git
$ cd reproject
```

Project dependencies, compiling, and building are all handled using [Maven](http://maven.apache.org), so make sure you have that installed first. Then, to compile the project:

```bash
$ mvn compile
```

To package it up into a standalone JAR with all dependencies into the `target` directory:

```bash
$ mvn assembly:single
$ ls target | grep jar
reproject-1.1.1-SNAPSHOT.jar
reproject-1.1.1-SNAPSHOT-jar-with-dependencies.jar
```

Finally you can run it like this:

```bash
$ java -cp target/reproject-1.1.1-SNAPSHOT-jar-with-dependencies.jar org.vertnet.Reproject 1 -2 "wgs84"
Hello Reproject!
Point2D.Double[0.0, 0.0]
```
