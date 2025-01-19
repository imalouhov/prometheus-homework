mvn clean package
docker login -u *** -p ***
docker build -t imalouhov/prometheus-homework:0.0.1 .
docker push imalouhov/prometheus-homework:0.0.1

#Run Windows PowerShell as Administrator:
Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Hyper-V -All
minikube start --vm-driver hyperv # --force
minikube addons enable ingress

kubectl apply -f ./manifests
kubectl get pod

helm repo add prometheus-community https://prometheus-community.github.io/helm-charts
helm repo update
helm install prometheus -f ./prometheus/prometheus.yaml prometheus-community/kube-prometheus-stack
kubectl apply -f ./prometheus

helm install grafana -f ./grafana/grafana-values.yaml bitnami/grafana
kubectl port-forward svc/grafana 3000:3000

helm del $(helm ls --all --short)
kubectl delete all --all --all-namespaces
kubectl delete namespace --all