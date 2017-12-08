# [Log Management with Graylog, Elasticsearch, MongoDB, Nginx, Fluentd and Docker](https://www.graylogbook.com)

![Graylog Book](/images/graylog-book.png)

In this hands-on book, you will learn how to centralize and manage logs using the awesome open source Graylog2 and create a scalable, high-throughput and high-available log processing production infrastructure deploying Elasticsearch and MongoDB clusters as well as Nginx on top of Docker containers. Besides, we will use Fluentd to send logs to many outputs, such as GELF and Amazon S3.
 
To make everything even more realistic, we will create our whole environment using different virtual machines managed by Vagrant (deploying everything to `localhost` is not that exciting, you know?). Just grab a beer, open a terminal, type `vagrant up` and have fun!

# Contents

## Why You Should Read This Book
## Part 1: Centralized Log Management

### Chapter 1: The DevOps culture

### Chapter 2: Centralized logging
- Have you ever? cat messages.log | grep -i "ERROR"
- Advantages and challenges

### Chapter 3: Introduction to Graylog
- Graylog components
- Set up Graylog with a single Docker container
- Graylog Web interface
- Send a "Hello World" message through Raw TCP Input

## Part 2: Graylog Production Setup

### Chapter 4: Elasticsearch
- Elasticsearch architecture
- Shards
- Replicas
- Types of Nodes: Master Elegible, Data and Client
- Understand elasticsearch.yml main properties
- Elasticsearch Docker image
- Spin up a 3-node cluster using Vagrant and Docker
- Understand Elasticsearch GREEN, YELLOW and RED status
- Monitoring Elasticsearch using plugins
- Elasticsearch Tuning Tips
  - File Descriptors
  - Disable swap
  - JVM HEAP size
  - JVM Garbage Collectors
  - Thread Pool
  - Flush interval
  - Number of shards
  - Number of replicas

### Chapter 5: MongoDB
- Replica Sets
- MongoDB Docker image
- Spin up a 2-node cluster using Vagrant and Docker

### Chapter 6: Graylog Server
- Understand graylog.conf main properties
- Graylog Docker image
- Spin up a 2-node cluster using Vagrant and Docker

### Chapter 7: Nginx
- Nginx overview
- Nginx as a Reverse Proxy
- Nginx Docker image
- Set up a Nginx Load Balancer using Vagrant and Docker

## Part 3: Send Logs to Graylog

### Chapter 8: Send server logs using Rsyslog (Syslog UDP)
### Chapter 9: Graylog Extractors
### Chapter 10: Graylog Streams
### Chapter 11: Graylog Alerts
- Create SMTP credentials on Amazon Simple Email Service (SES)
- Set up Graylog to send e-mail messages
- Send email alert when ssh access fail 3 times in a minute
  
### Chapter 12: Graylog Extended Log Format (GELF)
- Send GELF messages via HTTP
- Send GELF messages using curl

### Chapter 13: Book Sample App: log-generator-app (Spring Boot)
- Application endpoints
- Logback overview
- Log4j2 overview
- TCP vs UDP
- Send logs using Logback GELF appender
- Send logs using Log4j2 GELF appender
- Set up Nginx as a reverse proxy
- Install Nginx Content Pack in Graylog
- Send Nginx access and error logs to Graylog via Syslog UDP
- Graylog Dashboards
- Graylog Geolocation

## Part 4: Send Logs to Graylog using Fluentd

### Chapter 14: The mess diagram
- What if you need to store logs in Amazon S3?
  
### Chapter 15: Introduction to Fluentd
- Fluentd Docker image
- Fluentd example
- Fluentd Plugin Types
  - Input
  - Output
  - Buffer
  - Filter
  - Parser
  - Formatter

### Chapter 16: Fluent Single Instance
- Architecture diagram
- Set up Fluentd Single Instance architecture
- Send server logs to Fluentd using Rsyslog (Syslog UDP)
- Set up Fluentd to store logs in Amazon S3
- Rotate logs from Amazon S3 to Amazon Glacier
- Send Nginx logs to Fluentd via Syslog UDP
- Send log-application-app logs to Fluentd using Logback Fluentd Appender
    
### Chapter 17: Fluentd Tuning
- ulimit
- num_threads
- multi_process plugin

### Chapter 18: Fluent High Availability
- Architecture diagram
- Send server logs to Fluentd Forwarder using Rsyslog (Syslog UDP)
- Send Nginx logs to Fluentd Forwarder via Syslog UDP
- Set up Forwarders to load balance among Aggregator instances
- Set up Forwarders to write to disk in case of Aggregators outage
- Set up Aggregator instances to relay logs to Graylog via GELF
- Twelve-Factor Applications
  - XI: Logs
- Docker Logging
  - GELF driver
  - Fluentd driver
  - Refactor log-generator-app to use Docker Logging Fluentd
  - Performance tip: Unix Sockets
  - Concatenate multiline logs with fluent-plugin-concat
  
## What is next?

## Appendices