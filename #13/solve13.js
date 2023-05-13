/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
let  twoSum = (nums,target)=>{
    let len=nums.length;
    let obj={};
       for (let i=0;i<len;++i)
         {
           let r= target - nums[i];
           if (obj[r]!==undefined)
           {
             return [nums.indexOf(r),i]
           }
           obj[nums[i]]=i;
         }
  }
 console.log(twoSum([2,7,11,15],9));
 /*Example 1:
 
 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 Example 2:
 
 Input: nums = [3,2,4], target = 6
 Output: [1,2]
 Example 3:
 
 Input: nums = [3,3], target = 6
 Output: [0,1] */