## Howto

### Change vm limits on worker nodes
https://www.elastic.co/guide/en/elasticsearch/reference/current/vm-max-map-count.html

   `sysctl -w vm.max_map_count=262144`

   or

   To set this value permanently, update the vm.max_map_count setting in /etc/sysctl.conf. To verify after rebooting, run sysctl vm.max_map_count.

### Create and set the namespace

    kubectl create ns telemetry
    kubectl config set-context --current --namespace=telemetry

### Install the engine 
1. Add helm repo. [Guide from Open Search Github](https://github.com/opensearch-project/helm-charts/blob/main/README.md)


    helm repo add opensearch https://opensearch-project.github.io/helm-charts/
    helm repo update
    helm search repo opensearch

2. Install engine helm chart Add helm repo. [Guide from Open Search Github](https://github.com/opensearch-project/helm-charts/blob/main/charts/opensearch/README.md)
    

    helm install opensearch opensearch/opensearch

### Install dashboard helm chart

1. Install dashboard helm chart [Guide from Open Search Github](https://github.com/opensearch-project/helm-charts/blob/main/charts/opensearch-dashboards/README.md)

    
    helm install opensearch-dashboards opensearch/opensearch-dashboards -f k8s/telemetry/OpenSearch/os-dashboards-config.yaml

2. Add DNS entry, matching ingress config [~~192.168.24.140 opensearch.k8s~~]
 
    
