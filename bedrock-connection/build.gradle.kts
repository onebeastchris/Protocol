dependencies {
    api(projects.bedrockCodec)
    api("dev.kastle.netty:netty-transport-raknet:1.1.0")
    api(libs.snappy)
}

tasks.jar {
    manifest {
        attributes("Automatic-Module-Name" to "org.cloudburstmc.protocol.bedrock.connection")
    }
}