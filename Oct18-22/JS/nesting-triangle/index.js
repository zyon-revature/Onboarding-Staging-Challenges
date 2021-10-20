/*
    To find whether one triangle can fit inside another you must first find the area of each triangle
*/

class Triangle {
    constructor(sideA, sideB, sideC) {
        this._sideA = sideA;
        this._sideB = sideB;
        this._sideC = sideC;
        this.p = this.calculateP(sideA, sideB, sideC);
        this._area = this.calculateArea(sideA, sideB, sideC);
    }

    getSideA(){
        return this._sideA;
    }

    getSideB(){
        return this._sideB;
    }

    getSideC(){
        return this._sideC;
    }

    getArea(){
        return this._area;
    }


    calculateP(A, B, C){
        return (A + B + C)/2;
    }

    calculateArea(A, B, C){
        let p = this.calculateP(A, B, C);
        let result = p * (p-A) * (p-B) * (p-C);
        if (result < 0){
            result*=-1;
        }

        return Math.sqrt(result);
    }
}




function canNestTriangle(A, B){
    if (A.getArea() <= B.getArea()){
        return true;
    }
    return false;
}

function run(){
    let one = new Triangle(1, 3, 5);
    let two = new Triangle(2, 4, 7);

    console.log(canNestTriangle(one, two));


    let three = new Triangle(9, 11, 16);
    let four = new Triangle(3, 5, 7);

    console.log(canNestTriangle(three, four));


}


run();