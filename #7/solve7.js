function formatString(input){
    input = input.trim();
    let dem = 0;
    let map  = "";
    for (let i =0;i<input.length;++i)
      {
        if (map[map.length-1]===" "&&input[i]===" ")
        {
          map+="";
        }
        else
        {
        map +=input[i];        
        }
      }
    return map
  }
  // console.log(formatString("        a           "))
  /*
  Input:" abc   a aa  a a "
  Actual output:
  Expected output:"abc a aa a a"
  Execute time limit :16000 ms
  Execute time :
  Message:
  
  */