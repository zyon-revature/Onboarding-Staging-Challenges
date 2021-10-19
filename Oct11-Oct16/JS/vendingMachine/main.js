class Coin {
    constructor(name, value) {
        this.name = name;
        this.value = value;
    }
    display(){
        if( this.value >= 100){
            console.log("Item name: " + this.name + "\tCost: $" + this.value);
        }
        else {
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
const coins = [
    new Coin("fiveDollar", 500), new Coin("twoDollar", 200), new Coin("dollar", 100),
    new Coin("fiftyCents", 50), new Coin("twentyCents", 20), new Coin("tenCents", 10)
];
coinsDisplay = function(merch){
    merch.forEach(i => i.display());
};

// coinsDisplay(coins);
// console.log();

const products = [
    new Product("Chips", 100), new Product("Carmel Popcorn", 200), new Product("Popcorn", 100),
    new Product("Cinnamon Roll", 500), new Product("Pop", 500), new Product("Mints", 20), new Product("Gum", 10)
];

displayProducts = function(products) {
    products.forEach(product => console.log("%s: %d", product.name, product.cost));
};

displayProducts(products);

