## Howto

### Install
1. Add HELM repo

        helm repo add fluent https://fluent.github.io/helm-charts
        helm search repo fluent

2. [Install Operator](https://github.com/fluent/helm-charts/tree/main/charts/fluent-operator)

        helm install fluent-operator --create-namespace -n telemetry fluent/fluent-operator  --set containerRuntime=containerd
3. Install FluentBit

      