## Howto

1. Change vm limits on worker nodes

https://www.elastic.co/guide/en/elasticsearch/reference/current/vm-max-map-count.html

   `sysctl -w vm.max_map_count=262144`

   or

   To set this value permanently, update the vm.max_map_count setting in /etc/sysctl.conf. To verify after rebooting, run sysctl vm.max_map_count.

2. [Install the operator](https://github.com/Opster/opensearch-k8s-operator)


    helm repo add opensearch-operator https://opster.github.io/opensearch-k8s-operator/
    helm install opensearch-operator opensearch-operator/opensearch-operator

3. [Install cluster with HELM...](https://github.com/Opster/opensearch-k8s-operator/blob/main/docs/userguide/cluster-chart.md)

    
    (isn't working - missing chart in repo) helm install os-cluster opensearch-operator/opensearch-cluster

4. [... or using custom object](https://github.com/Opster/opensearch-k8s-operator/blob/main/docs/userguide/main.md)


    kubectl apply -f cluster-one.yaml

5. [Optional][Install Operator Management Console](https://opster.com/docs/omc/how-to-install-the-opster-management-console/)


    helm repo add opster-omc https://opster.github.io/omc-helm/
    helm install opster-omc opster-omc/omc
    kubectl apply -f omc-ingress.yaml


