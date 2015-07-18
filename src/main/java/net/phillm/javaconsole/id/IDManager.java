package net.phillm.javaconsole.id;

import java.util.HashMap;

public class IDManager {

    /**
     *
     */
    public HashMap BlockInfo;

    public IDManager() {
        this.BlockInfo = new HashMap<>();
        BlockInfo.put("Wood", "5");
        BlockInfo.put("Air", "0");
        BlockInfo.put("Stone", "1");
        BlockInfo.put("Granite", "1:1");
        BlockInfo.put("Polished_Granite", "1:2");
        BlockInfo.put("Diorite", "1:3");
        BlockInfo.put("Polished_Diorite", "1:4");
        BlockInfo.put("Andesite", "1:5");
        BlockInfo.put("Polished_Andesite", "1:6");
        BlockInfo.put("Grass", "2");
        BlockInfo.put("Dirt", "3");
        BlockInfo.put("Coarse_Dirt", "3:1");
        BlockInfo.put("Podzol", "3:2");
        BlockInfo.put("Cobblestone", "4");
        BlockInfo.put("Spruce", "5:1");
        BlockInfo.put("Birch", "5:2");
        BlockInfo.put("Jungle", "5:3");
        BlockInfo.put("Acacia", "5:4");
        BlockInfo.put("Dark_Oak", "5:5");
        BlockInfo.put("Oak_Sapling", "6");
        BlockInfo.put("Spruce_Sapling", "6:1");
        BlockInfo.put("Birch_Sapling", "6:2");
        BlockInfo.put("Jungle_Sapling", "6:3");
        BlockInfo.put("Acacia_Sapling", "6:4");
        BlockInfo.put("Dark_Oak_Sapling", "6:5");
        BlockInfo.put("Bedrock", "7");
        BlockInfo.put("Flowing_Water", "8");
        BlockInfo.put("Still_Water", "9");
        BlockInfo.put("Flowing_Lava", "10");
        BlockInfo.put("Still_Lava", "11");
        BlockInfo.put("Sand", "12");
        BlockInfo.put("Red_Sand", "12:1");
        BlockInfo.put("Gravel", "13");
        BlockInfo.put("Gold_Ore", "14");
        BlockInfo.put("Iron_Ore", "15");
        BlockInfo.put("Coal_Ore", "16");
        BlockInfo.put("Oak_Wood", "17");
        BlockInfo.put("Spruce_Wood", "17:1");
        BlockInfo.put("Birch_Wood", "17:2");
        BlockInfo.put("Jungle_Wood", "17:3");
        BlockInfo.put("Oak_Leaves", "18");
        BlockInfo.put("Spruce_Leaves", "18:1");
        BlockInfo.put("Birch_Leaves", "18:2");
        BlockInfo.put("Jungle_Leaves", "18:3");
        BlockInfo.put("Sponge", "19");
        BlockInfo.put("Wet_Sponge", "19:1");
    }
}