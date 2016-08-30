# Testing Pivotal Web Server


## Running on [Pivotal Web Services][pws]

Log in.

```bash
cf login -a https://api.run.pivotal.io
```

Target your org / space. // no need to use this command

```bash
cf target -o [myorg] -s [myspace]
```

Sign up for a cleardb instance.

```bash
cf create-service cleardb spark mysql
```

Build the app.

```bash
brew install maven
mvn package
```

Push the app. Its manifest assumes you called your ClearDB instance 'mysql'.
// for [subdomain], enter whatever you want.

```bash
cf push -n [subdomain]
```

## Running on local server

1. in application.yml
```bash
---
spring:
  datasource:
    driverClassName: com.mysql.jdbc.Driver
    url: jdbc:mysql://localhost/testdb
    username: testproject
    password: testproject
  jpa:
    hibernate.ddl-auto: none
    show_sql: false

```
It uses databses with name "testdb" and user with username "testproject" and password "testproject"
So either create user "testproject" [recommended]
or modify application.yml with your settings. [not recommended]

2. The program initialize the database with default value, so drop table "record" in "testdb" if existing
otherwise it may cause problem.


[acceptance-test]:https://github.com/cloudfoundry-samples/pong_matcher_acceptance
[pws]:https://run.pivotal.io
[interaction]:https://github.com/cloudfoundry-samples/pong_matcher_rails/blob/master/README.md#interaction-instructions