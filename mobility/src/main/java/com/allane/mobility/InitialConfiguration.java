package com.allane.mobility;

import org.jooq.conf.RenderNameCase;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;

import static org.jooq.conf.RenderQuotedNames.EXPLICIT_DEFAULT_UNQUOTED;

@Configuration
public class InitialConfiguration {

    private final DataSource dataSource;

    public InitialConfiguration(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public DataSourceConnectionProvider connectionProvider() {
        return new DataSourceConnectionProvider
                (new TransactionAwareDataSourceProxy(dataSource));
    }

    @Bean
    public DefaultDSLContext dsl() {
        return new DefaultDSLContext(configuration());
    }

    public DefaultConfiguration configuration() {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
        jooqConfiguration.set(connectionProvider());
        jooqConfiguration.settings().setRenderNameCase(RenderNameCase.AS_IS);
        jooqConfiguration.settings().setRenderSchema(Boolean.FALSE);
        jooqConfiguration.settings().setRenderNameCase(RenderNameCase.AS_IS);
        jooqConfiguration.settings().setRenderQuotedNames(EXPLICIT_DEFAULT_UNQUOTED);
        jooqConfiguration.settings().setRenderFormatted(Boolean.FALSE);
        return jooqConfiguration;
    }

}
