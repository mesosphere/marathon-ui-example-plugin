# Marathon UI Example Plugin

---

⚠️ Please be aware that this is an example implementation and still experimental.
Use at your own risk.

---

### Prerequisite

Please make sure you've installed and properly configured the following software:

* [Docker 1.9](https://www.docker.com/)
* [sbt 0.13.8](http://www.scala-sbt.org/index.html)
* [Node 5](https://nodejs.org/en/blog/release/v5.0.0/) including [NPM](https://npmjs.org/)

### Setup

#### 1. Install all dependencies

	npm install

#### 2. Configure your hosts

If you're not using something like [dnsdock](https://github.com/tonistiigi/dnsdock) or [dinghy](https://github.com/codekitchen/dinghy) (OS X) for easy container discovery/access, please configure your hosts as follows:

	mesos-master.docker 192.168.99.100
	mesos-slave.docker  192.168.99.100
	marathon.docker     192.168.99.100

*Use `$ docker-machine ip $DOCKER_MACHINE_NAME` to get the current docker machine ip and add those lines to your `etc/hosts` configuration.*

#### 3. Build and pack the plugin

Before we can start the development environment, we need to initially build and pack the plugin to start the marathon with the correct plugin configuration. Use the following command to build and pack the plugin:

	npm run pack

You could alternatively use sbt to build and pack the plugin:

	sbt clean build pack
       
#### 4. Start your environment

The following command will download, configure and start a basic Zookeeper, Mesos and Marathon setup for you. It will also proxy the plugin for you, to eliminate the need to restart Marathon after every change.

	docker-compose up

Open http://marathon.docker:8080 and enjoy your plugin.

#### 5. Build your plugin

Running the following command will build your plugin and watch for file changes to rerun the build.

	npm run build -- --watch

#### 6. Release your cool new plugin

You could user either of the following commands to build and pack the plugin:

	npm run pack
	sbt clean build pack
