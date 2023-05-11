function checkStrongPassword(password){
    let s= password;
    let length = s.length;
    let kt1 = false;
    let kt2 = false;
    let kt3 = false;
    let kt4 = false;
    let p = "!@#$%^&*()-+";
    if (length<6)
    {
      return false;
    }
    for (let i=0;i<length;i++)
      {
        
      if (s[i] >= 65 && s[i] <= 90)
      {  
        kt1 = true;
      }  
      if (s[i] >= 97 && s[i] <= 122)
      {
        kt2 = true;
      }  
      if (s[i] >= 48 && s[i] <= 57)
      {
          kt4 = true;
      }  
      if (p.indexOf(s[i])!==-1)
      {
        return true;
      }
      }
return kt1&&kt2&&kt3&&kt4;

      
}
// console.log(checkStrongPassword("Aa1!"))
/*
The website considers a password to be strong if it satisfies the following criteria:

Its length is at least 6
It contains at least one digit (1234567890)
It contains at least one lowercase English character. (abc...z)
It contains at least one uppercase English character (ABC...Z)
It contains at least one special character. The special characters are: !@#$%^&*()-+
Given the password as a string, write the function to check the password is strong?

Example:

For password = "abc", the output should be
checkStrongPassword(password ) = false;
For password = "Aa1!", the output should be
checkStrongPassword(password ) = false;
For password = "Aabc1!", the output should be
checkStrongPassword(password ) = true;
*/
