package com.leesin.jmxdemo;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/11 11:22
 * @version: ${VERSION}
 * @modified By:
 */
//把需要发布出去的指标信息,通过MB来进行发布
public interface MechineMBean {
    //属性、  操作

    int getCpuCore();

    long getFreeMemory();

    void shutdown();
}
