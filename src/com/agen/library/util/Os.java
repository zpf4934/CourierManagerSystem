package com.agen.library.util;

/**
 * @author RockAgen
 *
 */
public class Os {
	/**
	 * @param args
	 * @return 
	 */
	public static String getStatus() {
		//获取系统信息
		String status="Java 运行时环境版本: "+System.getProperty("java.version")+"\n"+"Java 运行时环境供应商: "+System.getProperty("java.vendor")+"\n"+
	       "Java 运行时环境供应商: "+System.getProperty("java.vendor")+"\n"+"Java 供应商的 URL: "+System.getProperty("java.vendor.url")+"\n"+
	       "Java 虚拟机规范版本:"+System.getProperty("java.vm.specification.version")+"\n"+"Java 类路径:"+System.getProperty("java.class.path")+
	       "\n"+"操作系统的名称:  "+System.getProperty("os.name")+"\n"+"操作系统的架构:  "+System.getProperty("os.arch")+"\n"+
	       "操作系统的版本:  "+System.getProperty("os.version")+"\n"+"用户的账户名称:  "+System.getProperty("user.name")+"\n"+
	       "用户当前工作目录 :"+System.getProperty("user.dir");
	   return status;
		}


}
