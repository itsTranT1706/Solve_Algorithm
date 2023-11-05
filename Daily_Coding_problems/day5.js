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
        let length=message.length;
        if (length===1) {
            return 1;
        }
        if (int(message)>26) {
            return 0;
        }
        
        
        // return decoded(message.slice(length-1))+decoded(message.slice(length-2));
}
console.log(decoded("123456"));




