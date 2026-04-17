package com.xworkz.Chain;

class FancyChain extends Chain {

    boolean stoneWork;
    String lockType;

    FancyChain(String design, int length, double price, String[] occasions,
               ChainType type, Jeweller jeweller, boolean stoneWork, String lockType) {
        super(design, length, price, occasions, type, jeweller);
        this.stoneWork = stoneWork;
        this.lockType = lockType;
    }

    @Override
    void wearChain() {
        System.out.println("Wearing fancy chain with stylish look");
    }

    @Override
    void removeChain() {
        System.out.println("Removing fancy chain carefully");
    }

    @Override
    public String toString() {
        return super.toString() + ", FancyChain[stoneWork=" + stoneWork + ", lock=" + lockType + "]";
    }
}
