package io.github.lburgazzoli.examples;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    //@Inject
    //CamelRuntime runtime;


    void startup(@Observes StartupEvent event) {
        LOGGER.info("startup");
    }

    //void started(@Observes StartedEvent event) {
      //  LOGGER.info("my.property = {}", runtime.getContext().resolvePropertyPlaceholders("{{my.property}}"));
    //}
}