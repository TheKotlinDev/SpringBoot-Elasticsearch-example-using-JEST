# SpringBoot Elasticsearch example using JEST
Example application using jest and elasticsearch inside Spring Boot

Using JEST, this application shows how easy it is to connect up to Elasticsearch clusters.

### Using Jest with an instance of ElasticSearch

You will need to have access to an instance of ElasticSearch (Locally or hosted).

Make sure the URI is pointing at your ElasticSearch cluster and you are good to go!
This is the default URI for ElasticSearch and should be correct provided you have not tried to change the configuration of your ElasticSearch cluster.

```yml
data:
    jest:
      uri: http://localhost:9200
```

### Using Jest without an instance of ElasticSearch

You can run this application without an ElasticSearch instance on your machine. To do this, comment out the exluded elasticsearch autoconfiguration classes in application.yml as shown below.

```yml
autoconfigure:
    exclude:
      # - org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration
      # - org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration
```

Note. This is not recommended but can be done for development purposes.

### Extra information about JEST

For any specific information about JEST, go to the GitHub repo for the project here https://github.com/VanRoy/spring-data-jest
