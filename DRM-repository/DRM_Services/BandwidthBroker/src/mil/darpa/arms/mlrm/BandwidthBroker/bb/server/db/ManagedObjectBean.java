//$Id: ManagedObjectBean.java
/*
 * ManagesObjectBean.java - bean class for ManagedObject
 *
 * The DARPA ARMS PROGRAM
 * This software is governed by Government Purpose Rights
 * Contract No: NBCHC030132
 * Telcordia Technologies, Inc.
 * 1 Technology Drive
 * Piscataway, NJ 08854-4157
 *
 *
 */


package mil.darpa.arms.mlrm.BandwidthBroker.bb.server.db;

/**
 * This bean class for ManagedObject
 *
 */

abstract class ManagedObjectBean extends TopBean implements ManagedObject
{
   ManagedObjectBean (java.sql.Connection c, String table, String fqn)
   {
      super (c, table, fqn);

      addToAllAttributes (ManagedObject.allAttr);
    
   }
}
