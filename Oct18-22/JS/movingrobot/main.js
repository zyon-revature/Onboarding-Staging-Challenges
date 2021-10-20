// This robot roams around a 2D grid. It starts at (0, 0) facing North. After each time it moves, the robot rotates 90
// degrees clockwise. Given the amount the robot has moved each time, you have to calculate the robot's final position.
//
// To illustrate, if the robot is given the movements 20, 30, 10, 40 then it will move:
//
//     20 steps North, now at (0, 20)
//     30 steps East, now at (30, 20)
//     10 steps South. now at (30, 10)
//     40 steps West, now at (-10, 10)
//     ...and will end up at coordinates (-10, 10).
//
// Examples:
//     trackRobot(20, 30, 10, 40) --> [-10, 10]
//
//     trackRobot() --> [0, 0]
//     *No movement means the robot stays at (0, 0).*
//
//     trackRobot(-10, 20, 10) --> [20, -20]
//     *the amount to move can be negative.*
//
// Notes:
//     Each movement is an integer (whole number).

class Robot {
    constructor() {
        this.position = [0, 0];
        this.instructionProcedure = 0;
        this.totalMovement = 0;
        this.justMoved = 0;
    }

    move(length) {

        let direction = null;
        this.justMoved = length;
        switch (this.instructionProcedure) {
            case 0:
                // Go North
                direction = "North";
                this.position[1] += length;
                this.instructionProcedure++;
                break;
            case 1:
                // Go East
                direction = "East";
                this.position[0] += length;
                this.instructionProcedure++;
                break;
            case 2:
                // Go South
                direction = "South";
                this.position[1] -= length;
                this.instructionProcedure++;
                break;
            case 3:
                // Go West
                direction = "West";
                this.position[0] -= length;
                this.instructionProcedure = 0;
                break;
            default:
                break;
        }
        this.totalMovement += length;
        this.getPositionAfterMove(length, direction);
    }

    trackMovement(...lengths) {
        for (let length of lengths) {
            this.move(length);
        }
    }

    getPositionAfterMove(length, direction) {
        console.log(`The robot moved ${length} steps ${direction}, located at (${this.position})`);
    }

    getPositionOutput() {
        console.log(`Robot located at (${this.position}). Moved a total of ${this.totalMovement} spaces.`);
    }

    getTotalMovement() {
        return this.totalMovement;
    }

    getPositon() {
        return this.position;
    }
}

let simon = new Robot();
simon.move(20);
simon.move(40);
simon.trackMovement(4, 15, 78, 5);
simon.trackMovement(5);
simon.trackMovement(19, 9);
simon.trackMovement(52, 45, 66);
simon.getPositionOutput();




