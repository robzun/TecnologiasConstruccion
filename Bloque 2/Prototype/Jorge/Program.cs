Enemy goblin1 = new Goblin("Tricky goblin 1", 10, 50);
Ability bonk = new Ability("bonk", "attack", 5, 10);
goblin1.Abilities.Add(bonk);
Enemy goblin2 = (Goblin)goblin1.Clone();
goblin2.name = "Mayatobli";
Enemy goblin3 = (Goblin)goblin1.Clone();
goblin3.name = "Goblinberto";
Enemy orc1 = new Orc("Henry Danger", 6, 80);
Ability smash = new Ability("smash", "attack", 8, 15);
orc1.Abilities.Add(smash);
Enemy orc2 = (Orc)orc1.Clone();
orc2.name = "Yuyoneitor";

Hero hero1 = new Hero("Héctoooooor", 12, 100);
Ability swordSlash = new Ability("sword slash", "attack", 7, 14);
hero1.Abilities.Add(swordSlash);
Ability heal = new Ability("heal", "heal", 30, 50);
hero1.Abilities.Add(heal);
Ability palmadaAria = new Ability("palmada aria", "special attack", 25, 40);
hero1.Abilities.Add(palmadaAria);

List<Enemy> enemies = new List<Enemy>();
enemies.Add(goblin1);
enemies.Add(goblin2);
enemies.Add(goblin3);
enemies.Add(orc1);
enemies.Add(orc2);

while(enemies.Count != 0){
    Console.WriteLine($"There are {enemies.Count} enemies left.");
    List<Enemy> defeatedEnemies = new List<Enemy>();
    foreach (Enemy tempEnemy in enemies){
        int turn = 0;
        while(tempEnemy.healthPoints > 0){
            turn++;
            if (turn % 2 != 0){
                Console.WriteLine($"You're fighting {tempEnemy.name}");
                Console.WriteLine($"What will you do?\n1.Attack\n2.Heal\n3.Special attack\n4.Enemy details\nLife points remaining: {hero1.healthPoints}\tCurrent Manna: {hero1.manna}");
                int decision = int.Parse(Console.ReadLine());
                switch(decision){
                    case 1:
                        tempEnemy.abilityImpact(swordSlash.cast());
                        hero1.cooldown(swordSlash);
                        break;
                    case 2:
                        if (hero1.manna > 50){
                            hero1.abilityImpact(heal.cast());
                            hero1.cooldown(heal);
                        }
                        break;
                    case 3:
                        if (hero1.manna == 100){
                            tempEnemy.abilityImpact(palmadaAria.cast());
                            hero1.cooldown(palmadaAria);
                        }
                        break;
                    case 4:
                        tempEnemy.description();
                        break;
                    default:
                        Console.WriteLine("Make no mistake!");
                        break;
                }
            } else{
                hero1.abilityImpact(bonk.cast());
            } if (hero1.healthPoints < 1){
                hero1.die();
                break;
            }
        } tempEnemy.healthPoints = 0;
        Console.WriteLine($"{tempEnemy.name} has fallen");
        defeatedEnemies.Add(tempEnemy);
        continue;
    } foreach (Enemy fallenEnemy in defeatedEnemies){
        enemies.Remove(fallenEnemy);
    }
}
Console.WriteLine($"You won!");