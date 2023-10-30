/**
This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the
 new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 If our input was [3, 2, 1], the expected output would be [2, 3, 6].
*/

// SOLUTION1:
// function mySolve(array) {
//   let result = [];
//   for (let i=0;i<array.length;++i) {
//     let item=1;
//     for (let j=0;j<array.length;++j) {
//       if (j!==i) {
//         item=item*array[j];
//       } 
//   }
//       result.push(item);
//   }
//   return result;
// }
// console.log(mySolve([1, 2, 3, 4, 5]))


//SOLUTION2 ; 
function mySolve(arr) {
  let length = arr.length;
  let left = new Array(length);
  let right = new Array(length);
  let pro = new Array(length);
  left[0] = 1;
  right[length - 1] = 1;
  for (let i = 1; i < length; ++i) {
    left[i] = arr[i - 1] * left[i - 1];
  }
  // console.log(left);
  for (let i = length - 2; i >= 0; --i) {
    right[i] = arr[i + 1] * right[i + 1];
  }
  // console.log(right);
  for (let i = 0; i < length; ++i) {
    pro[i] = left[i] * right[i];
  }
  return pro;
}
console.log(mySolve([10, 3, 5, 6, 2]))