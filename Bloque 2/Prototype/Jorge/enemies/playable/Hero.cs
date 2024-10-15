public class Hero{
    public string heroName {get; set;}
    public int level {get; set;}
    public int healthPoints {get; set;}
    public int manna = 0;
    public List<Ability> Abilities {get; set;}

    public Hero(string heroName, int level, int healthPoints){
        this.heroName = heroName;
        this.level = level;
        this.healthPoints = healthPoints;
        Abilities = new List<Ability>();
    }

    public void abilityImpact(int lifePointsChanged){
        healthPoints += lifePointsChanged;
        if (lifePointsChanged < 0){
            Console.WriteLine($"{heroName} has taken {lifePointsChanged} damage!");
        } else{
            Console.WriteLine($"{heroName} has recovered {lifePointsChanged}");
        }
    }

    public void cooldown(Ability ability){
        if (ability.type == "attack"){
            manna += 20;
        } else if (ability.type == "heal"){
            manna -= 50;
        } else if (ability.type == "special attack"){
            manna -= 100;
        }

        if(manna > 100){
            manna = 100;
        }
    }

    public void die(){
        if (healthPoints < 1){
            healthPoints = 0;
            Console.WriteLine($"{heroName} fainted! You have lost the game!");
        }
    }

    public void addAbility(Ability ability){
        Abilities.Add(ability);
    }

    public void description(){
        Console.WriteLine($"Hero: {heroName}\nLevel:{level}\nLife points: {healthPoints}\nManna: {manna}");
        Console.WriteLine("Abilities\n");
        foreach (Ability ability in Abilities){
            ability.showAbility();
        }
    }
}