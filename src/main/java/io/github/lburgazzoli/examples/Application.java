package io.github.lburgazzoli.examples;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.apache.camel.quarkus.core.runtime.CamelRuntime;
import org.apache.camel.quarkus.core.runtime.StartedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    @Inject
    CamelRuntime runtime;

    void started(@Observes StartedEvent event) {
        LOGGER.info("my.property = {}", runtime.getContext().resolvePropertyPlaceholders("{{my.property}}"));
    }
}