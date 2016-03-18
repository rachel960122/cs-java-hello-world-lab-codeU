package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
    	String javav = System.getProperty("java.version");
    	int deciPos1 = javav.indexOf('.');
    	int deciPos2 = javav.indexOf('.', deciPos1 + 1);
    	String v = javav.substring(0, deciPos2);
        return Double.parseDouble(v);
    }

    public static void main(String[] args) {
	    System.out.println(getVersion());
    }
}
