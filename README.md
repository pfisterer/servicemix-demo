# Run Apache Servicemix in a Docker container
(e.g. https://registry.hub.docker.com/u/mkroli/servicemix/)

docker run --rm –t -i \
  --name servicemix \
  -p 1099:1099 -p 8101:8101 -p 8181:8181 -p 61616:61616 -p 36888:36888 -p 44444:44444 \
  -v /host/path/deploy:/deploy mkroli/servicemix

Replace /host/path/deploy with a fully qualified path on your local filesystem

Install some features
* feature:install webconsole
* feature:install camel-jetty
* feature:install camel-xmljson

# Import the project into an IDE (e.g., Eclipse)

# Build the project using Maven

## Compile to a deployable JAR
mvn package

## Copy the resulting target/*.jar to the deploy folder
cp target/servicemix-osgi-demo.jar ../deploy/

# Install the bundle in ServiceMix
## Enter the container
docker exec -t -i servicemix /opt/servicemix/bin/client

##Install and start the bundle: 
- bundle:install file:///deploy/servicemix-osgi-demo.jar
- bundle:start <the ID of the bundle>

## Obtain information about the route
- route-list
- route-info <the ID of the route>
- log:tail
