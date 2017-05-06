# apache-kafka-example

This is a simple example application to showcase how to talk with Apache Kafka in Scala.

## Setup instructions

### Start zookeeper
If you have installed zookeeper, start it, or run the command:

```bin/zookeeper-server-start.sh config/zookeeper.properties```

### Start Kafka with default configuration

```bin/kafka-server-start.sh config/server.properties```

### Create a topic

```bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 10 --topic test_topic```
