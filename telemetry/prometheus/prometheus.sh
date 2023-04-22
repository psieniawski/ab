#!/bin/bash

SCRIPT_DIR=$(cd "$(dirname "${BASH_SOURCE[0]}")" &> /dev/null && (pwd -W 2> /dev/null || pwd))

docker run \
    -p 9090:9090 \
    -v "$SCRIPT_DIR"/prometheus.yml:/etc/prometheus/prometheus.yml \
    prom/prometheus