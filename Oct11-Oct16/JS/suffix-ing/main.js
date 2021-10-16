const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function testRegex(txt){
    let pattern = /[a-z|A-Z]*[aeiou|AEIOU]+[a-z|A-Z]*ing/g;
    return txt.match(pattern);
}

rl.question("Enter text: ", function(input) {
    var found = testRegex(input);
   console.log("Word(s) matching parameters: ");
   console.log(found);

   rl.close();
});

rl.on("close", function () {
    process.exit(0);
});





