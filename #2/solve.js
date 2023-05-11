/**
 * @param {number[]} nums
 * @return {number}
 */
function total(arr,a){
    let sum=0;
    for (let i=a;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum;
  }
  let pivotIndex = (nums)=>{
    let sum = 0 ;
    let i = 0 ;
    let result;
    for (let item of nums){
      sum+=item;
      // console.log('--------',sum);
      result = total(nums,i);
      // console.log(`====`,result);
      if (result === sum){
        return i;
      }
      i++;
    }
     return -1;
  }
  console.log(pivotIndex([2,1,-1]))