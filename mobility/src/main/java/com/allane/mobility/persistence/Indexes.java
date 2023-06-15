/*
 * This file is generated by jOOQ.
 */
package com.allane.mobility.persistence;


import com.allane.mobility.persistence.tables.AmUser;
import com.allane.mobility.persistence.tables.FlywaySchemaHistory;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in allmob.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index FLYWAY_SCHEMA_HISTORY_FLYWAY_SCHEMA_HISTORY_S_IDX = Internal.createIndex(DSL.name("flyway_schema_history_s_idx"), FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS }, false);
    public static final Index AM_USER_INDX_AM_USER = Internal.createIndex(DSL.name("indx_am_user"), AmUser.AM_USER, new OrderField[] { AmUser.AM_USER.ID_USER, AmUser.AM_USER.NAME, AmUser.AM_USER.SURNAME }, false);
}
