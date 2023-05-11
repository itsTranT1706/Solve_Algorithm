/**
 * @param {number[]} nums
 * @return {number[]}
 */
let runningSum  = (nums)=>{
    let array=[];
    let sum=0;
    // let length=nums.length
    for (let item of nums){
        sum+=item;
        array.push(sum);
    }
  return array;
}