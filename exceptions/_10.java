package exceptions;

public class _10 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("myclass");

	}
	/*
	 * Exception in thread "main" java.lang.ClassNotFoundException: myclass
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:375)
	at Jala/exceptions._10.main(_10.java:7)

	 */

}
