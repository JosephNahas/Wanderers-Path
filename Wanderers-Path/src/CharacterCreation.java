/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Joseph
 */
public class CharacterCreation extends Scenario {
    private int statPointsLeft;
    private int maxPointsPerStat;
    
    public CharacterCreation(Player player){
        this.scenarioName = "Character Creation";
        this.statPointsLeft = 25;
        this.maxPointsPerStat = player.getMaxStat() - player.getMinStat();
    }
    
    private void explainAllocation(Player player, String stat){ // prompt the player to allocate points into a stat
        Narrator.talk("Current " + stat + " is " + player.getMinStat());
        if (statPointsLeft > 0){
            Narrator.talk("Stat points left to allocate: " + this.statPointsLeft);
            Narrator.talk("Enter amount of points(max: " + maxPointsPerStat + ") to allocate to " + stat);
        } else {
            Narrator.talk("No points left to allocate. The stat will remain at the minimum of " + player.getMinStat());
            Narrator.enterContinue();
        }
    }
    
    private void collectStatInput(Player player, String stat){
        try{
            int input = Integer.parseInt(Narrator.getInput());
            if (input < 0){ // entered negative amount
                Narrator.talk("The entered amount was negative, the stat stayed at the minimum of " + player.getMinStat());
                input = 0;
            }
            if (statPointsLeft >= maxPointsPerStat){
                if (input > maxPointsPerStat){ // entered bigger amount than the maximum allowed for a stat
                    Narrator.talk("The entered amount exceeded " + maxPointsPerStat + ", the stat was set to the maximum of " + player.getMaxStat());
                    input = maxPointsPerStat;
                }
            } else {
                if (input > statPointsLeft){ // entered bigger amount than points left to allocate
                    Narrator.talk("The entered amount exceeded the amonut of points left to allocate. All remaining points were allocated to the stat.");
                    input = statPointsLeft;
                }
            }
            switch(stat){ // allocate points into each stat
                case "Strength": 
                    player.increaseStrength(input);
                    Narrator.talk("Strength: " + player.getStrength());
                    Narrator.talk("Press Enter to continue...");
                    Narrator.getInput();
                    break;
                case "Agility":
                    player.increaseAgility(input);
                    Narrator.talk("Agility: " + player.getAgility());
                    Narrator.talk("Press Enter to continue...");
                    Narrator.getInput();
                    break;
                case "Constitution":
                    player.increaseConstitution(input);
                    Narrator.talk("Constitution: " + player.getConstitution());
                    Narrator.talk("Press Enter to continue...");
                    Narrator.getInput();
                    break;
                case "Perception":
                    player.increasePerception(input);
                    Narrator.talk("Perception: " + player.getPerception());
                    Narrator.talk("Press Enter to continue...");
                    Narrator.getInput();
                    break;
                case "Luck":
                    player.increaseLuck(input);
                    Narrator.talk("Luck: " + player.getLuck());
                    Narrator.talk("Press Enter to continue...");
                    Narrator.getInput();
                    break;
                default:
            }
            statPointsLeft -= input;
        } catch (Exception e) { // invalid input, keep stat at minimum
            Narrator.talk("Input invalid. Stat stayed at the minimum of " + player.getMinStat());
            Narrator.enterContinue();
        }
    }
    
    private void setIndividualStat(Player player, String stat, String prompt){ 
        Narrator.talk(prompt);
        explainAllocation(player, stat);
        if (statPointsLeft > 0){
            collectStatInput(player, stat);
        }
    }
    
    private void setStats(Player player){
        Narrator.lineSeparator();
        Narrator.talk("You must set " + player.getName() + "'s stats...\nEach stat starts at a minimum of " + player.getMinStat() + " and can be increased to a maximum of " + player.getMaxStat());
        // Prompt each stat, then set stat based on the user input
        String strPrompt = "Increase your Strength. This stat governs your probability to succeed in tasks involving strength, and ability to wield heavy weapons such as maces";
        setIndividualStat(player, "Strength", strPrompt);
        Narrator.lineSeparator();
        String aglPrompt = "Increase your Agility. This stat governs your probability to succeed in tasks involving agility, and ability to wield fast weapons such as swords";
        setIndividualStat(player, "Agility", aglPrompt);
        Narrator.lineSeparator();
        String constPrompt = "Increase your Constitution. This stat governs your overall toughness and survivability";
        setIndividualStat(player, "Constitution", constPrompt);
        Narrator.lineSeparator();
        String perceptPrompt = "Increase your Perception. This stat governs your ability to spot loot and traps";
        setIndividualStat(player, "Perception", perceptPrompt);
        Narrator.lineSeparator();
        String luckPrompt = "Increase your luck. This stat governs your probability of avoiding danger";
        setIndividualStat(player, "Luck", luckPrompt);
        int constitutionCheck = 18;
        int higherMaxHealth = 250;
        int lowerMaxHealth = 200;
        // set max health based on constitution
        if (player.getConstitution() >= constitutionCheck){ 
            player.setMaxHealth(higherMaxHealth);
            player.setCurrentHealth(player.getMaxHealth());
        } else {
            player.setMaxHealth(lowerMaxHealth);
            player.setCurrentHealth(player.getMaxHealth());
        }
        Narrator.lineSeparator();
    }
    
    private void pickStartingWeapon(Player player){
        Narrator.lineSeparator();
        Narrator.talk("Pick your weapon...");
        Narrator.talk("1. Bow (scales with Perception)");
        Narrator.talk("2. Mace (scales with Strength)");
        Narrator.talk("3. Sword (scales with Agility)");
        String input = Narrator.getInput();
        switch (input){
            case "1":
                Bow bow = new Bow();
                player.setWeapon(bow);
                break;
            case "2":
                Mace mace = new Mace();
                player.setWeapon(mace);
                break;
            case "3":
                Sword sword = new Sword();
                player.setWeapon(sword);
                break;
            default:
                Narrator.talk("Invalid input. Try again!");
                pickStartingWeapon(player);
        }
        Narrator.lineSeparator();
    }
    
    @Override
    public Scenario run(Player player, Game game){ // set the player's name, stats and starting weapon
        Narrator.lineSeparator();
        Narrator.talk("Welcome to the Wanderer's Path character creation!\nEnter the name of your character:");
        String name = "";
        do{
            name = Narrator.getInput();
            if (name.replace(" ", "").length() == 0){
                Narrator.talk("You cannot leave your name empty, try again");
            }
        } while (name.replace(" ", "").length() == 0);
        player.setName(name);
        setStats(player);
        pickStartingWeapon(player);
        Narrator.talk("Your final character:");
        Narrator.talk("Name: " + player.getName());
        player.checkStats();
        Narrator.talk("Starting game.......");
        Narrator.enterContinue();
        game.increaseScenarioNumber();
        return nextScenario(game);
    }
}
