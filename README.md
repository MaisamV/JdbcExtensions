# JdbcExtensions
This library provides functions to make working with JDBC easier

# Publish
In order to publish this library on mavenLocal follow bellow instructions
1. ```git clone https://github.com/MaisamV/JdbcExtensions.git```
2. ```cd ./JdbcExtensions```
3. ```./gradlew clean build```
4. ```./gradlew install```

In order to publish this library on private maven repository follow instructions
1. Set environmental variables ```artifactory_url```, ```artifactory_username```, ```artifactory_password``` and ```repository_name```
2. Open a NEW terminal in project directory, so the terminal will picks up updated environmental variables.
3. Update library version in build.gradle
4. ```./gradlew clean build```
5. ```./gradlew artifactoryPublish```

Now you can use this library in your projects like this:

```
repositories {
    mavenLocal()
    maven {
        allowInsecureProtocol true
        url "${System.getenv("artifactory_url")}/${System.getenv("repository_name")}"
    }
    mavenCentral()
    // other repositories ...
}
```
```
dependencies {
    implementation "com.mvs:JdbcExtensions:0.0.5"
    implementation <JDBC implementation of your choice>
    implementation "org.jetbrains.kotlin:kotlin-stdlib"
    // other libraries ...
}
```

done.