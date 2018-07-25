package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bigmac {
    public final static String BUNWITHSESAME = "sesame";
    public final static String BUNWITHOUTSESAME = "without sesame";
    public final static String SAUCESTANDARD = "standard";
    public final static String SAUCETHOUSANDISLANDS = "1000 islands";
    public final static String SAUCEBARBECUE = "barbecue";
    public final static List<String> INGREDIENTS = new ArrayList<>(Arrays.asList("salad", "onion", "bacon", "cucumber", "pepper", "chili", "mushrooms", "shrimp", "cheese"));


    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder{
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build(){
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
        if(bun.equals(BUNWITHOUTSESAME) || bun.equals(BUNWITHSESAME)) {
            this.bun = bun;
        } else {
            throw new IllegalStateException("There is no such bun!");
        }
        this.burgers = burgers;
        if(sauce.equals(SAUCEBARBECUE) || sauce.equals(SAUCESTANDARD) || sauce.equals(SAUCETHOUSANDISLANDS) ) {
            this.sauce = sauce;
        } else{
            throw new IllegalStateException("There is no such sauce !");
        }
        for(int n = 0; n < ingredients.size(); n++) {
            if (INGREDIENTS.contains(ingredients.get(n))) {
                this.ingredients.add(ingredients.get(n));
            } else {
                throw new IllegalStateException("There is no such ingredient !");
            }
        }
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
