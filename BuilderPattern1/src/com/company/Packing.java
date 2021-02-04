package com.company;

interface Packing{

    String getPacking();
}

class Wrapper implements Packing{

    String type;
    Wrapper(){
        type = "wrapper";
    }
    @Override
    public String getPacking() {
        return this.type;
    }
}

class Bottle implements Packing{

    String type;
    Bottle(){
        type = "bottle";
    }
    @Override
    public String getPacking() {
        return this.type;
    }
}
