package com.ph14.fdb.zk;

import java.io.File;
import java.io.IOException;

import org.apache.zookeeper.server.ZooKeeperServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FdbZooKeeperServer extends ZooKeeperServer {

  private static final Logger LOG = LoggerFactory.getLogger(FdbZooKeeperServer.class);

  public FdbZooKeeperServer(File snapDir, File logDir, int tickTime) throws IOException {
    super(snapDir, logDir, tickTime);
  }

  @Override
  public void startup() {
    System.out.println("Starting up the server");
    super.startup();
  }

  @Override
  protected void setupRequestProcessors() {
    super.setupRequestProcessors();
    this.firstProcessor = new FdbRequestProcessor(sessionTracker, firstProcessor);
  }

}