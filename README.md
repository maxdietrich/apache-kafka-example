# apache-kafka-example

This is a simple example application to showcase how to talk with Apache Kafka in Scala.

## Setup instructions

### Start zookeeper
If you have installed zookeeper, start it, or run the command:

```zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties```

### Start Kafka with default configuration

```kafka-server-start /usr/local/etc/kafka/server.properties```

### Create a topic

```kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 10 --topic test_topic```
