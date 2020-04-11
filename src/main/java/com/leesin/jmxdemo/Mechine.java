package com.leesin.jmxdemo;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/11 11:22
 * @version: ${VERSION}
 * @modified By:
 */
public class Mechine implements MechineMBean {
    @Override
    public int getCpuCore() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public long getFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    @Override
    public void shutdown() {
        System.exit(0);
    }
}
