package com.company.generics;

import java.util.List;

/**
 * page 547
 */
interface SuperPower {
}

interface XRayVision extends SuperPower {
    void seeThroughWalls();
}

interface SuperHearing extends SuperPower {
    void hearSubtleNoises();
}

interface SuperSmell extends SuperPower {
    void trackSmell();
}

class SuperHero<POWER extends SuperPower> {
    POWER power;

    public SuperHero(POWER power) {
        this.power = power;
    }

    public POWER getPower() {
        return power;
    }
}

class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER> {

    public SuperSleuth(POWER power) {
        super(power);
    }

    void see() { power.seeThroughWalls();}
}

class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER> {

    public CanineHero(POWER power) {
        super(power);
    }
    void hear() { power.hearSubtleNoises();}
    void smell() { power.trackSmell();}
}

class SuperHearSmell implements SuperHearing, SuperSmell {

    @Override
    public void hearSubtleNoises() {
    }

    @Override
    public void trackSmell() {
    }
}

class DogBoy extends CanineHero<SuperHearSmell> {
    public DogBoy() {
        super(new SuperHearSmell());
    }
}

public class EpicBattle {

    static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
    }

    static <POWER extends SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
        hero.getPower().trackSmell();
    }

    public static void main(String[] args) {
        DogBoy dogBoy = new DogBoy();
        useSuperHearing(dogBoy);
        superFind(dogBoy);
        List<? extends SuperHearing> audioBoys;
//        List<? extends SuperHearing & SuperSmell> dogBoys;
    }

}




















