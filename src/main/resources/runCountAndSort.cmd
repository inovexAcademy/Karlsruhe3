@echo off
call mvn -DskipTests package>mvn-log.txt
call java -cp target\\Day4-0.0.1-SNAPSHOT.jar de.inovex.academy.csd.countandsort.CounterAndSorter %1
