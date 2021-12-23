package com.matrix.dc232fp.monster;

import java.util.Random;

public class Boss {
	private String[] monsterName;
	private static final Boss BOSS = new Boss();

	private Boss() {
		monsterName = new String[] { "����", "��ũ", "�ͽ�" };
	}

	public static Boss getBoss() {
		return BOSS;
	}

	public Monster summon() {
		Random r = new Random(); // ���� ���� �Ƚᵵ �ذᰡ���ϴ�
		int n = r.nextInt(monsterName.length);
		int lv = r.nextInt(50) + 1;
		return new Monster(monsterName[n],lv);
	}
}
