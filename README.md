# Testing Pivotal Web Server


## Running on [Pivotal Web Services][pws]

Log in.

```bash
cf login -a https://api.run.pivotal.io
```

Target your org / space.

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

```bash
cf push -n [subdomain]
```

[acceptance-test]:https://github.com/cloudfoundry-samples/pong_matcher_acceptance
[pws]:https://run.pivotal.io
[interaction]:https://github.com/cloudfoundry-samples/pong_matcher_rails/blob/master/README.md#interaction-instructions