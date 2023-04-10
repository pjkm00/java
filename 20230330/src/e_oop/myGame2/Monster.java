package e_oop.myGame2;

public class Monster {

	String name;
	int maxHp;
	int maxMp;
	int hp;
	int mp;
	int att;
	int def;
	int level;
	int exp;
	Item[] items;
	
	
	Monster(String name, int maxHp, int maxMp, int hp, int mp, int att, int def, Item[] items){
		this.name = name;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.hp = hp;
		this.mp = mp;
		this.att = att;
		this.def = def;
		this.items = items;
	}


	public Item itemDrop() {
		return items[(int)(Math.random()*items.length)];
	}
	
	public void attack(Charater c) {
		int damage = att - c.def;
		damage = damage <= 0 ? 1 : damage; //데미지가 0이거나 보다 작으면 1을 넣어주고 아니면 데미지 그대로
		c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
		System.out.println(name + "(이)가 공격으로 " + c.name + "에게 " + damage + "만큼 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 HP : " + c.hp);
	}
	
	
}
