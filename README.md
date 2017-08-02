# [Log Management with Graylog, Elasticsearch, MongoDB, Nginx, Fluentd and Docker](https://www.graylogbook.com)

![Graylog Book](/images/graylog-book.png)

In this hands-on book, you will learn how to centralize and manage logs using the awesome open source Graylog2 and create a scalable, high-throughput and high-available log processing production infrastructure deploying Elasticsearch and MongoDB clusters as well as Nginx on top of Docker containers. Besides, we will use Fluentd to send logs to many outputs, such as GELF and Amazon S3.
 
To make everything even more realistic, we will create our whole environment using different virtual machines managed by Vagrant (deploying everything to "localhost" is not that exciting, you know?). Just grab a beer, open a terminal, type "vagrant up" and have fun!

# Contents

Part 1: Centralized Log Management

Chapter 1: The DevOps culture

Chapter 2: Centralized logging
    2.1 Have you ever? cat messages.log | grep -i "ERROR"
    2.2 Advantages and challenges

Chapter 3: Introduction to Graylog
    3.1 Graylog components
    3.2 Set up Graylog with a single Docker container
    3.3 Graylog Web interface
    3.4 Send a "Hello World" message through Raw TCP Input

Part 2: Graylog Production Setup

Chapter 4: Elasticsearch
    4.1 Elasticsearch architecture
    4.2 Shards
    4.3 Replicas
    4.4 Types of Nodes: Master Elegible, Data and Client
    4.5 Understand elasticsearch.yml main properties
    4.6 Elasticsearch Docker image
    4.7 Spin up a 3-node cluster using Vagrant and Docker
    4.8 Understand Elasticsearch GREEN, YELLOW and RED status
    4.9 Monitoring Elasticsearch using plugins
    4.10 Elasticsearch Tuning Tips: 
        4.10.1 File Descriptors
        4.10.2 Disable swap
        4.10.3 JVM HEAP size
        4.10.4 JVM Garbage Collectors
        4.10.5 Thread Pool
        4.10.6 Flush interval
        4.10.7 Number of shards
        4.10.8 Number of replicas

Chapter 5: MongoDB
    5.1 Replica Sets
    5.2 MongoDB Docker image
    5.3 Spin up a 2-node cluster using Vagrant and Docker

Chapter 6: Graylog Server
    6.1 Understand graylog.conf main properties
    6.2 Graylog Docker image
    6.3 Spin up a 2-node cluster using Vagrant and Docker

Chapter 7: Nginx
    7.1 Nginx overview
    7.2 Nginx as a Reverse Proxy
    7.3 Nginx Docker image
    7.4 Set up a Nginx Load Balancer using Vagrant and Docker

Part 3: Send Logs to Graylog

Chapter 8: Send server logs using Rsyslog (Syslog UDP)
Chapter 9: Graylog Extractors
Chapter 10: Graylog Streams
Chapter 11: Graylog Alerts
    11.1 Create SMTP credentials on Amazon Simple Email Service (SES)
    11.2 Set up Graylog to send e-mail messages
    11.3 Send email alert when ssh access fail 3 times in a minute
  
Chapter 12: Graylog Extended Log Format (GELF)
    12.1 Send GELF messages via HTTP
    12.2 Send GELF messages using curl

Chapter 13: Book Sample App: log-generator-app (Spring Boot)
    13.1 Application endpoints
    13.2 Logback overview
    13.3 Log4j2 overview
    13.4 TCP vs UDP
    13.5 Send logs using Logback GELF appender
    13.6 Send logs using Log4j2 GELF appender
    13.7 Set up Nginx as a reverse proxy
    13.8 Install Nginx Content Pack in Graylog
    13.9 Send Nginx access and error logs to Graylog via Syslog UDP
    13.10 Graylog Dashboards
    13.11 Graylog Geolocation

Part 4: Send Logs to Graylog using Fluentd

Chapter 14: The mess diagram
    14.1 What if you need to store logs in Amazon S3?
  
Chapter 15: Introduction to Fluentd
    15.1 Fluentd Docker image
    15.2 Fluentd example
    15.3 Fluentd Plugin Types
        15.3.1 Input
        15.3.2 Output
        15.3.3 Buffer
        15.3.4 Filter
        15.3.5 Parser
        15.3.6 Formatter

Chapter 16: Fluent Single Instance
    16.1 Architecture diagram
    16.2 Set up Fluentd Single Instance architecture
    16.3 Send server logs to Fluentd using Rsyslog (Syslog UDP)
    16.4 Set up Fluentd to store logs in Amazon S3
    16.5 Rotate logs from Amazon S3 to Amazon Glacier
    16.6 Send Nginx logs to Fluentd via Syslog UDP
    16.7 Send log-application-app logs to Fluentd using Logback Fluentd Appender
    
Chapter 17: Fluentd Tuning
    17.1 ulimit
    17.2 num_threads
    17.3 multi_process plugin

Chapter 18: Fluent High Availability
    18.1 Architecture diagram
    18.2 Send server logs to Fluentd Forwarder using Rsyslog (Syslog UDP)
    18.3 Send Nginx logs to Fluentd Forwarder via Syslog UDP
    18.4 Set up Forwarders to load balance among Aggregator instances
    18.5 Set up Forwarders to write to disk in case of Aggregators outage
    18.6 Set up Aggregator instances to relay logs to Graylog via GELF
    18.7 Twelve-Factor Applications
        18.7.1 XI: Logs
    18.8 Docker Logging
        18.8.1 GELF driver
        18.8.2 Fluentd driver
        18.8.3 Refactor log-generator-app to use Docker Logging Fluentd
        18.8.4 Performance tip: Unix Sockets
        18.8.5 Concatenate multiline logs with fluent-plugin-concat
        
What is next?