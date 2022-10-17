# Build dummy-a
custom_build(
    # Name of the container image
    ref = 'ghcr.io/psieniawski/dummy-a',
    # Command to build the container image
    command = './gradlew :dummy-a:boot-app:bootBuildImage --imageName $EXPECTED_REF',
    # Files to watch that trigger a new build
    deps = ['dummy-a/build.gradle', 'dummy-a/src']
)

# Build dummy-b
custom_build(
    # Name of the container image
    ref = 'ghcr.io/psieniawski/dummy-b',
    # Command to build the container image
    command = './gradlew :dummy-b:boot-app:bootBuildImage --imageName $EXPECTED_REF',
    # Files to watch that trigger a new build
    deps = ['dummy-b/build.gradle', 'dummy-b/src']
)

# Build dummy-ab
custom_build(
    # Name of the container image
    ref = 'ghcr.io/psieniawski/dummy-ab',
    # Command to build the container image
    command = './gradlew :dummy-ab:boot-app:bootBuildImage --imageName $EXPECTED_REF',
    # Files to watch that trigger a new build
    deps = ['dummy-ab/build.gradle', 'dummy-ab/src']
)

# Deploy
k8s_yaml(['k8s/deployment.yml', 'k8s/service.yml'])

# Manage
k8s_resource('dummy-ab', port_forwards=['9001'])