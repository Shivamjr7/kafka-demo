# kafka-demo
Demo project with Spring boot and kafka

## How it works ?

• Producers produce the message and send to brokers 
• Consumers consume the message from brokers
• Zookeeper manages the brokers
• Brokers are cluster of machines/servers which stores the data
• Inside brokers there are topics which are partitioned and replicated 
• Each partition will have offset

## Producer

• Producer will produce the Message
• Message will have key , value , headers 
• Producers have buffers where the keep the data before sending it to cluster and send it in batches 
• Also the key and value is serialized to byte and byte array to send over the network 
• Then comes Partitioner which knows which data tot write to which partition in a broker
• Data is always written to leader partition and followers use fetch protocol to be in sync , called as In Sync Replicas
• There are other configs also like max.block.ms , linger.ms


## Spring config 

• We have to create a Producer config , specify the bootstrap servers so producer and consumer knows about the leaders
• We also have to create consumer config 
• KafkaTemplate is used to send message from broker
• Kafka listener class is used to consume messages written to particular topic 