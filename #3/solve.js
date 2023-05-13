/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
let isIsomorphic = (s,t)=>{
    if (s===t){ return true};
     for (let i = 0;i<s.length-1;i++){
       for (let j=i+1;j<s.length;j++){
         if (s[i]===s[j]){
           if (t[i]===t[j]){
               return true;
           }
         }
       }
     }
   return false;
 }
 // console.log(isIsomorphic ("a","a"))
 /*Example 1:a
 
 Input: s = "egg", t = "add"
 Output: true
 Example 2:
 
 Input: s = "foo", t = "bar"
 Output: false
 Example 3:
 
 Input: s = "paper", t = "title"
 Output: true*/