const testString = "sting coming bringing Letting sing going Ping king sHrink dOing";


function testRegex(txt) {
    let pattern = /[a-z|A-Z]*[aeiou|AEIOU]+[a-z|A-Z]*ing/g;
    let exists = txt.match(pattern);
    return exists;
}

var found = testRegex(testString);
console.log(found);