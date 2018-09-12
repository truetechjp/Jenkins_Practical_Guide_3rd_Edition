package jp.gihyo.jenkinsbook.action;

import org.junit.Test;

public class DirectoryTest {
	
	@Test
	public void test() {
		String currentDir = System.getProperty("user.dir");
		System.out.println("currentDir: " + currentDir);
	}

}
