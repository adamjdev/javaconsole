package net.phillm.javaconsole.id;

import java.util.HashMap;

public class IDManager {

    /**
     *
     */
    public HashMap blockInfo;

    public IDManager() {
        this.blockInfo = new HashMap<>();
        blockInfo.put("wood", "5");
        blockInfo.put("air", "0");
        blockInfo.put("stone", "1");
        blockInfo.put("granite", "1:1");
        blockInfo.put("polished_granite", "1:2");
        blockInfo.put("diorite", "1:3");
        blockInfo.put("polished_diorite", "1:4");
        blockInfo.put("andesite", "1:5");
        blockInfo.put("polished_andesite", "1:6");
        blockInfo.put("grass", "2");
        blockInfo.put("dirt", "3");
        blockInfo.put("coarse_dirt", "3:1");
        blockInfo.put("podzol", "3:2");
        blockInfo.put("cobblestone", "4");
        blockInfo.put("spruce", "5:1");
        blockInfo.put("birch", "5:2");
        blockInfo.put("jungle", "5:3");
        blockInfo.put("acacia", "5:4");
        blockInfo.put("dark_oak", "5:5");
        blockInfo.put("oak_sapling", "6");
        blockInfo.put("spruce_sapling", "6:1");
        blockInfo.put("birch_sapling", "6:2");
        blockInfo.put("jungle_sapling", "6:3");
        blockInfo.put("acacia_sapling", "6:4");
        blockInfo.put("dark_oak_sapling", "6:5");
        blockInfo.put("bedrock", "7");
        blockInfo.put("flowing_water", "8");
        blockInfo.put("still_water", "9");
        blockInfo.put("flowing_lava", "10");
        blockInfo.put("still_lava", "11");
        blockInfo.put("sand", "12");
        blockInfo.put("red_sand", "12:1");
        blockInfo.put("gravel", "13");
        blockInfo.put("gold_ore", "14");
        blockInfo.put("iron_ore", "15");
        blockInfo.put("coal_ore", "16");
        blockInfo.put("oak_wood", "17");
        blockInfo.put("spruce_wood", "17:1");
        blockInfo.put("birch_wood", "17:2");
        blockInfo.put("jungle_wood", "17:3");
        blockInfo.put("oak_leaves", "18");
        blockInfo.put("spruce_leaves", "18:1");
        blockInfo.put("birch_leaves", "18:2");
        blockInfo.put("jungle_leaves", "18:3");
        blockInfo.put("sponge", "19");
        blockInfo.put("wet_sponge", "19:1");
    }
}