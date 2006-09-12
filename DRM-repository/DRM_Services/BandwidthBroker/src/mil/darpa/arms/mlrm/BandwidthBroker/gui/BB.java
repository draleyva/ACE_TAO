package mil.darpa.arms.mlrm.BandwidthBroker.gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class BB extends ProcessBox
{

   BB (Settings s)
   {
      super (s);
   }
   public void init ()
   {
      name = "Bandwidth Broker";
      setSize (new Dimension (150, 40));
   }


   String getHost ()
   {
      return s.get ("bb.host");
   }
   public String makeScript ()
   {
      String nss = s.get ("namingservice.server");
      String nsp = s.get ("namingservice.port");
      String deployd = s.get ("deploy.dir");
      String drmRoot = s.get ("drm.root");

      String rc = 
         ". ./.devInit; cd " + deployd + "\n " +
         "export ONS_PORT=" + nsp + "; export ONS_HOST=" + nss + "\n" +
	 "export ARMS_ROOT=. \n" +
	 "export DRM_ROOT=" + drmRoot + "\n" +
	 "export BBLOGPROP=" + s.get ("bb.logprop") + " \n" +
	 "export DBCONFIG=" + s.get ("bb.dbconfig") + " \n" +
	 "export TOPOLOGPROP=" + s.get ("bb.topology") + " \n" + 
	 ". ./bin/setup-classpath.sh \n " +
	 "java mil.darpa.arms.mlrm.BandwidthBroker.bb.server.BBServer " +
	 "$BBLOGPROP -ORBInitRef NameService=corbaloc::" + nss + ":" + nsp + 
	 "/NameService \n ";
      rc =
         "cd $DEPLOY \n" +
	 "cp cfg/BandwidthBroker/bbconfig.db1.prop cfg/BandwidthBroker/bbconfig.prop \n" +
         "export ONS_PORT=" + nsp + "; export ONS_HOST=" + nss + "\n" +
	 "export ARMS_ROOT=. \n" +
	 "export DRM_ROOT=" + drmRoot + "\n" +
	 "export BBLOGPROP=" + s.get ("bb.logprop") + " \n" +
	 "export DBCONFIG=" + s.get ("bb.dbconfig") + " \n" +
	 "export TOPOLOGPROP=" + s.get ("bb.topology") + " \n" + 
	 ". ./bin/setup-classpath.sh \n " +
	 "java mil.darpa.arms.mlrm.BandwidthBroker.bb.server.BBServer " +
	 "$BBLOGPROP -ORBInitRef NameService=corbaloc::" + nss + ":" + nsp + 
	 "/NameService -Djacorb.ior_proxy_host=192.168.100.2\n ";
      System.out.println (rc);
      return rc;
   }

}

