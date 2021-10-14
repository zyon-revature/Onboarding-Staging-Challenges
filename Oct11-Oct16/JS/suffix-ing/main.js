const testString = "sting coming bringing Letting sing going Ping king sHrink dOing";
const arr = testString.split(" ");   
var found = [];

function testRegex(arr){
    // let pattern = new RegExp("[a-z|A-Z]\{2\}[a-z|A-Z]*(ing$)");
    let pattern = new RegExp("([a-z\|A-Z])*[aeiou|AEIOU]+([a-z\|A-Z])*([i\|I][n\|N][g\|G]$)");
    let exists = pattern.test(arr);
    return exists;
}

arr.forEach(str => {
    if(testRegex(str) != null){
        console.log(str + ": " + testRegex(str));
        found.push(str);
    }
});





