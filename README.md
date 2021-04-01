# Microservices

## Basic microservice

Contains the basics of a microservice, a rest controller, a connection with a file based database, entities, repositories and a connection with other microservice throw a feing client.

## Hidden microservice

This microservice only will be accessible from local network and not from outside, similar to the basic but only accessible for other microservices, just for testing purposes of the feing client.

## Auth microservice

Contains the basics of spring security for authentication.

## Gateway

Contains the routes to the other services and works like a first step to reach the other services.

## Discovery service

Shows all the local microservices available when they register in it.