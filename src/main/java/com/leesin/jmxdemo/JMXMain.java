package com.leesin.jmxdemo;

import javax.management.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/11 11:23
 * @version: ${VERSION}
 * @modified By:
 */
public class JMXMain {
    public static void main(String[] args) throws NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, MalformedObjectNameException, IOException {

        System.out.println(Runtime.getRuntime().availableProcessors());

        //一下这段功能是将信息输出到jconsole
        //平常想要自己后的信息只需要 runtime.xxxxxxx就行了

        MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName on=new ObjectName("com.leesin.jmxdemo.Mechine:type=mechine");
        MechineMBean mechineMBean=new Mechine();
        beanServer.registerMBean(mechineMBean,on);
        System.in.read();


    }

    // public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, IOException {
    //     MBeanServer beanServer= ManagementFactory.getPlatformMBeanServer();
    //     ObjectName on=new ObjectName("com.gupaoedu.example.springbootstarterdemo.jmxdemo.Mechine:type=mechine");
    //     MechineMBean mechineMBean=new Mechine();
    //     beanServer.registerMBean(mechineMBean,on);
    //     System.in.read();
    // }
}
