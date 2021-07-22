package com.mps.rpc;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface HadoopRpcInterface extends VersionedProtocol {
    long versionID = 1L;

    int addNumber(int number1, int number2);

    String getNameByStuNumber(String stuNumber);
}
