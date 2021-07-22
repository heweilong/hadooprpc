package com.mps.rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.net.InetSocketAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
//            HadoopRpcInterface hRpcIntface = RPC.getProxy(HadoopRpcInterface.class, 1L, new InetSocketAddress("0.0.0" +
//                    ".0", 8088), new Configuration());
//            int rslt = hRpcIntface.addNumber(1, 2);
//            System.out.println(rslt);
            HadoopRpcInterface hRpcIntface = (HadoopRpcInterface) RPC.waitForProxy(HadoopRpcInterface.class, 1L, new InetSocketAddress("0.0.0.0", 8088), new Configuration());
            Boolean query = true;
            while (query) {
                Scanner input = new Scanner(System.in);
                System.out.println("请输入学号:");
                String studNo = input.next();
                String stuName = hRpcIntface.getNameByStuNumber(studNo);
                System.out.println(stuName);
            }

        } catch (Exception e) {

        }
    }
}
