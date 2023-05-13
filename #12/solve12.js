// //#1: solve=>
// const lineEncoding = (s) => 
//   {
//       return s.replace(/(\w)\1+/g, (m, x) => m.length + x);
//   }

//#2: solve=>
function lineEncoding(s){
    return s.replace(/(.)\1{0,}/g, (str, a) => `${str.length > 1 ? str.length : ''}${a}`)
}
/*
input: s="aabbbc"
output: "2a3bc"
*/