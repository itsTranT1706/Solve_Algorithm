function isTandemRepeat(inputString){
    let length = inputString.length;
    let mid  = Math.ceil(length/2);
    let str1="",str2="";
    if (length%2===1)
    {
      return false;
    }
  for (let i=0;i<mid;i++)
    {
       str1 +=inputString[i];
    }
  for (let i=mid;i<length;i++)
    {
       str2 +=inputString[i];
    }
return str1===str2;
    
}
// console.log(isTandemRepeat("concacconcaccc"))
/*
Input:"tandemtandem"
Actual output:
Expected output:true
Execute time limit :16000 ms
Execute time :
Message:

Input:"2w2ww"
Actual output:
Expected output:false
Execute time limit :16000 ms
Execute time :
Message:

*/