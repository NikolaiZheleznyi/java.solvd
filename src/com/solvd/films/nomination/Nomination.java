package com.solvd.films.nomination;

import com.solvd.films.feature.Feature;

public class Nomination {
        private Feature name;

        public Nomination(){

        };

        public Feature addName(Feature feature){
                this.name = feature;
                return this.name;
        }

        public void printInfo(){
                System.out.println(this.name.getName());
        }

        public void bestEditing(){
                System.out.println("Winner in nomination Best Edition");
        }
}
