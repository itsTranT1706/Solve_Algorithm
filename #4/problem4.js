//JavaScript
let check = (s1,s2,result)=>
  {
    let length= s1.length;
    let kt=true;
    let i=0;
    while (i<length)
      {
        if (result[i]!==s1[i]&&result[i]!==s2[i])
        {
            return false;
        }
        i++;
      }
    return kt;
  }
function stringsCrossover(inputArray,result){
      let lengthArr=inputArray.length;
      let count = 0;
      for (let i =0;i<lengthArr-1;++i)
        {
          for (let j=i+1;j<lengthArr;++j)
            {
              if (check(inputArray[i],inputArray[j],result))
              {
                count++;
              }
            }
        }
  return count;
}
/*Input:["abc",   "aaa",   "aba",   "bab"],"bbb"
Actual output:2
Expected output:2
Execute time limit :16000 ms
Execute time :1 ms
Message:
Right answer*/