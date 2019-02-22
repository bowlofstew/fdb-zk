package com.ph14.fdb.zk;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.proto.CreateRequest;
import org.apache.zookeeper.proto.CreateResponse;
import org.apache.zookeeper.proto.ExistsRequest;
import org.apache.zookeeper.proto.ExistsResponse;
import org.apache.zookeeper.proto.GetDataRequest;
import org.apache.zookeeper.proto.GetDataResponse;

import com.hubspot.algebra.Result;

public interface FdbZooKeeperLayer {

  Result<ExistsResponse, KeeperException> exists(ExistsRequest existsRequest);

  Result<CreateResponse, KeeperException> create(CreateRequest createRequest);

  Result<GetDataResponse, KeeperException> getData(GetDataRequest getDataRequest);

}