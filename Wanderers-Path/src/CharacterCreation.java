/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class CharacterCreation extends Scenario {
    private int statPointsLeft;
    private int maxPointsPerStat;
    
    public CharacterCreation(Game game){
        this.currentGame = game;
        this.scenarioName = "Character Creation";
        this.statPointsLeft = 25;
        this.maxPointsPerStat = this.currentGame.getPlayer().getMaxStat() - currentGame.getPlayer().getMinStat();
    }
    
    private void explainAllocation(String stat){
        Narrator.talk("Current " + stat + " is " + this.currentGame.getPlayer().getMinStat());
        if (statPointsLeft > 0){
            Narrator.talk("Stat points left to allocate: " + this.statPointsLeft);
            Narrator.talk("Enter amount of points(max: " + maxPointsPerStat + ") to allocate to " + stat);
        } else {
            Narrator.talk("No points left to allocate. The stat will remain at the minimum of " + this.currentGame.getPlayer().getMinStat());
        }
    }
    
    private void collectStatInput(String stat){
        try{
            int input = Integer.parseInt(Narrator.getInput());
            if (input < 0){
                Narrator.talk("The entered amount was less than 0, the stat stayed at the minimum of " + this.currentGame.getPlayer().getMinStat());
                input = 0;
            }
            if (statPointsLeft >= maxPointsPerStat){
                if (input > maxPointsPerStat){
                    Narrator.talk("The entered amount exceeded " + maxPointsPerStat + ", the stat was set to the maximum of " + this.currentGame.getPlayer().getMaxStat());
                    input = maxPointsPerStat;
                }
            } else {
                if (input > statPointsLeft){
                    Narrator.talk("The entered amount exceeded the amonut of points left to allocate. All remaining points were allocated to the stat.");
                    input = statPointsLeft;
                }
            }
            switch(stat){
                case "Strength":
                    this.currentGame.getPlayer().setStrength(input);
                    break;
                case "Agility":
                    this.currentGame.getPlayer().setAgility(input);
                    break;
                case "Constitution":
                    this.currentGame.getPlayer().setConstitution(input);
                    break;
                case "Perception":
                    this.currentGame.getPlayer().setPerception(input);
                    break;
                case "Luck":
                    this.currentGame.getPlayer().setLuck(input);
                    break;
                default:
            }
            statPointsLeft -= input;
        } catch (Exception e) {
            Narrator.talk("Input invalid. Stat stayed at the minimum of " + this.currentGame.getPlayer().getMinStat());
        }
    }
    
    private void setIndividualStat(String stat, String prompt){
        Narrator.talk(prompt);
        explainAllocation(stat);
        if (statPointsLeft > 0){
            collectStatInput(stat);
        }
    }
    
    private void setStats(){
        Narrator.talk("You must set " + this.currentGame.getPlayer().getName() + "'s stats...\nEach stat starts at a minimum of " + this.currentGame.getPlayer().getMinStat() + " and can be increased to a maximum of " + this.currentGame.getPlayer().getMaxStat());
        String strPrompt = "Increase your Strength. This stat governs your probability to succeed in tasks involving strength, and ability to wield heavy weapons such as maces";
        setIndividualStat("Strength", strPrompt);
        String aglPrompt = "Increase your Agility. This stat governs your probability to succeed in tasks involving agility, and ability to wield fast weapons such as swords";
        setIndividualStat("Agility", aglPrompt);
        String constPrompt = "Increase your Constitution. This stat governs your overall toughness and survivability";
        setIndividualStat("Constitution", constPrompt);
        String perceptPrompt = "Increase your Perception. This stat governs your ability to spot loot and traps";
        setIndividualStat("Perception", perceptPrompt);
        String luckPrompt = "Increase your luck. This stat governs your probability of avoiding danger";
        setIndividualStat("Luck", luckPrompt);
    }
    
    @Override
    public Scenario run(){
        
        Narrator.talk("Welcome to the Wanderer's Path character creation!\nEnter the name of your character:");
        this.currentGame.getPlayer().setName(Narrator.getInput());
        setStats();
        Narrator.talk("Your final character:");
        Narrator.talk("Name: " + this.currentGame.getPlayer().getName());
        Narrator.talk("Strength: " + this.currentGame.getPlayer().getStrength());
        Narrator.talk("Agility: " + this.currentGame.getPlayer().getAgility());
        Narrator.talk("Constitution: " + this.currentGame.getPlayer().getConstitution());
        Narrator.talk("Perception: " + this.currentGame.getPlayer().getPerception());
        Narrator.talk("Luck: " + this.currentGame.getPlayer().getLuck());
        Narrator.talk("Starting game.......");
        this.currentGame.scenarioNumber++;
        return nextScenario();
    }
}
