#!/bin/bash

curl -X POST localhost:9001/actuator/shutdown
curl -X POST localhost:9002/actuator/shutdown
curl -X POST localhost:9003/actuator/shutdown