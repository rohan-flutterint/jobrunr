package org.jobrunr.quarkus.configuation;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;

@ConfigGroup
public class DatabaseConfiguration {

    /**
     * Allows to skip the creation of the tables - this means you should add them manually or by database migration tools like FlywayDB or Liquibase.
     */
    @ConfigItem(defaultValue = "false")
    public boolean skipCreate;

    /**
     * Allows to set the table prefix used by JobRunr
     */
    @ConfigItem
    public String tablePrefix;

}
