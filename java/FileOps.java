package com.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOps {

	public static void main(String[] args) {

		try {
			// Write the content to the file
//			BufferedWriter writer = new BufferedWriter(new FileWriter("src/fileio.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("src/fileio.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("src/fileio.txt", true));

			writer.newLine();
			writer.write("new in code");

			writer.close();
			String line;

			// Read and print each line until the end of the file
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
//			writer.write(content);

			System.out.println("Text written to file successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
