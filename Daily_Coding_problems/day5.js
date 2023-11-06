/**
 * Good morning! Here's your coding interview problem for today.

This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message,
 count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.
 */

//SOLUTION 1;
function decoded(message) {
   let s=message;
   let n = s.length;
        let count = new Array(n + 1);
        count[0] = count[1] = 1;
        if(s.charAt(0) =='0')
            return 0;
        for (let i = 2; i <= n; i++)
        {
            count[i] = 0;

            if (s.charAt(i - 1) > '0')
                count[i] = count[i - 1];

            if (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2' && s.charAt(i - 1) < '7'))
                count[i] += count[i - 2];
        }
        return count[n];
   
}
console.log(decoded("54321"));




