#!/bin/bash

SCRIPT_DIR=$(cd "$(dirname "${BASH_SOURCE[0]}")" &> /dev/null && (pwd -W 2> /dev/null || pwd))

(cd "$SCRIPTS_DIR" || exit; ./gradlew dummy-a:boot-app:bootRun --args='--server.port=9001'  || exit) &
(cd "$SCRIPTS_DIR" || exit; ./gradlew dummy-b:boot-app:bootRun --args='--server.port=9002'  || exit) &
(cd "$SCRIPTS_DIR" || exit; ./gradlew dummy-ab:boot-app:bootRun --args='--server.port=9003 --dummy-a.serviceUri="http://localhost:9001" --dummy-b.serviceUri="http://localhost:9002"'  || exit)