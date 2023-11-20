## Howto

Change vm limits on worker nodes

https://www.elastic.co/guide/en/elasticsearch/reference/current/vm-max-map-count.html

`sysctl -w vm.max_map_count=262144`

or

To set this value permanently, update the vm.max_map_count setting in /etc/sysctl.conf. To verify after rebooting, run `sysctl vm.max_map_count`.


[Installation instructions](https://www.elastic.co/guide/en/cloud-on-k8s/current/k8s-deploy-eck.html)

    helm repo add elastic https://helm.elastic.co
    helm repo update
    helm install elastic-operator elastic/eck-operator -n elastic-system --create-namespace
    helm install elastic elastic/eck-stack -n elastic-stack --create-namespace -f values.yaml
    
    kubectl apply -f kibana-ingress.yaml

Add DNS mapping for Kibana ingress endpoint, eg.

    192.168.24.140 kibana.k8s

Get password for Kibana user (elastic)

    kubectl get secret elasticsearch-es-elastic-user -n elastic-stack -o=jsonpath='{.data.elastic}' | base64 --decode; echo
Go to Kibana console - http://kibana.k8s
