# Dockerised Liferay Workspace
> This repository has been created in order to give an example on how Docker containers can be easily managed inside Liferay Workspace using Gradle tasks. Please refer to this [blog article](https://web.liferay.com/it/web/glassofwhiskey/blog/-/blogs/liferay-and-docker-dockerised-liferay-workspace) for further details.

## How to use

The `docker-liferay-workspace-example` is intended to be used in place of `blade init` command to create your Liferay Workspace. You can simply clone or download it on your workspace folder and start to play with it.

## Description

Basically this project adds some Gradle tasks and properties to the original set provided by Liferay Workspace, in order to allow a simple container management. Those elements are commented below.
Moreover, it adds some additional files:
* `/docker/docker-compose.yml`: Docker Compose file that defines a Docker environment (containers, networks, volumes)
* `/configs/docker/portal-ext.properties`: properties file that defines Liferay container properties. In particular, it defines the liferay-home path, that must refer to the container file system
* `Dockerfile`: defines the Liferay image created by the `buildDockerImage` Gradle task

### Gradle Tasks

#### startDockerEnv

group: `docker`  
type: `Exec`

Inits docker project environment

#### stopDockerEnv

group: `docker`  
type: `Exec`

Shuts down docker project environment

#### buildDockerImage

group: `docker`  
type: `Exec`

Builds a Liferay Docker image based on the current local environment

### Gradle Properties

#### liferay.docker.container.prefix

type: `string`  
default: `liferay`

Set the Docker Compose project name. All containers, networks and volumes created by Docker Compose will be prefixed with this name

#### liferay.docker.compose.path

type: `string`  
default: `/docker/docker-compose.yml`

Set the Docker Compose file path. This file allows developers to start a set of Docker containers with a single gradle task

#### liferay.docker.image.name

type: `string`  
default: `liferay-portal:latest`

Set the generated Docker image name. The image created by dockerBuildImage Gradle task will have this tag

#### liferay.docker.db.root.password

type: `string`  
default: `p4ssword`

Set the root password for an external database container defined in Docker Compose file. Probably this property should be defined inside `gradle-local.properties` file, so that it can vary between different team members (see [net.saliman.properties](https://plugins.gradle.org/plugin/net.saliman.properties) Gradle plugin)