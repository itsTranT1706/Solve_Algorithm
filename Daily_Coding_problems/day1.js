/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/

//solution : 
function mySolve(list, k) {
    let length = list.length;
    let hashMap = {};
    // console.log(k);
    for (let i = 0; i < length; ++i) {
        let temp = k - list[i];
        if (hashMap[temp] !== undefined) {
            return true;
        }
        else {
            hashMap[list[i]] = i;
        }
    }
    return false;
}

console.log(mySolve([10, 15, 3, 7], 10));
