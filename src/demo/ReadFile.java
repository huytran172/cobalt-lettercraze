package demo;

import java.io.File;
import player.models.Puzzle;

public class ReadFile {
	public static void main(String[] args) {
		String targetDir = "../cobalt-lettercraze/levels";
		File dir = new File(targetDir);
		File[] files = dir.listFiles();
		
		for (File f: files) {
			Puzzle puzzle = new Puzzle(f);
			System.out.println(puzzle.toString());
		}
	}
}
