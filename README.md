mvn clean package
docker login -u *** -p ***
docker build -t imalouhov/prometheus-homework:0.0.1 .
docker push imalouhov/prometheus-homework:0.0.1

#Run Windows PowerShell as Administrator:
Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Hyper-V -All
minikube start --vm-driver hyperv # --force
minikube start --vm-driver hyperv --memory=max --cpus=max
minikube addons enable ingress

kubectl apply -f ./manifests
kubectl get pod

helm repo add prometheus-community https://prometheus-community.github.io/helm-charts
helm repo update
helm install prometheus -f ./prometheus/prometheus.yaml prometheus-community/kube-prometheus-stack
kubectl apply -f ./prometheus
kubectl describe pod prometheus

helm install grafana -f ./grafana/grafana-values.yaml bitnami/grafana
kubectl port-forward svc/grafana 3000:3000

helm del $(helm ls --all --short)
kubectl delete all --all --all-namespaces
kubectl delete namespace --all


https://minikube.sigs.k8s.io/docs/handbook/vpn_and_proxy/
helm del $(helm ls --all --short)
kubectl delete all --all --all-namespaces
kubectl delete namespace --all
minikube delete
docker system prune

mvn clean package
docker login -u *** -p ***
docker build -t imalouhov/prometheus-homework:0.0.1 .
docker push imalouhov/prometheus-homework:0.0.1

#Run Windows PowerShell as Administrator:
Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Hyper-V -All
minikube start --vm-driver hyperv # --force
minikube addons enable ingress
minikube addons enable metrics-server
minikube addons enable dashboard
helm repo add prometheus-community https://prometheus-community.github.io/helm-charts
helm repo update
helm install prometheus prometheus-community/prometheus -f ./prometheus/values.yaml
kubectl get pod
minikube kubectl -- get pods -A
kubectl describe pod prometheus-server-5dbdb658f9-v8rgv 
kubectl port-forward service/prometheus-server 9090:80
http://localhost:9090
helm repo add grafana https://grafana.github.io/helm-charts
helm repo update
helm install grafana grafana/grafana
kubectl port-forward service/grafana 3000:80
kubectl get secret --namespace default grafana -o jsonpath="{.data.admin-password}"
http://localhost:3000
#Login using admin / base64 decoded pass
cd "C:\Users\pusto\Documents\java projects\prometheus-homework"
kubectl apply -f ./manifests/workloads
#Login to the Grafana web interface.
#Add Prometheus as a data source:
#Click on the “Connections” gear icon in the left sidebar.
#Select “Data Sources” and click on “Add data source.”
#Choose “Prometheus” as the data source type.
#Enter Prometheus server URL as http://<prometheus-server>
helm del $(helm ls --all --short)
kubectl delete all --all --all-namespaces
kubectl delete namespace --all
minikube delete
docker system prune