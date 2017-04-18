package com.github.dietmax

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

import scala.util.Random

object ProducerExample extends App {
  val events = 1000000
  val topic = "test_topic"
  val brokers = "localhost:9092"
  val rnd = new Random()
  val props = new Properties()
  props.put("bootstrap.servers", brokers)
  props.put("client.id", "ScalaProducerExample")
  props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")


  val producer = new KafkaProducer[String, String](props)
  val t = System.currentTimeMillis()
  for (nEvents <- Range(0, events)) {
    val randomNumber = rnd.nextInt(255).toString
    val msg = s"Event number $nEvents : I created the random number " + randomNumber
    val data = new ProducerRecord[String, String](topic, randomNumber, msg)

    producer.send(data)
  }

  val millisToFinish = System.currentTimeMillis() - t
  println(s"Sent $events in $millisToFinish ms.")
  producer.close()
}
