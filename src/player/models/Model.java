package player.models;

import java.io.File;

public class Model {
	Level levels[] = new Level[16];
	
	public Level[] getLevels() {
		return levels;
	}

	public void setLevels(Level[] levels) {
		this.levels = levels;
	}

	public Model() {
		String targetDir = "../cobalt-lettercraze/levels";
		File dir = new File(targetDir);
		File[] files = dir.listFiles();
		
		int i = 1;
		for (File f: files) {
			String name = f.getName();
			if (! name.startsWith("Level")) continue;
			int levelNum;
			if (name.length() == 10) {
				levelNum = Integer.parseInt(name.substring(5, 6));
			} else {
				levelNum = Integer.parseInt(name.substring(5, 7));
			}
			if (levelNum % 3 == 1) {
				this.levels[levelNum] = new Puzzle(f);
				System.out.println(this.levels[levelNum]);
			}
			
			if (levelNum % 3 == 2) {
				System.out.println(this.levels[levelNum]);
				this.levels[levelNum] = new Lightning(f);
			}
			
			if (levelNum % 3 == 0) {
				System.out.println(this.levels[levelNum]);
				this.levels[levelNum] = new Theme(f);
			}
		}
	}
	
	public boolean isPreviousLevelComplete(Level l) {
		if (l.index == 1) return true;
		for (int i = 2; i < this.levels.length; i++) {
			if (this.levels[i] == l) {
				return levels[i-1].getScore().getHighScore() >= levels[i-1].getScore().getThreshold()[0];
			}
		}
		
		return false;
	}
}
