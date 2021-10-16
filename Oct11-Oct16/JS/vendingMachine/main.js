class Coin {
    constructor(name, value) {
        this.name = name;
        this.value = value;
    }

    display(){
        if(value >= 100){
            console.log("Item name: " + this.name + "\tCost: $" + this.value);
        }
        else
        {
            console.log("Item name: " + this.name + "\tCost: " + this.value + "¢");
        }

    }
}
class Product {
    constructor(name, cost) {
        this.name = name;
        this.cost = cost;
    }
}

const Coins = [
    new Coin("fiveDollar", 500), new Coin("twoDollar", 200), new Coin("dollar", 100),
    new Coin("fiftyCents", 50), new Coin("twentyCents", 20), new Coin("tenCents", 10)
];

vendingDisplay = function(){

    return null;
}

console.log(Coins[0]);