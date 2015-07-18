package net.phillm.javaconsole.id;

import java.util.HashMap;

public class IDManager {

    /**
     *
     */
    public HashMap blockInfo;

    public IDManager() {
        this.blockInfo = new HashMap<>();
        blockInfo.put("Wood", "5");
        blockInfo.put("Air", "0");
        blockInfo.put("Stone", "1");
        blockInfo.put("Granite", "1:1");
        blockInfo.put("Polished_Granite", "1:2");
        blockInfo.put("Diorite", "1:3");
        blockInfo.put("Polished_Diorite", "1:4");
        blockInfo.put("Andesite", "1:5");
        blockInfo.put("Polished_Andesite", "1:6");
        blockInfo.put("Grass", "2");
        blockInfo.put("Dirt", "3");
        blockInfo.put("Coarse_Dirt", "3:1");
        blockInfo.put("Podzol", "3:2");
        blockInfo.put("Cobblestone", "4");
        blockInfo.put("Spruce", "5:1");
        blockInfo.put("Birch", "5:2");
        blockInfo.put("Jungle", "5:3");
        blockInfo.put("Acacia", "5:4");
        blockInfo.put("Dark_Oak", "5:5");
        blockInfo.put("Oak_Sapling", "6");
        blockInfo.put("Spruce_Sapling", "6:1");
        blockInfo.put("Birch_Sapling", "6:2");
        blockInfo.put("Jungle_Sapling", "6:3");
        blockInfo.put("Acacia_Sapling", "6:4");
        blockInfo.put("Dark_Oak_Sapling", "6:5");
        blockInfo.put("Bedrock", "7");
        blockInfo.put("Flowing_Water", "8");
        blockInfo.put("Still_Water", "9");
        blockInfo.put("Flowing_Lava", "10");
        blockInfo.put("Still_Lava", "11");
        blockInfo.put("Sand", "12");
        blockInfo.put("Red_Sand", "12:1");
        blockInfo.put("Gravel", "13");
        blockInfo.put("Gold_Ore", "14");
        blockInfo.put("Iron_Ore", "15");
        blockInfo.put("Coal_Ore", "16");
        blockInfo.put("Oak_Wood", "17");
        blockInfo.put("Spruce_Wood", "17:1");
        blockInfo.put("Birch_Wood", "17:2");
        blockInfo.put("Jungle_Wood", "17:3");
        blockInfo.put("Oak_Leaves", "18");
        blockInfo.put("Spruce_Leaves", "18:1");
        blockInfo.put("Birch_Leaves", "18:2");
        blockInfo.put("Jungle_Leaves", "18:3");
        blockInfo.put("Sponge", "19");
        blockInfo.put("Wet_Sponge", "19:1");
    }
}