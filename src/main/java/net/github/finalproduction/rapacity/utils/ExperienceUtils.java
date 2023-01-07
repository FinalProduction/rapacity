package net.github.finalproduction.rapacity.utils;

import net.minecraft.entity.player.PlayerEntity;

public class ExperienceUtils {

    public static int getPlayerXP(PlayerEntity player) {
        return (int)(ExperienceUtils.getExperienceForLevel(player.experienceLevel) + (player.experienceProgress * player.getNextLevelExperience()));
    }

    public static void addPlayerXP(PlayerEntity player, int amount) {
        int experience = getPlayerXP(player) + amount;
        player.totalExperience = experience;
        player.experienceLevel = ExperienceUtils.getLevelForExperience(experience);
        int expForLevel = ExperienceUtils.getExperienceForLevel(player.experienceLevel);
        player.experienceProgress = (experience - expForLevel) / (float)player.getNextLevelExperience();
    }

    public static int xpBarCap(int level) {
        if (level >= 30)
            return 112 + (level - 30) * 9;

        if (level >= 15)
            return 37 + (level - 15) * 5;

        return 7 + level * 2;
    }

    private static int sum(int n, int a0, int d) {
        return n * (2 * a0 + (n - 1) * d) / 2;
    }

    public static int getExperienceForLevel(int level) {
        if (level == 0) return 0;
        if (level <= 15) return sum(level, 7, 2);
        if (level <= 30) return 315 + sum(level - 15, 37, 5);
        return 1395 + sum(level - 30, 112, 9);
    }

    public static int getLevelForExperience(int targetXp) {
        int level = 0;
        while (true) {
            final int xpToNextLevel = xpBarCap(level);
            if (targetXp < xpToNextLevel) return level;
            level++;
            targetXp -= xpToNextLevel;
        }
    }

    public static float calculateStoredLevels(int storedXP)
    {
        float storedLevels = 0.0F;
        int xp = storedXP;

        while(xp > 0)
        {
            int xpToNextLevel = ExperienceUtils.xpBarCap((int)storedLevels);

            if(xp < xpToNextLevel)
            {
                storedLevels += (float)xp / xpToNextLevel;
                break;
            }

            xp -= xpToNextLevel;
            storedLevels += 1.0F;
        }

        return storedLevels;
    }

    public static int getXPToNextLevel(int currentXP)
    {
        int level = ExperienceUtils.getLevelForExperience(currentXP);
        int nextLevelXP = ExperienceUtils.getExperienceForLevel(level + 1);

        return nextLevelXP - currentXP;
    }

    public static void decreaseXP(PlayerEntity player, float amount)
    {
        if (player.totalExperience - amount <= 0)
        {
            player.experienceLevel = 0;
            player.experienceProgress = 0;
            player.totalExperience = 0;
            return;
        }

        player.totalExperience -= amount;

        if (player.experienceProgress * (float)ExperienceUtils.xpBarCap(player.experienceLevel) <= amount)
        {
            amount -= player.experienceProgress * (float)ExperienceUtils.xpBarCap(player.experienceLevel);
            player.experienceProgress = 1.0f;
            player.experienceLevel--;
        }

        while (ExperienceUtils.xpBarCap(player.experienceLevel) < amount)
        {
            amount -= ExperienceUtils.xpBarCap(player.experienceLevel);
            player.experienceLevel--;
        }

        player.experienceProgress -= amount / (float)ExperienceUtils.xpBarCap(player.experienceLevel);
    }
}
