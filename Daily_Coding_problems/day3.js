/**
 * Good morning! Here's your coding interview problem for today.

This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. 
In other words, find the lowest positive integer that does not exist in the array.
 The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 */
// function posArr(arr) {
//     return arr.filter((num)=> {
//         return num>0;
//     })
// }
function sortArr(arr) {
     arr.sort((a,b)=> {
        return a-b;
     })
     return arr;
}
function mySolve(arr) {
    // let temp = posArr(arr);
    let newArr = sortArr(arr);
    let result=1 ;
    while (newArr.indexOf(result)>=0) {
        result++;

    }
    return result;
}
let arr = [1, 2, 0];
console.log(mySolve(arr));
