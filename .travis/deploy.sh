#!/bin/sh
mvn clean deploy --settings .maven.xml -DskipTests=true -Prelease