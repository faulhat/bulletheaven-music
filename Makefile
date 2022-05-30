.DEFAULT_GOAL := build

build:
	mvn clean package

run:
	java -cp target/bulletmusic-jar-with-dependencies.jar io.github.tafaulhaber590.bulletmusic.App

build-run: build run
