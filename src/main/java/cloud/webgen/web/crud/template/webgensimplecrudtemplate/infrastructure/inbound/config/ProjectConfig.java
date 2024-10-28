package cloud.webgen.web.crud.template.webgensimplecrudtemplate.infrastructure.inbound.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cloud.webgen.web.crud.mongodb")
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class ProjectConfig{
}
