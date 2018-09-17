package jp.gihyo.jenkinsbook.action;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class DirectoryTest {
	
	@Test
	public void test() {
		String currentDir = System.getProperty("user.dir");
		System.out.println("currentDir: " + currentDir);
	}
	
	@Test
	public void ファイル作成のテスト() {
		try (
				FileWriter out = new FileWriter(new File("./src/test/resources/output.txt"));
				) {
			out.write("(1) output.txt");
			out.write("(2) output.txt");
			out.write(System.lineSeparator());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
