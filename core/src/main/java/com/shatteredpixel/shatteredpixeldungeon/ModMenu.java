package com.shatteredpixel.shatteredpixeldungeon;

import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Invisibility;
import com.shatteredpixel.shatteredpixeldungeon.items.Item;
import com.shatteredpixel.shatteredpixeldungeon.levels.Level;
import com.shatteredpixel.shatteredpixeldungeon.scenes.InterlevelScene;
import com.watabou.noosa.Game;

public class ModMenu {

	public static boolean hp = true;
	public static boolean str = true;
	public static boolean invulnerable = true;
	public static boolean stealth = true;
	public static boolean autoIdentify = true;
	public static boolean shop = true;
	public static boolean infTalent = true;
	public static boolean noLock = true;
	public static boolean infWand = true;
	public static boolean infItem = true;

	public static void toggleHP(boolean val) {
		hp = val;
		if (hp && Dungeon.hero != null && Dungeon.hero.isAlive()) {
			Dungeon.hero.HP = Dungeon.hero.HT;
		}
	}

	public static void toggleSTR(boolean val) {
		str = val;
		if (Dungeon.hero != null) {
			Dungeon.hero.updateHT(false);
		}
	}

	public static void toggleStealth(boolean val) {
		stealth = val;
		if (Dungeon.hero != null) {
			if (stealth) {
				Dungeon.hero.invisible = Math.max(Dungeon.hero.invisible, 1);
			} else if (Dungeon.hero.buff(Invisibility.class) == null) {
				Dungeon.hero.invisible = 0;
			}
		}
	}

	public static void toggleAutoIdentify(boolean val) {
		autoIdentify = val;
		if (autoIdentify && Dungeon.hero != null && Dungeon.hero.belongings != null) {
			for (Item item : Dungeon.hero.belongings) {
				item.identify();
			}
		}
	}

	public static void setStr(int val) {
		if (Dungeon.hero != null) {
			Dungeon.hero.STR = val;
			Dungeon.hero.updateHT(false);
		}
	}

	public static void doubleGold() {
		if (Dungeon.gold <= 0) {
			Dungeon.gold = 500;
		} else {
			Dungeon.gold *= 2;
		}
	}

	public static void doubleEnergy() {
		if (Dungeon.energy <= 0) {
			Dungeon.energy = 20;
		} else {
			Dungeon.energy *= 2;
		}
	}

	public static void doubleExp() {
		if (Dungeon.hero != null && Dungeon.hero.isAlive()) {
			int needed = Dungeon.hero.maxExp() - Dungeon.hero.exp;
			Dungeon.hero.earnExp(Math.max(needed, 10), null);
		}
	}

	public static void goToLevel(int targetDepth) {
		if (Dungeon.hero == null) return;
		try {
			Dungeon.hero.curAction = null;
			Level.beforeTransition();
			InterlevelScene.mode = InterlevelScene.Mode.RETURN;
			InterlevelScene.returnDepth = targetDepth;
			InterlevelScene.returnBranch = 0;
			InterlevelScene.returnPos = -1;
			Game.switchScene(InterlevelScene.class);
		} catch (Exception e) {
			ShatteredPixelDungeon.reportException(e);
		}
	}
}
