package com.mps.rpc;

import org.apache.hadoop.ipc.ProtocolSignature;

import java.io.IOException;

public class HadoopRpcInterfaceImpl implements HadoopRpcInterface {
    @Override
    public int addNumber(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public String getNameByStuNumber(String stuNumber) {
        System.out.println("stuNumber:"+stuNumber);
        switch (String.valueOf(stuNumber)) {
            case "20210123456789":
                return "心心";
            case "20210123456790":
                return "心心1";
        }
        return null;
    }

    @Override
    public long getProtocolVersion(String protocol, long clientVersion) throws IOException {
        return HadoopRpcInterfaceImpl.versionID;
    }

    @Override
    public ProtocolSignature getProtocolSignature(String s, long l, int i) throws IOException {
        return null;
    }
}
